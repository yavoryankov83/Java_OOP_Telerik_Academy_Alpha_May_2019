package com.telerikacademy.workItemManagement.core.providers;

import com.telerikacademy.workItemManagement.core.contracts.Writer;

public class ConsoleWriter implements Writer {

  public void writeLine(String input) {
    System.out.println(input);
  }

  public void write(String input) {
    System.out.print(input);
  }
}
