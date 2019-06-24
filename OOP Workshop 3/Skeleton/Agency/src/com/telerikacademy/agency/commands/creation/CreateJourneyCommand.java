package com.telerikacademy.agency.commands.creation;

import com.telerikacademy.agency.commands.contracts.Command;
import com.telerikacademy.agency.core.contracts.AgencyRepository;
import com.telerikacademy.agency.core.contracts.AgencyFactory;
import com.telerikacademy.agency.models.contracts.Journey;
import com.telerikacademy.agency.models.vehicles.contracts.Vehicle;

import java.util.List;

public class CreateJourneyCommand extends AbstractCreateCommand implements Command {
  private static final int EXPECTED_NUMBER_OF_ARGUMENTS = 4;
  private String startLocation;
  private String destination;
  private int distance;
  private Vehicle vehicle;

  public CreateJourneyCommand(AgencyFactory factory, AgencyRepository agencyRepository) {
    super(factory, agencyRepository);
  }

  @Override
  public int getExpectedNumberOfArguments() {
    return EXPECTED_NUMBER_OF_ARGUMENTS;
  }

  @Override
  public String execute(List<String> parameters) {
    validateInput(parameters);

    parseParameters(parameters);

    Journey journey = getFactory().createJourney(startLocation, destination, distance, vehicle);
    getAgencyRepository().addJourney(journey);

    return String.format("Journey with ID %d was created.", getAgencyRepository().getJourneys().size() - 1);
  }


  @Override
  void parseParameters(List<String> parameters) {
    try {
      startLocation = parameters.get(0);
      destination = parameters.get(1);
      distance = Integer.parseInt(parameters.get(2));
      vehicle = getAgencyRepository().getVehicles().get(Integer.parseInt(parameters.get(3)));
    } catch (Exception e) {
      throw new IllegalArgumentException("Failed to parse CreateJourney command parameters.");
    }
  }
}
