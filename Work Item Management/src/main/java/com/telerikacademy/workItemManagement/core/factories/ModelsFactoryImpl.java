package com.telerikacademy.workItemManagement.core.factories;

import com.telerikacademy.workItemManagement.core.contracts.ModelsFactory;
import com.telerikacademy.workItemManagement.models.*;
import com.telerikacademy.workItemManagement.models.contracts.*;
import com.telerikacademy.workItemManagement.models.enums.*;

public class ModelsFactoryImpl implements ModelsFactory {

  public Team createTeam(String name) {
    return new TeamImpl(name);
  }

  public Board createBoard(String name) {
    return new BoardImpl(name);
  }

  public Member createMember(String name) {
    return new MemberImpl(name);
  }

  public WorkItem createBug(int id,
                            String title,
                            String description,
                            PriorityType priority,
                            SeverityType severity,
                            BugStatusType status,
                            Member assignee) {
    return new BugImpl(id,
            title,
            description,
            priority,
            severity,
            status,
            assignee);
  }

  public WorkItem createStory(int id,
                              String title,
                              String description,
                              PriorityType priority,
                              SizeType size,
                              StoryStatusType status,
                              Member assignee) {
    return new StoryImpl(id,
            title,
            description,
            priority,
            size,
            status,
            assignee);
  }

  public WorkItem createFeedback(int id,
                                 String title,
                                 String description,
                                 int rating,
                                 FeedbackStatusType status) {
    return new FeedbackImpl(id, title, description, rating, status);
  }
}
