package com.telerikacademy.agency.models.vehicles.models;

import com.telerikacademy.agency.models.common.ModelsConstants;
import com.telerikacademy.agency.models.common.ModelsExceptions;
import com.telerikacademy.agency.models.common.ModelsValidator;
import com.telerikacademy.agency.models.common.VehicleType;
import com.telerikacademy.agency.models.vehicles.contracts.Airplane;

public class AirplaneImpl extends AbstractVehicle implements Airplane {

  private boolean freeFood;

  public AirplaneImpl(int passangerCapacity, double pricePerKilometer, boolean freeFood) {
    super(passangerCapacity, pricePerKilometer);
    this.freeFood = freeFood;
  }

  @Override
  int validatePassangerCapacity(int passangerCapacity) {
    ModelsValidator.validateFieldBoundries(
            passangerCapacity,
            ModelsConstants.VEHICLE_PASSENGER_MIN_CAPACITY,
            ModelsConstants.VEHICLE_PASSENGER_MAX_CAPACITY,
            ModelsExceptions.VEHICLE_PASSANGER_CAPACITY_EXCEPTON);

    return passangerCapacity;
  }

  @Override
  public VehicleType getType() {
    return VehicleType.AIR;
  }

  @Override
  public boolean hasFreeFood() {
    return freeFood;
  }

  @Override
  public String print() {
    StringBuilder builder = new StringBuilder();

    builder
            .append(String.format("Airplane ----%n"))
            .append(super.print())
            .append(String.format("Has free food: %s%n", hasFreeFood()));

    return builder.toString();
  }
}
