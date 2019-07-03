package com.telerikacademy.workItemManagement.models.contracts;

import com.telerikacademy.workItemManagement.models.enums.BugStatusType;
import com.telerikacademy.workItemManagement.models.enums.PriorityType;
import com.telerikacademy.workItemManagement.models.enums.SeverityType;

import java.util.List;

public interface Bug extends WorkItem {

  List<String> getStepsToReproduce();

  PriorityType getPriority();

  SeverityType getSeverity();

  BugStatusType getStatus();

  Member getAssignee();
}
