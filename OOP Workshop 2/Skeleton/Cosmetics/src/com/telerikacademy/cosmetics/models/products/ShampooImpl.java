package com.telerikacademy.cosmetics.models.products;

import com.telerikacademy.cosmetics.models.common.*;
import com.telerikacademy.cosmetics.models.contracts.Shampoo;

public class ShampooImpl extends AbstractProduct implements Shampoo {

  private int milliliters;
  private UsageType usage;

  public ShampooImpl(String name, String brand, double price,
                     GenderType gender, int milliliters, UsageType usage) {
    super(name, brand, price, gender);
    setMilliliters(milliliters);
    this.usage = usage;
  }

  @Override
  public int getMilliliters() {
    return milliliters;
  }

  private void setMilliliters(int milliliters) {
    ProductValidator.validateMilliliters(milliliters, ProductConstants.SHAMPOO_MILLILITERS_MIN_VALUE, ProductExceptions.SHAMPOO_MILLILITERS_NEGATIVE_EXCEPTION);

    this.milliliters = milliliters;
  }

  @Override
  public UsageType getUsage() {
    return usage;
  }

  @Override
  String printDetails() {
    StringBuilder builder = new StringBuilder();

    builder
            .append(String.format(" #Milliliters: %d%n", getMilliliters()))
            .append(String.format(" #Usage: %s%n", getUsage()));

    return builder.toString();
  }
}
