package com.telerikacademy.workItemManagement.models;

import com.telerikacademy.workItemManagement.models.contracts.Member;
import com.telerikacademy.workItemManagement.models.contracts.WorkItem;
import com.telerikacademy.workItemManagement.models.common.Validator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MemberImpl implements Member {

  private static final String MEMBER_NAME_NULL_EXCEPTION =
          "Member name should not be null";
  private static final String MEMBER_NAME_LENGTH_EXCEPTION =
          "Member name length should be between 5 and 15 symbols.";
  private static final int MEMBER_NAME_MIN_LENGTH = 5;
  private static final int MEMBER_NAME_MAX_LENGTH = 15;

  private String name;
  private List<WorkItem> workItems;
  private List<String> history;

  public MemberImpl(String name) {
    setName(name);
    workItems = new ArrayList<WorkItem>();
    history = new ArrayList<String>();
  }

  public String getName() {
    return name;
  }

  private void setName(String name) {
    Validator.validateForNullValue(name, MEMBER_NAME_NULL_EXCEPTION);

    Validator.validateFieldMinAndMaxBoundries(
            name.length(),
            MEMBER_NAME_MIN_LENGTH,
            MEMBER_NAME_MAX_LENGTH,
            MEMBER_NAME_LENGTH_EXCEPTION);

    this.name = name;
  }

  public List<WorkItem> getWorkItems() {
    return Collections.unmodifiableList(workItems);
  }

  public List<String> getHistory() {
    return Collections.unmodifiableList(history);
  }
}
