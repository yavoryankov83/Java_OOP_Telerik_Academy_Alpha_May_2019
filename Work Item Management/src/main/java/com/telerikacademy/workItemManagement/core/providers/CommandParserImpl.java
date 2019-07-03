package com.telerikacademy.workItemManagement.core.providers;

import com.telerikacademy.workItemManagement.core.contracts.CommandParser;

import java.util.ArrayList;
import java.util.List;

public class CommandParserImpl implements CommandParser {

  public String parseCommand(String fullCommand) {
    return fullCommand.split("\\s+")[0];
  }

  public List<String> parseParameters(String fullCommand) {
    String[] commandParts = fullCommand.split("\\s+");

    ArrayList<String> parameters = new ArrayList<String>();

    for (int i = 1; i < commandParts.length; i++) {
      parameters.add(commandParts[i]);
    }

    return parameters;
  }
}
