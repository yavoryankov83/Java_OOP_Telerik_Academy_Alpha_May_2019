package com.telerikacademy.agency.models.common;

public final class ModelsConstants {

  private ModelsConstants() {
  }

  //Vehicle constants
  public static final int VEHICLE_PASSENGER_MIN_CAPACITY = 1;
  public static final int VEHICLE_PASSENGER_MAX_CAPACITY = 800;

  public static final double VEHICLE_PRICE_PER_KILOMETER_MIN_VALUE = 0.1;
  public static final double VEHICLE_PRICE_PER_KILOMETER_MAX_VALUE = 2.5;

  //Train constants
  public static final int TRAIN_PASSENGER_MIN_CAPACITY = 30;
  public static final int TRAIN_PASSENGER_MAX_CAPACITY = 150;

  public static final int TRAIN_CARTS_MIN_VALUE = 1;
  public static final int TRAIN_CARTS_MAX_VALUE = 15;

  //Bus constants
  public static final int BUS_PASSENGER_MIN_CAPACITY = 10;
  public static final int BUS_PASSENGER_MAX_CAPACITY = 50;


  //Journey constants
  public static final int JOURNEY_START_LOCATION_MIN_LENGTH = 5;
  public static final int JOURNEY_START_LOCATION_MAX_LENGTH = 25;

  public static final int JOURNEY_DESTINATION_MIN_LENGTH = 5;
  public static final int JOURNEY_DESTINATION_MAX_LENGTH = 25;

  public static final int JOURNEY_DISTANCE_MIN_LENGTH = 5;
  public static final int JOURNEY_DISTANCE_MAX_LENGTH = 5000;
}
