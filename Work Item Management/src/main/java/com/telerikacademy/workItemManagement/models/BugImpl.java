package com.telerikacademy.workItemManagement.models;

import com.telerikacademy.workItemManagement.models.contracts.Bug;
import com.telerikacademy.workItemManagement.models.contracts.Member;
import com.telerikacademy.workItemManagement.models.enums.PriorityType;
import com.telerikacademy.workItemManagement.models.enums.SeverityType;
import com.telerikacademy.workItemManagement.models.enums.BugStatusType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BugImpl extends AbstractWorkItem implements Bug {

  private List<String> stepsToReproduce;
  private PriorityType priority;
  private SeverityType severity;
  private BugStatusType status;
  private Member assignee;

  public BugImpl(int id,
                 String title,
                 String description,
                 PriorityType priority,
                 SeverityType severity,
                 BugStatusType status,
                 Member assignee) {
    super(id, title, description);
    stepsToReproduce = new ArrayList<String>();
    this.priority = priority;
    this.severity = severity;
    this.status = status;
    this.assignee = assignee;
  }

  public List<String> getStepsToReproduce() {
    return Collections.unmodifiableList(stepsToReproduce);
  }

  public PriorityType getPriority() {
    return priority;
  }

  public SeverityType getSeverity() {
    return severity;
  }

  public BugStatusType getStatus() {
    return status;
  }

  public Member getAssignee() {
    return assignee;
  }
}
