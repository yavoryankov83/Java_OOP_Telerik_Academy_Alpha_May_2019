package com.telerikacademy.workItemManagement.models.contracts;

import java.util.List;

public interface Comment {

  Member getAuthor();

  List<String> getComments();
}
