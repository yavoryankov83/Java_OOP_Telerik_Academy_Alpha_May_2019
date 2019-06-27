package com.telerikacademy.furniture.core.factories;

import com.telerikacademy.furniture.core.contracts.FurnitureFactory;
import com.telerikacademy.furniture.models.*;
import com.telerikacademy.furniture.models.contracts.Chair;
import com.telerikacademy.furniture.models.contracts.Company;
import com.telerikacademy.furniture.models.contracts.Table;
import com.telerikacademy.furniture.models.enums.MaterialType;

public class FurnitureFactoryImpl implements FurnitureFactory {
  @Override
  public Company createCompany(String name, String registrationNumber) {
    return new CompanyImpl(name, registrationNumber);
  }

  @Override
  public Table createTable(String model, String materialType, double price, double height, double length, double width) {
    return new TableImpl(model, getMaterialType(materialType), price, height, length, width);
  }

  @Override
  public Chair createChair(String type, String model, String material, double price, double height, int numberOfLegs) {
    switch (type) {
      case "Normal":
        return new ChairImpl(model, getMaterialType(material), price, height, numberOfLegs);
      case "Adjustable":
        return new AdjustableChairImpl(model, getMaterialType(material), price, height, numberOfLegs);
      case "Convertible":
        return new ConvertibleChairImpl(model, getMaterialType(material), price, height, numberOfLegs);
      default:
        return null;
    }
  }

  private MaterialType getMaterialType(String material) {
    return MaterialType.valueOf(material.toUpperCase());
  }
}
