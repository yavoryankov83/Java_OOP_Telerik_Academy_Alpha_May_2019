package com.telerikacademy.workItemManagement.core;

import com.telerikacademy.workItemManagement.commands.contracts.Command;
import com.telerikacademy.workItemManagement.core.contracts.*;
import com.telerikacademy.workItemManagement.core.factories.CommandFactoryImpl;
import com.telerikacademy.workItemManagement.core.factories.ModelsFactoryImpl;
import com.telerikacademy.workItemManagement.core.providers.CommandParserImpl;
import com.telerikacademy.workItemManagement.core.providers.ConsoleReader;
import com.telerikacademy.workItemManagement.core.providers.ConsoleWriter;

import java.util.List;

public class EngineImpl implements Engine {
  private static final String TERMINATION_COMMAND = "Exit";
  private static final String COMMAND_CAN_NOT_BE_NULL_OR_EMPTY = "Command cannot be null or empty.";

  private CommandFactory commandFactory;
  private ModelsFactory modelsFactory;
  private CommandParser commandParser;
  private ModelsRepository repository;
  private Writer writer;
  private Reader reader;

  public EngineImpl() {
    commandFactory = new CommandFactoryImpl();
    modelsFactory = new ModelsFactoryImpl();
    commandParser = new CommandParserImpl();
    repository = new ModelsRepositoryImpl();
    writer = new ConsoleWriter();
    reader = new ConsoleReader();
  }

  public void start() {
    while (true) {
      try {
        String commandAsString = reader.readline();
        if (commandAsString.equalsIgnoreCase(TERMINATION_COMMAND)) {
          break;
        }
        processCommand(commandAsString);

      } catch (Exception ex) {
        writer.writeLine(ex.getMessage() != null && !(ex.getMessage().length() == 0) ? ex.getMessage() : ex.toString());
      }
    }
  }

  private void processCommand(String commandAsString) {
    if (commandAsString == null || commandAsString.trim().equals("")) {
      throw new IllegalArgumentException(COMMAND_CAN_NOT_BE_NULL_OR_EMPTY);
    }

    String commandName = commandParser.parseCommand(commandAsString);
    Command command = commandFactory.createCommand(commandName, repository, modelsFactory);
    List<String> parameters = commandParser.parseParameters(commandAsString);
    String executionResult = command.execute(parameters);
    writer.writeLine(executionResult);
  }
}
