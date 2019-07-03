package com.telerikacademy.workItemManagement.tests.core.factories;

import com.telerikacademy.workItemManagement.core.contracts.ModelsFactory;
import com.telerikacademy.workItemManagement.core.factories.ModelsFactoryImpl;
import com.telerikacademy.workItemManagement.models.contracts.Team;
import org.junit.Test;
import org.junit.Assert;

public class ModelsFactoryImpl_Tests {

  @Test
  public void createTeam_should_createNewTeam_when_passedValidParameters() {
    // Arrange & Act
    ModelsFactory factory = new ModelsFactoryImpl();
    Team team = factory.createTeam("Neards");

    // Assert
    Assert.assertEquals("Neards", team.getName());
  }
}
