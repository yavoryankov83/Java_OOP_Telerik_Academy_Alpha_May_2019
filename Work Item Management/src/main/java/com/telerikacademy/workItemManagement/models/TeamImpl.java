package com.telerikacademy.workItemManagement.models;

import com.telerikacademy.workItemManagement.models.common.Validator;
import com.telerikacademy.workItemManagement.models.contracts.Board;
import com.telerikacademy.workItemManagement.models.contracts.Member;
import com.telerikacademy.workItemManagement.models.contracts.Team;

import java.util.*;

public class TeamImpl implements Team {

  private static final String TEAM_NAME_NULL_EXCEPTION =
          "Team name should not be null.";

  private String name;
  private List<Member> members;
  private List<Board> boards;

  public TeamImpl(String name) {
    setName(name);
    members = new ArrayList<Member>();
    boards = new ArrayList<Board>();
  }

  public String getName() {
    return name;
  }

  private void setName(String name) {
    Validator.validateForNullValue(name, TEAM_NAME_NULL_EXCEPTION);

    this.name = name;
  }

  public List<Member> getMembers() {
    return Collections.unmodifiableList(members);
  }

  public List<Board> getBoards() {
    return Collections.unmodifiableList(boards);
  }
}
