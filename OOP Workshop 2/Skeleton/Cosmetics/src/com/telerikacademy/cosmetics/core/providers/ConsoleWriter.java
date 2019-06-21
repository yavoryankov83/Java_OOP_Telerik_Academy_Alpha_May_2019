package com.telerikacademy.cosmetics.core.providers;

import com.telerikacademy.cosmetics.core.contracts.Writer;

public class ConsoleWriter implements Writer {

  @Override
  public void write(String message) {
    System.out.print(message);
  }

  @Override
  public void writeLine(String message) {
    System.out.println(message);
  }
}
