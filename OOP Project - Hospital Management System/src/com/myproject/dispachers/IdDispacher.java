package com.myproject.dispachers;

public final class IdDispacher {

  private static long id;

  private IdDispacher() {
  }

  public static long getId() {
    return ++IdDispacher.id;
  }
}
