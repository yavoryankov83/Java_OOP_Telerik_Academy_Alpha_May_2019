package com.telerikacademy.workItemManagement.commands;

import com.telerikacademy.workItemManagement.commands.contracts.Command;
import com.telerikacademy.workItemManagement.core.contracts.ModelsFactory;
import com.telerikacademy.workItemManagement.core.contracts.ModelsRepository;
import com.telerikacademy.workItemManagement.models.contracts.Board;

import java.util.List;

import static com.telerikacademy.workItemManagement.commands.CommandConstants.*;

public class CreateBoard implements Command {
  private static final int CORRECT_NUMBER_OF_ARGUMENTS = 1;

  private ModelsRepository repository;
  private ModelsFactory factory;

  public CreateBoard(ModelsRepository repository, ModelsFactory factory) {
    this.repository = repository;
    this.factory = factory;
  }

  public String execute(List<String> parameters) {
    if (parameters.size() != CORRECT_NUMBER_OF_ARGUMENTS){
      throw new IllegalArgumentException(String.format(
              INVALID_NUMBER_OF_ARGUMENTS,
              CORRECT_NUMBER_OF_ARGUMENTS,
              parameters.size()));
    }

    String name = parameters.get(0);

    return createBoard(name);
  }

  private String createBoard(String name) {
    if (repository.getTeams().containsKey(name)){
      return String.format(BOARD_EXISTS_MESSAGE, name);
    }

    Board board = factory.createBoard(name);
    repository.addBoard(name, board);

    return String.format(BOARD_CREATED_SUCCESS_MESSAGE, name);
  }
}
