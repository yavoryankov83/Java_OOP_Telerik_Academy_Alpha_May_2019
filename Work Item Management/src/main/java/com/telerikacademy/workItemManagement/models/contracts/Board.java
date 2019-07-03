package com.telerikacademy.workItemManagement.models.contracts;

import java.util.List;

public interface Board {

  String getName();

  List<WorkItem> getWorkItems();

  List<String> getHistory();
}
