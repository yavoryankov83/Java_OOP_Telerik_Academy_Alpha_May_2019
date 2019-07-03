package com.telerikacademy.workItemManagement.models;

import com.telerikacademy.workItemManagement.models.contracts.Comment;
import com.telerikacademy.workItemManagement.models.contracts.WorkItem;
import com.telerikacademy.workItemManagement.models.common.UIpProviderImpl;
import com.telerikacademy.workItemManagement.models.common.Validator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class AbstractWorkItem implements WorkItem {

  private static final int WORKITEM_TITLE_MIN_LENGTH = 10;
  private static final int WORKITEM_TITLE_MAX_LENGTH = 50;
  private static final String WORKITEM_TITLE_LENGTH_EXCEPTION =
          "Work item title length should be between 10 and 50 symbols.";
  private static final String WORKITEM_TITLE_NULL_EXCEPTION =
          "Work item title should not be null.";
  private static final String WORKITEM_DESCRIPTION_NULL_EXCEPTION =
          "Work item description should not be null.";
  private static final int WORKITEM_DESCRIPTION_MIN_LENGTH = 10;
  private static final int WORKITEM_DESCRIPTION_MAX_LENGTH = 500;
  private static final String WORKITEM_DESCRIPTION_LENGTH_EXCEPTION =
          "Work item description length shpuld be between 10 and 500 symbols.";

  private long id;
  private String title;
  private String description;
  private List<Comment> comments;
  private List<String> history;

  public AbstractWorkItem(int id, String title, String description) {
    this.id = UIpProviderImpl.getUId();
    setTitle(title);
    setDescription(description);
    comments = new ArrayList<Comment>();
    history = new ArrayList<String>();
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  private void setTitle(String title) {
    Validator.validateForNullValue(title, WORKITEM_TITLE_NULL_EXCEPTION);

    Validator.validateFieldMinAndMaxBoundries(
            title.length(),
            WORKITEM_TITLE_MIN_LENGTH,
            WORKITEM_TITLE_MAX_LENGTH,
            WORKITEM_TITLE_LENGTH_EXCEPTION);

    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  private void setDescription(String description) {
    Validator.validateForNullValue(description, WORKITEM_DESCRIPTION_NULL_EXCEPTION);

    Validator.validateFieldMinAndMaxBoundries(
            description.length(),
            WORKITEM_DESCRIPTION_MIN_LENGTH,
            WORKITEM_DESCRIPTION_MAX_LENGTH,
            WORKITEM_DESCRIPTION_LENGTH_EXCEPTION);

    this.description = description;
  }

  public List<Comment> getComments() {
    return Collections.unmodifiableList(comments);
  }

  public List<String> getHistory() {
    return Collections.unmodifiableList(history);
  }
}
