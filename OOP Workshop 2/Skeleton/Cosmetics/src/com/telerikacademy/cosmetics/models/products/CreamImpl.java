package com.telerikacademy.cosmetics.models.products;

import com.telerikacademy.cosmetics.models.common.GenderType;
import com.telerikacademy.cosmetics.models.common.ScentType;
import com.telerikacademy.cosmetics.models.contracts.Cream;
import com.telerikacademy.cosmetics.models.contracts.Product;

public class CreamImpl extends ProductImpl implements Product, Cream {

  private ScentType scent;

  public CreamImpl(String name, String brand, double price, GenderType gender, ScentType scent) {
    super(name, brand, price, gender);
    setScent(scent);
  }

  @Override
  public ScentType getScent() {
    return scent;
  }

  private void setScent(ScentType scent) {
    this.scent = scent;
  }

  @Override
  public void setName(String name) {
    if (name == null) {
      throw new IllegalArgumentException(ProductConstants.NAME_NULL_EXCEPTION);
    }
    if (name.length() < ProductConstants.CREAM_NAME_MIN_LENGTH || name.length() > ProductConstants.CREAM_NAME_MAX_LENGTH) {
      throw new IllegalArgumentException(ProductConstants.CREAM_NAME_LENGTH_EXCEPTION);
    }

    super.setName(name);
  }

  @Override
  void setBrand(String brand) {
    if (brand == null) {
      throw new IllegalArgumentException(ProductConstants.BRAND_NULL_EXCEPTION);
    }
    if (brand.length() < ProductConstants.CREAM_BRAND_NAME_MIN_LENGTH || brand.length() > ProductConstants.CREAM_BRAND_NAME_MAX_LENGTH) {
      throw new IllegalArgumentException(ProductConstants.CREAM_BRAND_NAME_LENGTH_EXCEPTION);
    }

    super.setBrand(brand);
  }

  @Override
  void setPrice(double price) {
    if (price <= 0) {
      throw new IllegalArgumentException(ProductConstants.CREAM_PRICE_NEGATIVE_OR_EQUAL_TO_ZERO_EXCEPTION);
    }

    super.setPrice(price);
  }

  @Override
  public String print() {
    StringBuilder builder = new StringBuilder();

    builder
            .append(super.print())
            .append(String.format(" #Scent: %s", getScent()))
            .append(System.lineSeparator())
            .append(" ===");

    return builder.toString();
  }
}
