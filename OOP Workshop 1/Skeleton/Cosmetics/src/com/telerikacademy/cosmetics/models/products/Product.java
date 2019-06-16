package com.telerikacademy.cosmetics.models.products;

import com.telerikacademy.cosmetics.models.common.GenderType;

public class Product {

  private static final int NAME_MIN_LENGTH = 3;
  private static final int NAME_MAX_LENGTH = 10;
  private static final String NAME_INVALID_MESSAGE = "Name must be between 3 and 10 symbils";
  private static final int BRAND_MIN_LENGTH = 2;
  private static final int BRAND_MAX_LENGTH = 10;
  private static final String BRAND_INVALID_MESSAGE = "Brand name must be between 2 and 10 symbols";
  private static final String PRICE_INVALID_MESSAGE = "Price should'n be negative";

  private double price;
  private String name;
  private String brand;
  private GenderType gender;

  public Product(String name, String brand, double price, GenderType gender) {
    setName(name);
    setPrice(price);
    setBrand(brand);
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  private void setName(String name) {
    if (name.length() < NAME_MIN_LENGTH || name.length() > NAME_MAX_LENGTH) {
      throw new IllegalArgumentException(NAME_INVALID_MESSAGE);
    }

    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  private void setPrice(double price) {
    if (price < 0) {
      throw new IllegalArgumentException(PRICE_INVALID_MESSAGE);
    }

    this.price = price;
  }

  private void setBrand(String brand) {
    if (brand.length() < BRAND_MIN_LENGTH || brand.length() > BRAND_MAX_LENGTH) {
      throw new IllegalArgumentException(BRAND_INVALID_MESSAGE);
    }

    this.brand = brand;
  }

  public String print() {
    StringBuilder builder = new StringBuilder();

    builder
            .append(String.format(" #%s %s", name, brand))
            .append(System.lineSeparator())
            .append(String.format(" #Price: $%.2f", price))
            .append(System.lineSeparator())
            .append(String.format(" #Gender: %s", gender))
            .append(System.lineSeparator())
            .append(" ===");

    return builder.toString();
  }
}
