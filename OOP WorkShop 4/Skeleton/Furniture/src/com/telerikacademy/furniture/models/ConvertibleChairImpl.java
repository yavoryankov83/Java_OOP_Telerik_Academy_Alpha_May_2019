package com.telerikacademy.furniture.models;

import com.telerikacademy.furniture.models.contracts.ConvertibleChair;
import com.telerikacademy.furniture.models.enums.MaterialType;

public class ConvertibleChairImpl extends ChairImpl implements ConvertibleChair {

  private static final double CONVERTABLE_CHAIR_HEIGHT_CHAIR_VALUE = 0.1;
  private boolean isConverted;
  private double initialHeight;

  public ConvertibleChairImpl(String model, MaterialType materialType, double price,
                              double height, int numberOfLegs) {
    super(model, materialType, price, height, numberOfLegs);
    isConverted = false;
    initialHeight = height;
  }

  @Override
  public boolean getConverted() {
    return isConverted;
  }

  @Override
  public void convert() {
    isConverted = !isConverted;
    if (isConverted) {
      setHeight(CONVERTABLE_CHAIR_HEIGHT_CHAIR_VALUE);
    } else {
      setHeight(initialHeight);
    }
  }

  @Override
  protected String getDetails() {
    return String.format("Legs: %d, State: %s",
            getNumberOfLegs(),
            getConverted() ? "Converted" : "Normal");
  }
}
