package com.telerikacademy.workItemManagement.core.contracts;

import com.telerikacademy.workItemManagement.models.contracts.Board;
import com.telerikacademy.workItemManagement.models.contracts.Member;
import com.telerikacademy.workItemManagement.models.contracts.Team;
import com.telerikacademy.workItemManagement.models.contracts.WorkItem;

import java.util.Map;

public interface ModelsRepository {

  Map<String, Team> getTeams();

  Map<String, Member> getMembers();

  Map<String, Board> getBoards();

  Map<Integer, WorkItem> getWorkItems();

  void addTeam(String name, Team team);

  void addMember(String name, Member member);

  void addBoard(String name, Board board);

  void addWorkItem(Integer id, WorkItem workItem);
}
