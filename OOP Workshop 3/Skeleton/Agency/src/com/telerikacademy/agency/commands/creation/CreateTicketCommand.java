package com.telerikacademy.agency.commands.creation;

import com.telerikacademy.agency.commands.contracts.Command;
import com.telerikacademy.agency.core.contracts.AgencyFactory;
import com.telerikacademy.agency.core.contracts.AgencyRepository;
import com.telerikacademy.agency.models.contracts.Journey;
import com.telerikacademy.agency.models.contracts.Ticket;

import java.util.List;

import static com.telerikacademy.agency.commands.CommandsConstants.INVALID_NUMBER_OF_ARGUMENTS;

public class CreateTicketCommand implements Command {

  private static final int EXPECTED_NUMBER_OF_ARGUMENTS = 2;
  private final AgencyFactory factory;
  private final AgencyRepository agencyRepository;
  Journey journey;
  private double administrativeCosts;

  public CreateTicketCommand(AgencyFactory factory, AgencyRepository agencyRepository) {
    this.factory = factory;
    this.agencyRepository = agencyRepository;
  }

  @Override
  public String execute(List<String> parameters) {
    validateInput(parameters);

    parseParameters(parameters);

    Ticket ticket = factory.createTicket(journey, administrativeCosts);
    agencyRepository.addTicket(ticket);

    return String.format("Ticket with ID %d was created.", agencyRepository.getTickets().size() - 1);
  }

  private void validateInput(List<String> parameters) {
    if (parameters.size() != EXPECTED_NUMBER_OF_ARGUMENTS) {
      throw new IllegalArgumentException(String.format(
              INVALID_NUMBER_OF_ARGUMENTS,
              EXPECTED_NUMBER_OF_ARGUMENTS,
              parameters.size()));
    }
  }

  private void parseParameters(List<String> parameters) {
    try {
      journey = agencyRepository.getJourneys().get(Integer.parseInt(parameters.get(0)));
      administrativeCosts = Double.parseDouble(parameters.get(1));
    } catch (Exception e) {
      throw new IllegalArgumentException("Failed to parse CreateTicket command parameters.");
    }
  }
}
