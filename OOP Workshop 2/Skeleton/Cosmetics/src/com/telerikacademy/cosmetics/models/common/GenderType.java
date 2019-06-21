package com.telerikacademy.cosmetics.models.common;

public enum GenderType {
  MEN,
  WOMEN,
  UNISEX;

  @Override
  public String toString() {
    return name().charAt(0) + name().substring(1).toLowerCase();
  }
}
