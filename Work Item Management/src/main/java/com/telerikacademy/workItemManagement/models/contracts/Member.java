package com.telerikacademy.workItemManagement.models.contracts;

import java.util.List;

public interface Member {

  String getName();

  List<WorkItem> getWorkItems();

  List<String> getHistory();
}
