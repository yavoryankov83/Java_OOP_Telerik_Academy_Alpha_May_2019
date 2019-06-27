package com.telerikacademy.furniture.commands;

import com.telerikacademy.furniture.commands.contracts.Command;
import com.telerikacademy.furniture.core.contracts.FurnitureFactory;
import com.telerikacademy.furniture.core.contracts.FurnitureRepository;
import com.telerikacademy.furniture.models.contracts.Table;

import java.util.List;

import static com.telerikacademy.furniture.commands.CommandConstants.*;

public class CreateTable implements Command {
  private static final int CORRECT_NUMBER_OF_ARGUMENTS = 6;

  private final FurnitureRepository furnitureRepository;
  private final FurnitureFactory furnitureFactory;

  public CreateTable(FurnitureRepository furnitureRepository, FurnitureFactory furnitureFactory) {
    this.furnitureRepository = furnitureRepository;
    this.furnitureFactory = furnitureFactory;
  }

  @Override
  public String execute(List<String> parameters) {
    if (parameters.size() != CORRECT_NUMBER_OF_ARGUMENTS) {
      throw new IllegalArgumentException(INVALID_NUMBER_OF_ARGUMENTS);
    }

    String tableModel = parameters.get(0);
    String tableMaterial = parameters.get(1);
    double tablePrice = Double.parseDouble(parameters.get(2));
    double tableHeight = Double.parseDouble(parameters.get(3));
    double tableLength = Double.parseDouble(parameters.get(4));
    double tableWidth = Double.parseDouble(parameters.get(5));

    return createTable(tableModel, tableMaterial, tablePrice, tableHeight, tableLength, tableWidth);
  }

  private String createTable(String model, String material, double price, double height, double length, double width) {
    if (furnitureRepository.getFurnitures().containsKey(model)) {
      return String.format(FURNITURE_EXISTS_ERROR_MESSAGE, model);
    }

    Table table = furnitureFactory.createTable(model, material, price, height, length, width);
    furnitureRepository.addFurniture(model, table);

    return String.format(TABLE_CREATED_SUCCESS_MESSAGE, model);
  }
}
