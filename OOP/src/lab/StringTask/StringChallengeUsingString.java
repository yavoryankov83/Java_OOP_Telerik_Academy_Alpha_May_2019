package lab.StringTask;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringChallengeUsingString {


  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    //read input
    String input = "git is a <<version control>> system for tracking changes " +
            "in <<computer files>> and coordinating workon those files among multiple people";

    //iterate over input
    for (int i = 0; i < input.length(); i++) {
      //get start index of "<<"
      int startIndex = input.indexOf("<<");
      //get end index of ">>"
      int endIndex = input.indexOf(">>");

      //iterate while start ot end index become -1, while we don't have "<<" or ">>"
      while (startIndex != -1 || endIndex != -1) {
        //get the string we must replace with string.toUpper
        String stringToReplace = input.substring(startIndex + 2, endIndex);
        //replace the string
        input = input
                .replaceFirst(input.substring(startIndex, endIndex + 2),
                        stringToReplace.toUpperCase());

        //update indexes
        startIndex = input.indexOf("<<");
        endIndex = input.indexOf(">>");
      }

      //break iteration
      break;
    }
    //print
    System.out.println(input);
  }
}

