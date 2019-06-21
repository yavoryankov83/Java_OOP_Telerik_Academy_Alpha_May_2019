package com.telerikacademy.cosmetics.models.common;

import java.util.List;

public final class ProductValidator {

  private ProductValidator() {
  }

  public static void validateStringLength(String value, int minLength, int maxLength, String message){
    if (value.length() < minLength || value.length() > maxLength){
      throw new IllegalArgumentException(message);
    }
  }

  public static void validateNameForNull(String name, String message) {
    if (name == null) {
      throw new IllegalArgumentException(message);
    }
  }

  public static void validateBrandForNull(String brand, String message) {
    if (brand == null) {
      throw new IllegalArgumentException(message);
    }
  }

  public static void validatePrice(double price, double minValue, String message) {
    if (price < minValue) {
      throw new IllegalArgumentException(message);
    }
  }

  public static void validateMilliliters(int milliliters, int minValue, String message) {
    if (milliliters < minValue) {
      throw new IllegalArgumentException(message);
    }
  }

  public static <E> void validateIngredients(List<E> ingredients, String message) {
    if (ingredients == null) {
      throw new IllegalArgumentException(message);
    }
  }
}
