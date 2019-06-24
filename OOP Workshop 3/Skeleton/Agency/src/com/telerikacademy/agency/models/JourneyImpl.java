package com.telerikacademy.agency.models;

import com.telerikacademy.agency.models.common.ModelsConstants;
import com.telerikacademy.agency.models.common.ModelsExceptions;
import com.telerikacademy.agency.models.common.ModelsValidator;
import com.telerikacademy.agency.models.contracts.Journey;
import com.telerikacademy.agency.models.vehicles.contracts.Vehicle;

public class JourneyImpl implements Journey {

  private String startLocation;
  private String destination;
  private int distance;
  private Vehicle vehicle;

  public JourneyImpl(String startLocation, String destination, int distance, Vehicle vehicle) {
    setStartLocation(startLocation);
    setDestination(destination);
    setDistance(distance);
    setVehicle(vehicle);
  }

  @Override
  public String getStartLocation() {
    return startLocation;
  }

  private void setStartLocation(String startLocation) {
    ModelsValidator.valideForNull(
            startLocation,
            ModelsExceptions.JOURNEY_START_LOCATION_NULL_EXCEPTION);

    ModelsValidator.validateFieldBoundries(
            startLocation.length(),
            ModelsConstants.JOURNEY_START_LOCATION_MIN_LENGTH,
            ModelsConstants.JOURNEY_START_LOCATION_MAX_LENGTH,
            ModelsExceptions.JOURNEY_START_LOCATION_LENGTH_EXCEPTION);

    this.startLocation = startLocation;
  }

  @Override
  public String getDestination() {
    return destination;
  }

  private void setDestination(String destination) {
    ModelsValidator.valideForNull(
            destination,
            ModelsExceptions.JOURNEY_DESTINATION_NULL_EXCEPTION);

    ModelsValidator.validateFieldBoundries(
            destination.length(),
            ModelsConstants.JOURNEY_DESTINATION_MIN_LENGTH,
            ModelsConstants.JOURNEY_DESTINATION_MAX_LENGTH,
            ModelsExceptions.JOURNEY_DESTINATION_LENGTH_EXCEPTION);

    this.destination = destination;
  }

  @Override
  public int getDistance() {
    return distance;
  }

  private void setDistance(int distance) {
    ModelsValidator.validateFieldBoundries(
            distance,
            ModelsConstants.JOURNEY_DISTANCE_MIN_LENGTH,
            ModelsConstants.JOURNEY_DISTANCE_MAX_LENGTH,
            ModelsExceptions.JOURNEY_DISTANCE_LENGTH_EXCEPTION);

    this.distance = distance;
  }

  @Override
  public Vehicle getVehicle() {
    return vehicle;
  }

  private void setVehicle(Vehicle vehicle) {
    ModelsValidator.valideForNull(
            vehicle,
            ModelsExceptions.JOURNEY_VEHICLE_NULL_EXCEPTION);

    this.vehicle = vehicle;
  }

  @Override
  public double calculateTravelCosts() {
    return getDistance() * vehicle.getPricePerKilometer();
  }

  @Override
  public String toString() {

    StringBuilder builder = new StringBuilder();

    builder
            .append(String.format("Journey ----%n"))
            .append(String.format("Start location: %s%n", getStartLocation()))
            .append(String.format("Destination: %s%n", getDestination()))
            .append(String.format("Distance: %d%n", getDistance()))
            .append(String.format("Vehicle type: %s%n", vehicle.getType()))
            .append(String.format("Travel costs: %.2f%n", calculateTravelCosts()));

    return builder.toString();
  }
}
