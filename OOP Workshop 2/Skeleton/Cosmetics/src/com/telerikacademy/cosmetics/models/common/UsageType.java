package com.telerikacademy.cosmetics.models.common;

public enum UsageType {
  EVERY_DAY,
  MEDICAL;

  @Override
  public String toString() {
    int indexOfUnderscore = name().indexOf("_");

    return name().charAt(0) +
            name().substring(1, indexOfUnderscore).toLowerCase() +
            name().charAt(indexOfUnderscore + 1) +
            name().substring(indexOfUnderscore + 2).toLowerCase();
  }
}
