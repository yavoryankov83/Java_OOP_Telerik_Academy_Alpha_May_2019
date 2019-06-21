package com.telerikacademy.cosmetics.models.products;

import com.telerikacademy.cosmetics.models.common.GenderType;
import com.telerikacademy.cosmetics.models.common.ProductConstants;
import com.telerikacademy.cosmetics.models.common.ProductExceptions;
import com.telerikacademy.cosmetics.models.common.ProductValidator;
import com.telerikacademy.cosmetics.models.contracts.Product;

public abstract class AbstractProduct implements Product {

  private String name;
  private String brand;
  private double price;
  private GenderType gender;

  AbstractProduct(String name, String brand, double price, GenderType gender) {
    setName(name);
    setBrand(brand);
    setPrice(price);
    this.gender = gender;
  }

  @Override
  public String getName() {
    return name;
  }

  private void setName(String name) {
    ProductValidator.validateNameForNull(name, ProductExceptions.NAME_NULL_EXCEPTION);
    ProductValidator.validateStringLength(name, getNameMinLength(), getNameMaxLength(), ProductExceptions.NAME_LENGTH_EXCEPTION);

    this.name = name;
  }

  //helper method
  int getNameMinLength() {
    return ProductConstants.SHAMPOO_TOOTHPASTE_NAME_MIN_LENGTH;
  }

  //helper method
  int getNameMaxLength() {
    return ProductConstants.SHAMPOO_TOOTHPASTE_NAME_MAX_LENGTH;
  }

  @Override
  public String getBrand() {
    return brand;
  }

  private void setBrand(String brand) {
    ProductValidator.validateBrandForNull(brand, ProductExceptions.BRAND_NULL_EXCEPTION);
    ProductValidator.validateStringLength(brand, getBrandMinLength(), getBrandMaxLength(), ProductExceptions.BRAND_LENGTH_EXCEPTION);

    this.brand = brand;
  }

  //helper method
  int getBrandMinLength() {
    return ProductConstants.SHAMPOO_TOOTHPASTE_BRAND_MIN_LENGTH;
  }

  //helper method
  int getBrandMaxLength() {
    return ProductConstants.SHAMPOO_TOOTHPASTE_BRAND_MAX_LENGTH;
  }

  @Override
  public double getPrice() {
    return price;
  }

  private void setPrice(double price) {
    ProductValidator.validatePrice(price, getMinPrice(), ProductExceptions.PRICE_NEGATIVE_EXCEPTION);

    this.price = price;
  }

  //helper method
  double getMinPrice() {
    return ProductConstants.SHAMPOO_TOOTHPASTE_PRICE_MIN_VALUE;
  }

  @Override
  public GenderType getGender() {
    return gender;
  }

  @Override
  public String print() {
    StringBuilder builder = new StringBuilder();

    builder
            .append(String.format("#%s %s%n", getName(), getBrand()))
            .append(String.format(" #Price: $%.2f%n", getPrice()))
            .append(String.format(" #Gender: %s%n", getGender()))
            .append(printDetails())
            .append(" ===");

    return builder.toString();
  }

  abstract String printDetails();
}
