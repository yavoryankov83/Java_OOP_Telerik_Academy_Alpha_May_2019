package com.telerikacademy.workItemManagement.core.contracts;

import com.telerikacademy.workItemManagement.models.contracts.*;
import com.telerikacademy.workItemManagement.models.enums.*;

public interface ModelsFactory {

  Team createTeam(String name);

  Board createBoard(String name);

  Member createMember(String name);

  WorkItem createBug(int id,
                     String title,
                     String description,
                     PriorityType priority,
                     SeverityType severity,
                     BugStatusType status,
                     Member assignee);

  WorkItem createStory(int id,
                       String title,
                       String description,
                       PriorityType priority,
                       SizeType size,
                       StoryStatusType status,
                       Member assignee);

  WorkItem createFeedback(int id,
                          String title,
                          String description,
                          int rating,
                          FeedbackStatusType status);
}
