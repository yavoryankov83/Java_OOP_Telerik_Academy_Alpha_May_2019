package com.telerikacademy.workItemManagement.models;

import com.telerikacademy.workItemManagement.models.contracts.Member;
import com.telerikacademy.workItemManagement.models.contracts.Story;
import com.telerikacademy.workItemManagement.models.enums.PriorityType;
import com.telerikacademy.workItemManagement.models.enums.SizeType;
import com.telerikacademy.workItemManagement.models.enums.StoryStatusType;

public class StoryImpl extends AbstractWorkItem implements Story {

  private PriorityType priority;
  private SizeType size;
  private StoryStatusType status;
  private Member assignee;

  public StoryImpl(int id,
                   String title,
                   String description,
                   PriorityType priority,
                   SizeType size,
                   StoryStatusType status,
                   Member assignee) {
    super(id, title, description);
    this.priority = priority;
    this.size = size;
    this.status = status;
    this.assignee = assignee;
  }

  public PriorityType getPriority() {
    return priority;
  }

  public SizeType getSize() {
    return size;
  }

  public StoryStatusType getStatus() {
    return status;
  }

  public Member getAssignee() {
    return assignee;
  }
}
