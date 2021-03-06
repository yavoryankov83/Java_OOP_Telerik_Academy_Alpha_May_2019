package com.telerikacademy.agency.models.vehicles.models;

import com.telerikacademy.agency.models.common.ModelsValidator;
import com.telerikacademy.agency.models.common.ModelsConstants;
import com.telerikacademy.agency.models.common.ModelsExceptions;
import com.telerikacademy.agency.models.vehicles.contracts.Vehicle;

public abstract class AbstractVehicle implements Vehicle {

  private int passangerCapacity;
  private double pricePerKilometer;

  AbstractVehicle(int passangerCapacity, double pricePerKilometer) {
    setPassangerCapacity(passangerCapacity);
    setPricePerKilometer(pricePerKilometer);
  }

  @Override
  public int getPassengerCapacity() {
    return passangerCapacity;
  }

  private void setPassangerCapacity(int passangerCapacity) {

    this.passangerCapacity = validatePassangerCapacity(passangerCapacity);
  }

  abstract int validatePassangerCapacity(int passangerCapacity);

  @Override
  public double getPricePerKilometer() {
    return pricePerKilometer;
  }

  private void setPricePerKilometer(double pricePerKilometer) {
    ModelsValidator.validateFieldBoundries(
            pricePerKilometer,
            getPricePerKilometerMinValue(),
            getPricePerKilometerMaxValue(),
            getPricePerKilometerExceptionMessage());

    this.pricePerKilometer = pricePerKilometer;
  }

  //helper method
  protected double getPricePerKilometerMinValue() {
    return ModelsConstants.VEHICLE_PRICE_PER_KILOMETER_MIN_VALUE;
  }

  //helper method
  protected double getPricePerKilometerMaxValue() {
    return ModelsConstants.VEHICLE_PRICE_PER_KILOMETER_MAX_VALUE;
  }

  //helper method
  protected String getPricePerKilometerExceptionMessage() {
    return ModelsExceptions.VEHICLE_PRICE_PER_KILOMETER_EXCEPTION;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();

    builder
            .append(String.format("Passenger capacity: %d%n", getPassengerCapacity()))
            .append(String.format("Price per kilometer: %.2f%n", getPricePerKilometer()))
            .append(String.format("Vehicle type: %s%n", getType()));

    return builder.toString();
  }
}
