package com.telerikacademy.workItemManagement.models.contracts;

import com.telerikacademy.workItemManagement.models.enums.PriorityType;
import com.telerikacademy.workItemManagement.models.enums.SizeType;
import com.telerikacademy.workItemManagement.models.enums.StoryStatusType;

public interface Story extends WorkItem {

  PriorityType getPriority();

  SizeType getSize();

  StoryStatusType getStatus();

  Member getAssignee();
}
