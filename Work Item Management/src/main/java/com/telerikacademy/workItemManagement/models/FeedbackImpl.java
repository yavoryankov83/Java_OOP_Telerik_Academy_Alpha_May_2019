package com.telerikacademy.workItemManagement.models;

import com.telerikacademy.workItemManagement.models.contracts.Feedback;
import com.telerikacademy.workItemManagement.models.enums.FeedbackStatusType;

public class FeedbackImpl extends AbstractWorkItem implements Feedback {

  private int rating;
  private FeedbackStatusType status;

  public FeedbackImpl(int id,
                      String title,
                      String description,
                      int rating,
                      FeedbackStatusType status) {
    super(id, title, description);
    this.rating = rating;
    this.status = status;
  }

  public int getRating() {
    return rating;
  }

  public FeedbackStatusType getStatus() {
    return status;
  }
}
