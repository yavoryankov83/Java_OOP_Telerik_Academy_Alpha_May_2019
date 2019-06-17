package com.telerikacademy.cosmetics.models.products;

import com.telerikacademy.cosmetics.models.common.GenderType;
import com.telerikacademy.cosmetics.models.common.UsageType;
import com.telerikacademy.cosmetics.models.contracts.Product;
import com.telerikacademy.cosmetics.models.contracts.Shampoo;

public class ShampooImpl extends AbstractProduct implements Product, Shampoo {

  private static final String MILLILITERS_NEGATIVE_EXCEPTION = "Milliliters should be positive.";

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
      throw new IllegalArgumentException(MILLILITERS_NEGATIVE_EXCEPTION);
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
