package com.telerikacademy.agency.models.common;

public final class ModelsValidator {

  private ModelsValidator() {
  }

  public static void validateFieldBoundries(int value, int minBound, int maxBound, String message) {
    if (value < minBound || value > maxBound) {
      throw new IllegalArgumentException(message);
    }
  }

  public static void validateFieldBoundries(double value, double minBound, double maxBound, String message) {
    if (value < minBound || value > maxBound) {
      throw new IllegalArgumentException(message);
    }
  }

  public static void validateFieldBoundries(String value, double minBound, double maxBound, String message) {
    if (value.length() < minBound || value.length() > maxBound) {
      throw new IllegalArgumentException(message);
    }
  }

  public static void valideForNull(Object object, String message) {
    if (object == null) {
      throw new IllegalArgumentException(message);
    }
  }
}
