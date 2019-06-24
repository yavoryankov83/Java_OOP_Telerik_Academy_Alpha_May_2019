package com.telerikacademy.agency.commands.creation;

import com.telerikacademy.agency.core.contracts.AgencyFactory;
import com.telerikacademy.agency.core.contracts.AgencyRepository;

import java.util.List;

import static com.telerikacademy.agency.commands.CommandsConstants.INVALID_NUMBER_OF_ARGUMENTS;

public abstract class AbstractCreateCommand {

  private final AgencyFactory factory;
  private final AgencyRepository agencyRepository;

  AbstractCreateCommand(AgencyFactory factory, AgencyRepository agencyRepository) {
    this.factory = factory;
    this.agencyRepository = agencyRepository;
  }

  AgencyFactory getFactory() {
    return factory;
  }

  public AgencyRepository getAgencyRepository() {
    return agencyRepository;
  }

  void validateInput(List<String> parameters) {
    if (parameters.size() != getExpectedNumberOfArguments()) {
      throw new IllegalArgumentException(String.format(
              INVALID_NUMBER_OF_ARGUMENTS,
              getExpectedNumberOfArguments(),
              parameters.size()));
    }
  }

  //helper method
  abstract int getExpectedNumberOfArguments();

  abstract void parseParameters(List<String> parameters);
}
