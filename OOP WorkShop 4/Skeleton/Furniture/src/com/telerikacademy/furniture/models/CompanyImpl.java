package com.telerikacademy.furniture.models;

import com.telerikacademy.furniture.models.common.Validator;
import com.telerikacademy.furniture.models.contracts.Company;
import com.telerikacademy.furniture.models.contracts.Furniture;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompanyImpl implements Company {

  private static final String NAME_NULL_EXCEPTION = "Company name should't be mull.";
  private static final String NAME_EMPTY_VALUE_EXCEPTION = "Name should't be empty value.";
  private static final int NAME_VALUE_MIN_LIMIT = 5;
  private static final String NAME_MIN_VALUE_LENGTH_EXCEPTION = "Name shouldn't be less than 5 symbols.";
  private static final int EXACT_REGISTRATION_NUMBER_LENGTH = 10;
  private static final String REGISTRATION_NUMBER_INVALID_EXCEPTION = "Registration number is not valid";
  private static final String FURNITURE_NULL_EXCEPTION = "Furniture should't be null.";
  private static final String COMPANY_MODEL_NULL_EXCEPTION = "Model shouldn't be null.";

  private String name;
  private String registrationNumber;
  private List<Furniture> furnitures;

  public CompanyImpl(String name, String registrationNumber) {
    setName(name);
    setRegistrationNumber(registrationNumber);
    furnitures = new ArrayList<>();
  }

  @Override
  public String getName() {
    return name;
  }

  private void setName(String name) {
    Validator.validateForNull(name, NAME_NULL_EXCEPTION);
    Validator.validateForEmptyValue(name, NAME_EMPTY_VALUE_EXCEPTION);
    Validator.validateFieldLessThan(name.length(), NAME_VALUE_MIN_LIMIT, NAME_MIN_VALUE_LENGTH_EXCEPTION);

    this.name = name;
  }

  @Override
  public String getRegistrationNumber() {
    return registrationNumber;
  }

  private void setRegistrationNumber(String registrationNumber) {
    Validator.validateCompanyRegistrationNumber(registrationNumber,
            EXACT_REGISTRATION_NUMBER_LENGTH,
            REGISTRATION_NUMBER_INVALID_EXCEPTION);

    this.registrationNumber = registrationNumber;
  }

  @Override
  public List<Furniture> getFurnitures() {
    return new ArrayList<>(furnitures);
  }

  @Override
  public void add(Furniture furniture) {
    Validator.validateForNull(furniture, FURNITURE_NULL_EXCEPTION);

    furnitures.add(furniture);
  }

  public void remove(Furniture furniture) {
    furnitures.remove(furniture);
  }

  public Furniture find(String model) {
    Validator.validateForNull(model, COMPANY_MODEL_NULL_EXCEPTION);

    return furnitures.stream()
            .filter(x -> x.getModel().equalsIgnoreCase(model))
            .findFirst()
            .orElse(null);
  }

  public String catalog() {
    StringBuilder builder = new StringBuilder();

    builder.append(String.format("%s - %s - %s %s%n",
            name,
            registrationNumber,
            furnitures.isEmpty() ? "no" : String.format("%d", furnitures.size()),
            furnitures.size() == 1 ? "furniture" : "furnitures"));

    furnitures.sort(Comparator.comparing(Furniture::getPrice).thenComparing(Furniture::getModel));

    for (Furniture furniture : furnitures) {
      builder.append(String.format("%s%n", furniture.toString()));
    }

    return builder.toString().trim();
  }
}
