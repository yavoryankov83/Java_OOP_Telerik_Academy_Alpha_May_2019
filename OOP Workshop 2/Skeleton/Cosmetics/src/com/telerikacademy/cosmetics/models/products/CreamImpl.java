package com.telerikacademy.cosmetics.models.products;

import com.telerikacademy.cosmetics.models.common.GenderType;
import com.telerikacademy.cosmetics.models.common.ScentType;
import com.telerikacademy.cosmetics.models.contracts.Cream;
import com.telerikacademy.cosmetics.models.contracts.Product;

public class CreamImpl extends AbstractProduct implements Cream, Product {

  private static final int CREAM_NAME_MIN_LENGTH = 3;
  private static final int CREAM_NAME_MAX_LENGTH = 15;
  private static final String CREAM_NAME_LENGTH_EXCEPTION =
          "Cream name should be between 3 and 15 symbols.";

  private static final int BRAND_NAME_MIN_LENGTH = 3;
  private static final int BRAND_NAME_MAX_LENGTH = 10;
  private static final String BRAND_NAME_LENGTH_EXCEPTION =
          "Brand name should be between 3 and 10 symbols.";

  private static final String PRICE_SMALLER_OR_EQUAL_TO_ZERO_EXCEPTION = "Price should be greater than 0.";


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
  protected void setName(String name) {
    if (name == null) {
      throw new IllegalArgumentException(NAME_NULL_EXCEPTION);
    }
    if (name.length() < CREAM_NAME_MIN_LENGTH || name.length() > CREAM_NAME_MAX_LENGTH) {
      throw new IllegalArgumentException(CREAM_NAME_LENGTH_EXCEPTION);
    }

    super.setName(name);
  }

  @Override
  protected void setBrand(String brand) {
    if (brand == null) {
      throw new IllegalArgumentException(BRAND_NULL_EXCEPTION);
    }
    if (brand.length() < BRAND_NAME_MIN_LENGTH || brand.length() > BRAND_NAME_MAX_LENGTH) {
      throw new IllegalArgumentException(BRAND_NAME_LENGTH_EXCEPTION);
    }

    super.setBrand(brand);
  }

  @Override
  protected void setPrice(double price) {
    if (price <= 0) {
      throw new IllegalArgumentException(PRICE_SMALLER_OR_EQUAL_TO_ZERO_EXCEPTION);
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
