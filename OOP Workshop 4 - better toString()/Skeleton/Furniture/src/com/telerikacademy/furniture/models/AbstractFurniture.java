package com.telerikacademy.furniture.models;

import com.telerikacademy.furniture.models.common.Validator;
import com.telerikacademy.furniture.models.contracts.Furniture;
import com.telerikacademy.furniture.models.enums.MaterialType;

public abstract class AbstractFurniture implements Furniture {

  private static final String MODEL_NULL_EXCEPTION = "Model should't be null.";
  private static final String MODEL_EMPTY_VALUE_EXCEPTION = "Model shouldn't be empty value.";
  private static final int MODEL_MIN_LENGTH_LIMIT = 3;
  private static final String MODEL_MIN_LENGTH_EXCEPTION = "Model length should't be less than 3 symbols.";
  private static final double PRICE_VALUE_MIN_LIMIT = 0D;
  private static final String PRICE_NEGATIVE_OR_EQUAL_TO_0_EXCEPTION = "Price should be positive number.";
  private static final double HEIGHT_VALUE_MIN_LIMIT = 0D;
  private static final String HEIGHT_VALUE_NEGATIVE_EXCEPTION = "Height should be positive number.";

  private String model;
  private MaterialType materialType;
  private double price;
  private double height;

  AbstractFurniture(String model, MaterialType materialType, double price, double height) {
    setModel(model);
    this.materialType = materialType;
    setPrice(price);
    setHeight(height);
  }

  @Override
  public String getModel() {
    return model;
  }

  private void setModel(String model) {
    Validator.validateForNull(model, MODEL_NULL_EXCEPTION);

    Validator.validateForEmptyValue(model, MODEL_EMPTY_VALUE_EXCEPTION);

    Validator.validateFieldLessThan(model.length(), MODEL_MIN_LENGTH_LIMIT, MODEL_MIN_LENGTH_EXCEPTION);

    this.model = model;
  }

  @Override
  public MaterialType getMaterialType() {
    return materialType;
  }

  @Override
  public double getPrice() {
    return price;
  }

  private void setPrice(double price) {
    Validator.validateFieldLessThanOrEqual(price, PRICE_VALUE_MIN_LIMIT, PRICE_NEGATIVE_OR_EQUAL_TO_0_EXCEPTION);

    this.price = price;
  }

  @Override
  public double getHeight() {
    return height;
  }

  protected void setHeight(double height) {
    Validator.validateFieldLessThanOrEqual(height, HEIGHT_VALUE_MIN_LIMIT, HEIGHT_VALUE_NEGATIVE_EXCEPTION);

    this.height = height;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();

    String type = getType();
    String additionalDetails = getAdditionalDetails();

    builder
            .append(type)
            .append(", ")
            .append(baseDetails())
            .append(", ")
            .append(additionalDetails);

    return builder.toString();
  }

  private String baseDetails() {
    StringBuilder builder = new StringBuilder();

    builder
            .append(String.format("Model: %s, Material: %s, Price: %.2f, Height: %.2f",
                    getModel(),
                    getMaterialType(),
                    getPrice(),
                    getHeight()));

    return builder.toString();
  }

  protected abstract String getType();

  protected abstract String getAdditionalDetails();
}
