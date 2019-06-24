package com.telerikacademy.agency.commands.creation;

import com.telerikacademy.agency.commands.contracts.Command;
import com.telerikacademy.agency.core.contracts.AgencyRepository;
import com.telerikacademy.agency.core.contracts.AgencyFactory;
import com.telerikacademy.agency.models.vehicles.contracts.Vehicle;

import java.util.List;

public class CreateAirplaneCommand extends AbstractCreateCommand implements Command {

  private static final int EXPECTED_NUMBER_OF_ARGUMENTS = 3;

  private int passengerCapacity;
  private double pricePerKilometer;
  private boolean hasFreeFood;

  public CreateAirplaneCommand(AgencyFactory factory,
                               AgencyRepository agencyRepository) {
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

    Vehicle airplane = getFactory().createAirplane(passengerCapacity, pricePerKilometer, hasFreeFood);
    getAgencyRepository().addVehicle(airplane);

    return String.format("Vehicle with ID %d was created.", getAgencyRepository().getVehicles().size() - 1);
  }

  @Override
  void parseParameters(List<String> parameters) {
    try {
      passengerCapacity = Integer.parseInt(parameters.get(0));
      pricePerKilometer = Double.parseDouble(parameters.get(1));
      hasFreeFood = Boolean.parseBoolean(parameters.get(2));
    } catch (Exception e) {
      throw new IllegalArgumentException("Failed to parse CreateAirplane command parameters.");
    }
  }
}
