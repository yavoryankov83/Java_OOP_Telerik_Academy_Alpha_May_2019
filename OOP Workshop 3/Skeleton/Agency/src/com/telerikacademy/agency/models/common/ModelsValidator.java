package com.telerikacademy.agency.models.common;

public final class ModelsValidator {

  private ModelsValidator() {
  }

  public static <T extends Comparable<T>> void validateFieldBoundries(T value, T min, T max, String message) {
    if (value.compareTo(min) < 0 || value.compareTo(max) > 0) {
      throw new IllegalArgumentException(message);
    }
  }

  public static void valideForNull(Object object, String message) {
    if (object == null) {
      throw new IllegalArgumentException(message);
    }
  }
}
