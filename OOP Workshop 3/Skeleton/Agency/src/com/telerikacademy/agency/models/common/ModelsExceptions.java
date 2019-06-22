package com.telerikacademy.agency.models.common;

public final class ModelsExceptions {

  private ModelsExceptions() {
  }

  //Vehicle exceptions
  public static final String VEHICLE_PASSANGER_CAPACITY_EXCEPTON =
          "A vehicle with less than 1 passengers or more than 800 passengers cannot exist!";

  public static final String VEHICLE_PRICE_PER_KILOMETER_EXCEPTION =
          "A vehicle with a price per kilometer lower than $0.10 or higher than $2.50 cannot exist!";

  //Train exceptions
  public static final String TRAIN_PASSANGER_CAPACITY_EXCEPTION =
          "A train cannot have less than 30 passengers or more than 150 passengers.";

  public static final String TRAIN_CARTS_EXCEPTION =
          "A train cannot have less than 1 cart or more than 15 carts.";

  //Bus exceptions
  public static final String BUS_PASSANGER_CAPACITY_EXCEPTION =
          "A bus cannot have less than 10 passengers or more than 50 passengers.";


  //Journey exceptions
  public static final String JOURNEY_START_LOCATION_LENGTH_EXCEPTION =
          "The StartingLocation's length cannot be less than 5 or more than 25 symbols long.";

  public static final String JOURNEY_START_LOCATION_NULL_EXCEPTION =
          "Start location shouldn't be null.";

  public static final String JOURNEY_DESTINATION_LENGTH_EXCEPTION =
          "The Destination's length cannot be less than 5 or more than 25 symbols long.";

  public static final String JOURNEY_DESTINATION_NULL_EXCEPTION =
          "Destination shouldn't be null.";

  public static final String JOURNEY_DISTANCE_LENGTH_EXCEPTION =
          "The Distance cannot be less than 5 or more than 5000 kilometers.";

  public static final String JOURNEY_VEHICLE_NULL_EXCEPTION =
          "Vehicle shouldn't be null.";
}
