package com.telerikacademy.furniture.models;

import com.telerikacademy.furniture.models.common.Validator;
import com.telerikacademy.furniture.models.contracts.Chair;
import com.telerikacademy.furniture.models.enums.MaterialType;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class ChairImpl extends AbstractFurniture implements Chair {

  private static final int CHAIR_LEGS_MIN_VALUE = 0;
  private static final String CHAIR_LEGS_MIN_VALUE_EXCEPTION = "Chair legs should't be less than 0.";
  private int numberOfLegs;

  public ChairImpl(String model, MaterialType materialType, double price, double height, int numberOfLegs) {
    super(model, materialType, price, height);
    setNumberOfLegs(numberOfLegs);
  }

  @Override
  public int getNumberOfLegs() {
    return numberOfLegs;
  }

  private void setNumberOfLegs(int numberOfLegs) {
    Validator.validateFieldLessThan(numberOfLegs, CHAIR_LEGS_MIN_VALUE, CHAIR_LEGS_MIN_VALUE_EXCEPTION);

    this.numberOfLegs = numberOfLegs;
  }

  @Override
  protected String getType() {
    return String.format("Type: %s", getClass().getSimpleName().replace("Impl", ""));
  }

  @Override
  protected String getAdditionalDetails() {
    return String.format("Legs: %d", getNumberOfLegs());
  }
}
