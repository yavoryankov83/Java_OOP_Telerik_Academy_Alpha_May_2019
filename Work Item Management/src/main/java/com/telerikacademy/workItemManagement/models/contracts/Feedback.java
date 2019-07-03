package com.telerikacademy.workItemManagement.models.contracts;

import com.telerikacademy.workItemManagement.models.enums.FeedbackStatusType;

public interface Feedback extends WorkItem {

  int getRating();

  FeedbackStatusType getStatus();
}
