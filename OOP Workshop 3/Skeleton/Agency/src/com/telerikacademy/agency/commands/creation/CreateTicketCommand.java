package com.telerikacademy.agency.commands.creation;

import com.telerikacademy.agency.commands.contracts.Command;
import com.telerikacademy.agency.core.contracts.AgencyFactory;
import com.telerikacademy.agency.core.contracts.AgencyRepository;
import com.telerikacademy.agency.models.contracts.Journey;
import com.telerikacademy.agency.models.contracts.Ticket;

import java.util.List;

public class CreateTicketCommand extends AbstractCreateCommand implements Command {

  private static final int EXPECTED_NUMBER_OF_ARGUMENTS = 2;
  private int journeyId;
  private double administrativeCosts;

  public CreateTicketCommand(AgencyFactory factory, AgencyRepository agencyRepository) {
    super(factory, agencyRepository);
  }

  @Override
  int getExpectedNumberOfArguments() {
    return EXPECTED_NUMBER_OF_ARGUMENTS;
  }

  @Override
  public String execute(List<String> parameters) {
    validateInput(parameters);

    parseParameters(parameters);

    Journey journey = getAgencyRepository().getJourneys().get(journeyId);
    Ticket ticket = getFactory().createTicket(journey, administrativeCosts);
    getAgencyRepository().addTicket(ticket);

    return String.format("Ticket with ID %d was created.", getAgencyRepository().getTickets().size() - 1);
  }

  @Override
  void parseParameters(List<String> parameters) {
    try {
      journeyId = Integer.parseInt(parameters.get(0));
      administrativeCosts = Double.parseDouble(parameters.get(1));
    } catch (Exception e) {
      throw new IllegalArgumentException("Failed to parse CreateTicket command parameters.");
    }
  }
}
