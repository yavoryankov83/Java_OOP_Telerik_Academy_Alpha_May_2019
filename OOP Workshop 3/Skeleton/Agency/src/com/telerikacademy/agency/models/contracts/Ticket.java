package com.telerikacademy.agency.models.contracts;

public interface Ticket extends Printable {

  Journey getJourney();

  double getAdministrativeCosts();

  double calculatePrice();
}
