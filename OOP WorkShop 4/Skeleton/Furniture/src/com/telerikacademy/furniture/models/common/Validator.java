package com.telerikacademy.furniture.models.common;

public final class Validator {

  private Validator() {
  }

  public static void validateForNull(Object value, String message) {
    if (value == null) {
      throw new IllegalArgumentException(message);
    }
  }

  public static void validateForEmptyValue(String value, String message) {
    if ("".equals(value)) {
      throw new IllegalArgumentException(message);
    }
  }

  public static <T extends Comparable<T>> void validateFieldLessThan(T value, T limit, String message) {
    if (value.compareTo(limit) < 0) {
      throw new IllegalArgumentException(message);
    }
  }

  public static <T extends Comparable<T>> void validateFieldLessThanOrEqual(T value, T limit, String message) {
    if (value.compareTo(limit) <= 0) {
      throw new IllegalArgumentException(message);
    }
  }

  public static void validateCompanyRegistrationNumber(String value, int exactLimitValue, String message) {
    if (value.length() != exactLimitValue) {
      throw new IllegalArgumentException(message);
    }
    if (!value.chars().allMatch(Character::isDigit)) {
      throw new IllegalArgumentException(message);
    }
  }
}
