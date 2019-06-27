package com.telerikacademy.furniture.models;

import com.telerikacademy.furniture.models.common.Validator;
import com.telerikacademy.furniture.models.contracts.Table;
import com.telerikacademy.furniture.models.enums.MaterialType;

public class TableImpl extends AbstractFurniture implements Table {

  private static final double LENGTH_VALUE_MIN_LIMIT = 0D;
  private static final String LENGTH_MIN_VALUE_EXCEPTION = "Table length should be positive number.";
  private static final double WIDTH_VALUE_MIN_LIMIT = 0D;
  private static final String WIDTH_MIN_VALUE_EXCEPTION = "Table width should be positive number.";

  private double length;
  private double width;

  public TableImpl(String model, MaterialType materialType, double price, double height, double length, double width) {
    super(model, materialType, price, height);
    setLength(length);
    setWidth(width);
  }

  @Override
  public double getLength() {
    return length;
  }

  private void setLength(double length) {
    Validator.validateFieldLessThan(length, LENGTH_VALUE_MIN_LIMIT, LENGTH_MIN_VALUE_EXCEPTION);

    this.length = length;
  }

  @Override
  public double getWidth() {
    return width;
  }

  private void setWidth(double width) {
    Validator.validateFieldLessThan(width, WIDTH_VALUE_MIN_LIMIT, WIDTH_MIN_VALUE_EXCEPTION);

    this.width = width;
  }

  @Override
  public double getArea() {
    return getLength() * getWidth();
  }

  @Override
  public String toString() {

    StringBuilder builder = new StringBuilder();

    builder.append(String.format("Type: %s, %s, %s",
            this.getClass().getSimpleName().replace("Impl", ""),
            furnitureDetails(),
            tableDetails()));

    return builder.toString();
  }

  private String tableDetails() {
    StringBuilder builder = new StringBuilder();

    builder.append(String.format("Length: %.2f, Width: %.2f, Area: %.4f",
            getLength(),
            getWidth(),
            getArea()));

    return builder.toString();
  }
}
