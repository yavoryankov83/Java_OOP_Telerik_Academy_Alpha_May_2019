package com.telerikacademy.cosmetics.models.products;

import com.telerikacademy.cosmetics.models.common.GenderType;
import com.telerikacademy.cosmetics.models.contracts.Product;

public class ProductImpl implements Product {

  private String name;
  private String brand;
  private double price;
  private GenderType gender;

  ProductImpl(String name, String brand, double price, GenderType gender) {
    setName(name);
    setBrand(brand);
    setPrice(price);
    setGender(gender);
  }

  @Override
  public String getName() {
    return name;
  }

  void setName(String name){
    this.name = name;
  }

  @Override
  public String getBrand() {
    return brand;
  }

  void setBrand(String brand){
    this.brand = brand;
  }

  @Override
  public double getPrice() {
    return price;
  }

  void setPrice(double price){
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
