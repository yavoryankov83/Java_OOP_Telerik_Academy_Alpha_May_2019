package com.telerikacademy.furniture.models.enums;

public enum MaterialType {
  WOODEN,
  LEATHER,
  PLASTIC;

  @Override
  public String toString() {
    return name().charAt(0) + name().substring(1).toLowerCase();
  }
}
