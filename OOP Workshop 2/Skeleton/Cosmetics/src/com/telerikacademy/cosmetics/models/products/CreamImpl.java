package com.telerikacademy.cosmetics.models.products;

import com.telerikacademy.cosmetics.models.common.GenderType;
import com.telerikacademy.cosmetics.models.common.ProductConstants;
import com.telerikacademy.cosmetics.models.common.ScentType;
import com.telerikacademy.cosmetics.models.contracts.Cream;

public class CreamImpl extends AbstractProduct implements Cream {

  private ScentType scent;

  public CreamImpl(String name, String brand, double price, GenderType gender, ScentType scent) {
    super(name, brand, price, gender);
    this.scent = scent;
  }

  @Override
  int getNameMinLength() {
    return ProductConstants.CREAM_NAME_MIN_LENGTH;
  }

  @Override
  int getNameMaxLength() {
    return ProductConstants.CREAM_NAME_MAX_LENGTH;
  }

  @Override
  int getBrandMinLength() {
    return ProductConstants.CREAM_BRAND_MIN_LENGTH;
  }

  @Override
  int getBrandMaxLength() {
    return ProductConstants.CREAM_BRAND_MAX_LENGTH;
  }

  @Override
  double getMinPrice() {
    return ProductConstants.CREAM_PRICE_MIN_VALUE;
  }

  @Override
  public ScentType getScent() {
    return scent;
  }

  @Override
  String printDetails() {
    StringBuilder builder = new StringBuilder();

    builder
            .append(String.format(" #Scent: %s%n", getScent()));

    return builder.toString();
  }
}
