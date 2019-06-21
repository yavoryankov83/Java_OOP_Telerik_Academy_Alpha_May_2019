package com.telerikacademy.cosmetics.core.providers;

import com.telerikacademy.cosmetics.core.contracts.CommandParser;

import java.util.ArrayList;
import java.util.List;

public class CommandParserImpl implements CommandParser {

  @Override
  public String parseCommand(String fullCommand) {
    String commandName = fullCommand.split(" ")[0];
    return commandName;
  }

  @Override
  public List<String> parseParameters(String fullCommand) {
    String[] commandParts = fullCommand.split(" ");
    ArrayList<String> parameters = new ArrayList<>();
    for (int i = 1; i < commandParts.length; i++) {
      parameters.add(commandParts[i]);
    }
    return parameters;
  }
}
