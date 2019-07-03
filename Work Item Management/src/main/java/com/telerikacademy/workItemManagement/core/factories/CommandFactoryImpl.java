package com.telerikacademy.workItemManagement.core.factories;

import com.telerikacademy.workItemManagement.commands.CreateBoard;
import com.telerikacademy.workItemManagement.commands.CreateTeam;
import com.telerikacademy.workItemManagement.commands.contracts.Command;
import com.telerikacademy.workItemManagement.commands.enums.CommandType;
import com.telerikacademy.workItemManagement.core.contracts.CommandFactory;
import com.telerikacademy.workItemManagement.core.contracts.ModelsFactory;
import com.telerikacademy.workItemManagement.core.contracts.ModelsRepository;

public class CommandFactoryImpl implements CommandFactory {

  private static final String INVALID_COMMAND = "Invalid command name: %s!";

  public Command createCommand(String commandTypeAsString, ModelsRepository repository, ModelsFactory factory) {
    CommandType commandType = CommandType.valueOf(commandTypeAsString.toUpperCase());

    switch (commandType){
      case CREATETEAM:
        return new CreateTeam(repository, factory);

      case CREATEBOARD:
        return new CreateBoard(repository, factory);
    }

    throw new IllegalArgumentException(String.format(INVALID_COMMAND, commandTypeAsString));
  }
}
