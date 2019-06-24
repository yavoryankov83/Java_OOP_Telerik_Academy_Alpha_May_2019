package com.telerikacademy.agency.models.vehicles.models;

import com.telerikacademy.agency.models.common.ModelsValidator;
import com.telerikacademy.agency.models.common.ModelsConstants;
import com.telerikacademy.agency.models.common.ModelsExceptions;
import com.telerikacademy.agency.models.common.VehicleType;
import com.telerikacademy.agency.models.vehicles.contracts.Train;

public class TrainImpl extends AbstractVehicle implements Train {

  private int carts;

  public TrainImpl(int passangerCapacity, double pricePerKilometer, int carts) {
    super(passangerCapacity, pricePerKilometer);
    setCarts(carts);
  }

  @Override
  int validatePassangerCapacity(int passangerCapacity) {
    ModelsValidator.validateFieldBoundries(
            passangerCapacity,
            ModelsConstants.TRAIN_PASSENGER_MIN_CAPACITY,
            ModelsConstants.TRAIN_PASSENGER_MAX_CAPACITY,
            ModelsExceptions.TRAIN_PASSANGER_CAPACITY_EXCEPTION);

    return passangerCapacity;
  }

  @Override
  public VehicleType getType() {
    return VehicleType.LAND;
  }

  @Override
  public int getCarts() {
    return carts;
  }

  private void setCarts(int carts) {
    ModelsValidator.validateFieldBoundries(
            carts,
            ModelsConstants.TRAIN_CARTS_MIN_VALUE,
            ModelsConstants.TRAIN_CARTS_MAX_VALUE,
            ModelsExceptions.TRAIN_CARTS_EXCEPTION);

    this.carts = carts;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();

    builder
            .append(String.format("Train ----%n"))
            .append(super.toString())
            .append(String.format("Carts amount: %d%n", getCarts()));

    return builder.toString();
  }
}
