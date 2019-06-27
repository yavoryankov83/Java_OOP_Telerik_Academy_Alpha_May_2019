package com.telerikacademy.furniture.tests.core.factories;

import com.telerikacademy.furniture.core.contracts.FurnitureFactory;
import com.telerikacademy.furniture.models.contracts.Chair;
import com.telerikacademy.furniture.models.contracts.Company;
import com.telerikacademy.furniture.models.contracts.Table;

public class IvoFurnitureFactory implements FurnitureFactory {
  @Override
  public Company createCompany(String name, String registrationNumber) {
    return null;
  }

  @Override
  public Table createTable(String model, String materialType, double price, double height, double length, double width) {
    return null;
  }

  @Override
  public Chair createChair(String type, String model, String material, double price, double height, int numberOfLegs) {
    return null;
  }
}
