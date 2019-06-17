package com.telerikacademy.cosmetics.models.common;

public enum ScentType {
  LAVENDER,
  VANILLA,
  ROSE;

  @Override
  public String toString() {
    return name().charAt(0) + name().substring(1).toLowerCase();
  }
}
