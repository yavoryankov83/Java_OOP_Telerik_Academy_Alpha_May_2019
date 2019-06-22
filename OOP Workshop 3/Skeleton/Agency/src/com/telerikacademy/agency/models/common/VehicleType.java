package com.telerikacademy.agency.models.common;

public enum VehicleType {
  LAND,
  AIR,
  SEA;

  @Override
  public String toString() {
    return name().charAt(0) + name().substring(1).toLowerCase();
  }
}
