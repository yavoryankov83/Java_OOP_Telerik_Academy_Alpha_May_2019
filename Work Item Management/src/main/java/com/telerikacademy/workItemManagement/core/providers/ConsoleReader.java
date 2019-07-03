package com.telerikacademy.workItemManagement.core.providers;

import com.telerikacademy.workItemManagement.core.contracts.Reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader implements Reader {

  private final BufferedReader reader;

  public ConsoleReader() {
    this.reader = new BufferedReader(new InputStreamReader(System.in));
  }

  public String readline() throws IOException {
    return reader.readLine();
  }
}
