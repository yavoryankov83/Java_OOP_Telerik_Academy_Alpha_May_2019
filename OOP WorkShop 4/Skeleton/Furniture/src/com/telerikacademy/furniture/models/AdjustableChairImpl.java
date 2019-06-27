package com.telerikacademy.furniture.models;

import com.telerikacademy.furniture.models.contracts.AdjustableChair;
import com.telerikacademy.furniture.models.enums.MaterialType;

public class AdjustableChairImpl extends ChairImpl implements AdjustableChair {

  public AdjustableChairImpl(String model, MaterialType materialType, double price,
                             double height, int numberOfLegs) {
    super(model, materialType, price, height, numberOfLegs);
  }

  @Override
  public void setHeight(double height) {
    super.setHeight(height);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();

    builder.append(String.format("Type: %s, %s, %s",
            this.getClass().getSimpleName().replace("Impl", ""),
            furnitureDetails(),
            chairDetails()));

    return builder.toString();
  }
}
