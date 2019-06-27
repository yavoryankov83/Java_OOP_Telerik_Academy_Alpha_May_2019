package com.telerikacademy.furniture.models;

import com.telerikacademy.furniture.models.contracts.ConvertibleChair;
import com.telerikacademy.furniture.models.enums.MaterialType;

public class ConvertibleChairImpl extends ChairImpl implements ConvertibleChair {

  private static final double CONVERTABLE_CHAIR_VALUE_AFTER_CONVERT = 0.1;
  private boolean converted;

  public ConvertibleChairImpl(String model, MaterialType materialType, double price,
                              double height, int numberOfLegs) {
    super(model, materialType, price, height, numberOfLegs);
    converted = false;
  }

  @Override
  public double getHeight() {
    if (converted) {
      return CONVERTABLE_CHAIR_VALUE_AFTER_CONVERT;
    }

    return super.getHeight();
  }

  @Override
  public boolean getConverted() {
    return converted;
  }

  @Override
  public void convert() {
    converted = !converted;
  }

  @Override
  protected String getType() {
    return String.format("Type: %s", getClass().getSimpleName().replace("Impl", ""));
  }

  @Override
  protected String getAdditionalDetails() {
    return String.format("Legs: %d, State: %s", getNumberOfLegs(), getConverted() ? "Converted" : "Normal");
  }
}
