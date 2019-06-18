package com.telerikacademy.cosmetics.models.products;

import com.telerikacademy.cosmetics.models.common.GenderType;
import com.telerikacademy.cosmetics.models.common.UsageType;
import com.telerikacademy.cosmetics.models.contracts.Product;
import com.telerikacademy.cosmetics.models.contracts.Shampoo;

public class ShampooImpl extends ProductImpl implements Product, Shampoo {

  private int milliliters;
  private UsageType usage;

  public ShampooImpl(String name, String brand, double price,
                     GenderType gender, int milliliters, UsageType usage) {
    super(name, brand, price, gender);
    setMilliliters(milliliters);
    setUsage(usage);
  }

  @Override
  public int getMilliliters() {
    return milliliters;
  }

  private void setMilliliters(int milliliters) {
    if (milliliters < 0) {
      throw new IllegalArgumentException(ProductConstants.SHAMPOO_MILLILITERS_NEGATIVE_EXCEPTION);
    }

    this.milliliters = milliliters;
  }

  @Override
  public UsageType getUsage() {
    return usage;
  }

  private void setUsage(UsageType usage) {
    this.usage = usage;
  }

  @Override
  void setName(String name) {
    if (name == null) {
      throw new IllegalArgumentException(ProductConstants.NAME_NULL_EXCEPTION);
    }

    if (name.length() < ProductConstants.SHAMPOO_NAME_MIN_LENGTH || name.length() > ProductConstants.SHAMPOO_NAME_MAX_LENGTH) {
      throw new IllegalArgumentException(ProductConstants.SHAMPOO_NAME_LENGTH_EXCEPTION);
    }

    super.setName(name);
  }

  @Override
  void setBrand(String brand) {
    if (brand == null) {
      throw new IllegalArgumentException(ProductConstants.BRAND_NULL_EXCEPTION);
    }

    if (brand.length() < ProductConstants.SHAMPOO_BRAND_NAME_MIN_LENGTH || brand.length() > ProductConstants.SHAMPOO_BRAND_NAME_MAX_LENGTH) {
      throw new IllegalArgumentException(ProductConstants.SHAMPOO_BRAND_NAME_LENGTH_EXCEPTION);
    }

    super.setBrand(brand);
  }

  @Override
  void setPrice(double price) {
    if (price < 0) {
      throw new IllegalArgumentException(ProductConstants.SHAMPOO_PRICE_NEGATIVE_EXCEPTION);
    }

    super.setPrice(price);
  }

  @Override
  public String print() {
    StringBuilder builder = new StringBuilder();

    builder
            .append(super.print())
            .append(String.format(" #Milliliters: %d", getMilliliters()))
            .append(System.lineSeparator())
            .append(String.format(" #Usage: %s", getUsage()))
            .append(System.lineSeparator())
            .append(" ===");

    return builder.toString();
  }
}