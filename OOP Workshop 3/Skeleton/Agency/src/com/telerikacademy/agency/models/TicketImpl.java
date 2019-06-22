package com.telerikacademy.agency.models;

import com.telerikacademy.agency.models.contracts.Journey;
import com.telerikacademy.agency.models.contracts.Ticket;

public class TicketImpl implements Ticket {

  private Journey journey;
  private double administrativeCosts;

  public TicketImpl(Journey journey, double administrativeCosts) {
    this.journey = journey;
    this.administrativeCosts = administrativeCosts;
  }

  @Override
  public Journey getJourney() {
    return journey;
  }

  @Override
  public double getAdministrativeCosts() {
    return administrativeCosts;
  }

  @Override
  public double calculatePrice() {
    return getAdministrativeCosts() * journey.calculateTravelCosts();
  }

  @Override
  public String print() {
    StringBuilder builder = new StringBuilder();

    builder
            .append(String.format("Ticket ----%n"))
            .append(String.format("Destination: %s%n", journey.getDestination()))
            .append(String.format("Price: %.2f%n", calculatePrice()));

    return builder.toString();
  }
}
