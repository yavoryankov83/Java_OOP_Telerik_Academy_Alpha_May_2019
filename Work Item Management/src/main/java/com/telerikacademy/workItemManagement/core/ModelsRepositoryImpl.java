package com.telerikacademy.workItemManagement.core;

import com.telerikacademy.workItemManagement.core.contracts.ModelsRepository;
import com.telerikacademy.workItemManagement.models.contracts.Board;
import com.telerikacademy.workItemManagement.models.contracts.Member;
import com.telerikacademy.workItemManagement.models.contracts.Team;
import com.telerikacademy.workItemManagement.models.contracts.WorkItem;

import java.util.HashMap;
import java.util.Map;

public class ModelsRepositoryImpl implements ModelsRepository {

  private Map<String, Team> teams;
  private Map<String, Member> members;
  private Map<String, Board> boards;
  private Map<Integer, WorkItem> workItems;

  public Map<String, Team> getTeams() {
    return new HashMap<String, Team>(teams);
  }

  public Map<String, Member> getMembers() {
    return new HashMap<String, Member>(members);
  }

  public Map<String, Board> getBoards() {
    return new HashMap<String, Board>(boards);
  }

  public Map<Integer, WorkItem> getWorkItems() {
    return new HashMap<Integer, WorkItem>(workItems);
  }

  public void addTeam(String name, Team team) {
    teams.put(name, team);
  }

  public void addMember(String name, Member member) {
    members.put(name, member);
  }

  public void addBoard(String name, Board board) {
    boards.put(name, board);
  }

  public void addWorkItem(Integer id, WorkItem workItem) {
    workItems.put(id, workItem);
  }
}
