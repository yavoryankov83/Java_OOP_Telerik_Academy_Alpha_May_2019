package com.telerikacademy.workItemManagement.models.common;

public final class Validator {

  private Validator() {
  }

  public static void validateForNullValue(Object object, String message){
    if (object == null){
      throw new IllegalArgumentException(message);
    }
  }

  public static <T extends Comparable<T>> void validateFieldMinAndMaxBoundries(T value, T min, T max, String message){
    if (value.compareTo(min)< 0 || value.compareTo(max) > 0){
      throw new IllegalArgumentException(message);
    }
  }
}
