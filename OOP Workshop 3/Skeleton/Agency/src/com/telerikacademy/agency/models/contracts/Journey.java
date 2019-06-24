package com.telerikacademy.agency.models.contracts;

import com.telerikacademy.agency.models.vehicles.contracts.Vehicle;

public interface Journey {

  String getStartLocation();

  String getDestination();

  int getDistance();

  Vehicle getVehicle();

  double calculateTravelCosts();
}