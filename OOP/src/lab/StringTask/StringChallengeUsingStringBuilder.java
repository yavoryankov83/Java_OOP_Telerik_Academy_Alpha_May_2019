package lab.StringTask;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringChallengeUsingStringBuilder {

  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    long startTime, endTime;

    //read input
    StringBuilder builder = new StringBuilder("git is a <<version control>> system for tracking changes " +
            "in <<computer files>> and coordinating workon those files among multiple people");

    startTime = System.nanoTime();
    for (int i = 0; i < builder.length(); i++) {
      //get start index of "<<"
      int startIndex = builder.indexOf("<<");
      //get end index of ">>"
      int endIndex = builder.indexOf(">>");

      while (startIndex != -1 || endIndex != -1) {
        //get the string we must replace with string.toUpper - stringToReplace = builder.substring(startIndex + 2, endIndex);
        StringBuilder stringToReplace = new StringBuilder(builder.substring(startIndex + 2, endIndex));

        //replace the string
        builder = builder.replace(startIndex, endIndex + 2, stringToReplace.toString().toUpperCase());

        //update indexes
        startIndex = builder.indexOf("<<");
        endIndex = builder.indexOf(">>");
      }

      break;
    }
    endTime = System.nanoTime() - startTime;
    System.out.println(endTime);
    System.out.println(builder);
  }
}
