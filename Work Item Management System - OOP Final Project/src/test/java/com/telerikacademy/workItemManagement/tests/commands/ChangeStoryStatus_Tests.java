package com.telerikacademy.workItemManagement.tests.commands;

import com.telerikacademy.workItemManagement.commands.changingCommands.ChangeStoryStatus;
import com.telerikacademy.workItemManagement.commands.contracts.Command;
import com.telerikacademy.workItemManagement.core.contracts.ModelsRepository;
import com.telerikacademy.workItemManagement.core.providers.ModelsRepositoryImpl;
import com.telerikacademy.workItemManagement.models.StoryImpl;
import com.telerikacademy.workItemManagement.models.contracts.Member;
import com.telerikacademy.workItemManagement.models.contracts.Story;
import com.telerikacademy.workItemManagement.models.enums.PriorityType;
import com.telerikacademy.workItemManagement.models.enums.SizeType;
import com.telerikacademy.workItemManagement.models.enums.StoryStatusType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ChangeStoryStatus_Tests {
    private Command testCommand;
    private Story testStory;
    private ModelsRepository testRepository;

    @Before
    public void before() {
        testRepository = new ModelsRepositoryImpl();
        testCommand = new ChangeStoryStatus(testRepository);
        Member testAssignee = Mockito.mock(Member.class);
        testStory = new StoryImpl("NewStoryName","Description",
                PriorityType.MEDIUM, SizeType.LARGE, StoryStatusType.INPROGRESS, testAssignee);
        testRepository.addToWorkItems(1L, testStory);
        testRepository.addToStories(1L, testStory);
    }

    @Test(expected = IllegalArgumentException.class)
    public void execute_should_throwException_when_passedLessArguments() {
        // Arrange
        String [] testParameters  = new String[1];
        testParameters [0] = "1";

        // Act & Assert
        testCommand.execute(testParameters);
    }

    @Test(expected = IllegalArgumentException.class)
    public void execute_should_throwException_when_passedMoreArguments() {
        // Arrange
        String [] testParameters  = new String[3];
        testParameters [0] = "1";
        testParameters [1] = "NotDone";
        testParameters [2] = "AssigneeName";

        // Act & Assert
        testCommand.execute(testParameters);
    }

    @Test(expected = IllegalArgumentException.class)
    public void execute_should_throwException_when_passed_invalid_workItem() {
        // Arrange
        String [] testParameters  = new String[2];
        testParameters [0] = "5";
        testParameters [1] = "NotDone";

        // Act&&Assert
        testCommand.execute(testParameters);
    }

    @Test(expected = IllegalArgumentException.class)
    public void execute_should_throwException_when_passedInvalid_id_workItem() {
        // Arrange
        String [] testParameters  = new String[2];
        testParameters [0] = "medium";
        testParameters [1] = "NotDone";

        // Act & Assert
        testCommand.execute(testParameters);
    }

    @Test(expected = IllegalArgumentException.class)
    public void execute_should_throwException_when_passed_invalid_status() {
        // Arrange
        String [] testParameters  = new String[2];
        testParameters [0] = "1";
        testParameters [1] = "PersonName";

        // Act&&Assert
        testCommand.execute(testParameters);
    }

    @Test
    public void execute_should_change_storyStatus_when_inputIsValid() {
        // Arrange
        String [] testParameters  = new String[2];
        testParameters [0] = "1";
        testParameters [1] = "Notdone";

        // Act
        testCommand.execute(testParameters);

        // Assert
        Assert.assertEquals(testParameters[1], testStory.getStatus());
    }

    @Test
    public void execute_should_collect_workItem_activityHistory_when_inputIsValid() {
        // Arrange
        String [] testParameters  = new String[2];
        testParameters [0] = "1";
        testParameters [1] = "NotDone";

        // Act
        testCommand.execute(testParameters);

        // Assert
        Assert.assertEquals("Status of story with id 1 was changed to NOTDONE.",
                testStory.getActivityHistory().get(0));
    }
}
