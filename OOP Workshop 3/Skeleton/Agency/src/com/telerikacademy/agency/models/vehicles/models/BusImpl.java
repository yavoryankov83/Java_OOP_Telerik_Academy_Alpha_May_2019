package com.telerikacademy.agency.models.vehicles.models;

import com.telerikacademy.agency.models.common.ModelsConstants;
import com.telerikacademy.agency.models.common.ModelsExceptions;
import com.telerikacademy.agency.models.common.ModelsValidator;
import com.telerikacademy.agency.models.common.VehicleType;
import com.telerikacademy.agency.models.vehicles.contracts.Bus;

public class BusImpl extends AbstractVehicle implements Bus {

  public BusImpl(int passangerCapacity, double pricePerKilometer) {
    super(passangerCapacity, pricePerKilometer);
  }

  @Override
  int validatePassangerCapacity(int passangerCapacity) {
    ModelsValidator.validateFieldBoundries(
            passangerCapacity,
            ModelsConstants.VEHICLE_PASSENGER_MIN_CAPACITY,
            ModelsConstants.VEHICLE_PASSENGER_MAX_CAPACITY,
            ModelsExceptions.VEHICLE_PASSANGER_CAPACITY_EXCEPTON);

    ModelsValidator.validateFieldBoundries(
            passangerCapacity,
            ModelsConstants.BUS_PASSENGER_MIN_CAPACITY,
            ModelsConstants.BUS_PASSENGER_MAX_CAPACITY,
            ModelsExceptions.BUS_PASSANGER_CAPACITY_EXCEPTION);

    return passangerCapacity;
  }

  @Override
  public VehicleType getType() {
    return VehicleType.LAND;
  }

  @Override
  public String print() {
    StringBuilder builder = new StringBuilder();

    builder
            .append(String.format("Bus ----%n"))
            .append(super.print());

    return builder.toString();
  }
}
