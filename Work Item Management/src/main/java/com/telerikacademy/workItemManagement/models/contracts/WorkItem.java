package com.telerikacademy.workItemManagement.models.contracts;

import java.util.List;

public interface WorkItem {

  long getId();

  String getTitle();

  String getDescription();

  List<Comment> getComments();

  List<String> getHistory();
}
