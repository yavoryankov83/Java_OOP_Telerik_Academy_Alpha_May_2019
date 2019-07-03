package com.telerikacademy.workItemManagement.models;

import com.telerikacademy.workItemManagement.models.contracts.Board;
import com.telerikacademy.workItemManagement.models.contracts.WorkItem;
import com.telerikacademy.workItemManagement.models.common.Validator;

import java.util.*;

public class BoardImpl implements Board {

  private static final String BOARD_NAME_NULL_EXCEPTION =
          "Board name should not be null.";
  private static final String BOARD_NAME_LENGTH_EXCEPTION =
          "Board name should be between 5 and 10 symbols.";
  private static final int BOARD_NAME_MIN_LENGTH = 5;
  private static final int BOARD_NAME_MAX_LENGTH = 10;

  private String name;
  private List<WorkItem> workItems;
  private List<String> history;

  public BoardImpl(String name) {
    setName(name);
    workItems = new ArrayList<WorkItem>();
    history = new ArrayList<String>();
  }

  public String getName() {
    return name;
  }

  private void setName(String name) {
    Validator.validateForNullValue(name, BOARD_NAME_NULL_EXCEPTION);

    Validator.validateFieldMinAndMaxBoundries(
            name.length(),
            BOARD_NAME_MIN_LENGTH,
            BOARD_NAME_MAX_LENGTH,
            BOARD_NAME_LENGTH_EXCEPTION);
    this.name = name;
  }

  public List<WorkItem> getWorkItems() {
    return Collections.unmodifiableList(workItems);
  }

  public List<String> getHistory() {
    return Collections.unmodifiableList(history);
  }
}
