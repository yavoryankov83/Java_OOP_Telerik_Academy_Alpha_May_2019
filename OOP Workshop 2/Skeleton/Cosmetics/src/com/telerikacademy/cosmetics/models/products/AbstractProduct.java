package com.telerikacademy.cosmetics.models.products;

import com.telerikacademy.cosmetics.models.common.GenderType;
import com.telerikacademy.cosmetics.models.contracts.Product;

public abstract class AbstractProduct implements Product {
  private static final int NAME_MIN_LENGTH = 3;
  private static final int NAME_MAX_LENGTH = 10;
  private static final String NAME_LENGTH_EXCEPTION = "Name should be between 3 and 10 symbols.";

  private static final int BRAND_NAME_MIN_LENGTH = 2;
  private static final int BRAND_NAME_MAX_LENGTH = 10;
  private static final String BRAND_NAME_LENGTH_EXCEPTION = "Brand name should be between 2 and 10 symbols.";

  private static final String PRICE_NEGATIVE_EXCEPTION = "Price should be positive.";

  static final String NAME_NULL_EXCEPTION = "Name should not be null.";
  static final String BRAND_NULL_EXCEPTION = "Brand should not be null";

  private String name;
  private String brand;
  private double price;
  private GenderType gender;

  AbstractProduct(String name, String brand, double price, GenderType gender) {
    setName(name);
    setBrand(brand);
    setPrice(price);
    setGender(gender);
  }

  @Override
  public String getName() {
    return name;
  }

  protected void setName(String name) {
    if (name == null) {
      throw new IllegalArgumentException(NAME_NULL_EXCEPTION);
    }

    if (name.length() < NAME_MIN_LENGTH || name.length() > NAME_MAX_LENGTH) {
      throw new IllegalArgumentException(NAME_LENGTH_EXCEPTION);
    }

    this.name = name;
  }

  @Override
  public String getBrand() {
    return brand;
  }

  protected void setBrand(String brand) {
    if (brand == null) {
      throw new IllegalArgumentException(BRAND_NULL_EXCEPTION);
    }

    if (brand.length() < BRAND_NAME_MIN_LENGTH || brand.length() > BRAND_NAME_MAX_LENGTH) {
      throw new IllegalArgumentException(BRAND_NAME_LENGTH_EXCEPTION);
    }

    this.brand = brand;
  }

  @Override
  public double getPrice() {
    return price;
  }

  protected void setPrice(double price) {
    if (price < 0) {
      throw new IllegalArgumentException(PRICE_NEGATIVE_EXCEPTION);
    }

    this.price = price;
  }

  @Override
  public GenderType getGender() {
    return gender;
  }

  private void setGender(GenderType gender) {
    this.gender = gender;
  }

  @Override
  public String print() {
    StringBuilder builder = new StringBuilder();

    builder
            .append(String.format("#%s %s", getName(), getBrand()))
            .append(System.lineSeparator())
            .append(String.format(" #Price: $%.2f", getPrice()))
            .append(System.lineSeparator())
            .append(String.format(" #Gender: %s", getGender()))
            .append(System.lineSeparator());

    return builder.toString();
  }
}
