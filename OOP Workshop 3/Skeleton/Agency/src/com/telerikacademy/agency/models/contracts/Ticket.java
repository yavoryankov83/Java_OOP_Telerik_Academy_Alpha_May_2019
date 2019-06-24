package com.telerikacademy.agency.models.contracts;

public interface Ticket {

  Journey getJourney();

  double getAdministrativeCosts();

  double calculatePrice();
}
