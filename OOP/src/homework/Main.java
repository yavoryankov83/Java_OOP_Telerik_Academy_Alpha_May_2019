package homework;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Person> personList = new ArrayList<>();

    Person person0 = new Person("Pesho", 23, "0887123456",
            "Football", "Computer Games");
    personList.add(person0);
    Person person1 = new Person("Gosho", 30, "0887654321",
            "Ski", "Climbing", "Programming");
    personList.add(person1);
    Person person2 = new Person("Ivana", 21, "0887112233",
            "Books", "Cooking");
    personList.add(person2);
    Person person3 = new Person("Misho", 25, "0888888888",
            "Music", "Play drums", "Yoga");
    personList.add(person3);
    Person person4 = new Person("Rumi", 27, "0885588111",
            "Programming", "Dancing");
    personList.add(person4);

    person0.addInterests("Baseball");
    person0.addFriends(person1, person3, person4);

    person1.addInterests("Baseball");
    person1.addFriends(person4);

    person2.addInterests("Baseball");
    person2.addFriends(person0, person4);

    person3.addInterests("Baseball");
    person3.addFriends(person0, person1, person2, person4);

    person4.addInterests("Baseball");
    person4.addFriends(person2);

    for (Person person : personList) {
      person.introducePerson();
      person.sharePhone();
      person.showInterests();
      person.showFriends();

      System.out.println();
    }
  }
}
