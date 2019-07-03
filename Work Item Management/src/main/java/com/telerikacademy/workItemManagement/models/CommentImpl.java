package com.telerikacademy.workItemManagement.models;

import com.telerikacademy.workItemManagement.models.contracts.Comment;
import com.telerikacademy.workItemManagement.models.contracts.Member;
import com.telerikacademy.workItemManagement.models.common.Validator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CommentImpl implements Comment {

  private static final String AUTHOR_NULL_EXCEPTION =
          "Author should not be null.";

  private Member author;
  private List<String> comments;

  public CommentImpl(Member author) {
    setAuthor(author);
    comments = new ArrayList<String>();
  }

  public Member getAuthor() {
    return author;
  }

  private void setAuthor(Member author) {
    Validator.validateForNullValue(author, AUTHOR_NULL_EXCEPTION);
    this.author = author;
  }

  public List<String> getComments() {
    return Collections.unmodifiableList(comments);
  }
}
