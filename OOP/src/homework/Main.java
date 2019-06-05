package homework;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Person> personList = new ArrayList<>();

    Person person0 = new Person("Pesho", 23, "0887123456");
    Person person1 = new Person("Gosho", 30, "0887654321");
    Person person2 = new Person("Ivana", 21, "0887112233");
    Person person3 = new Person("Misho", 25, "0888888888");
    Person person4 = new Person("Rumi", 27, "0885588111");

    person0.addInterests("Football", "Computer Games");
    person0.addFriends(person1, person3);
    personList.add(person0);


    person1.addInterests("Ski", "Climbing", "Programming");
    person1.addFriends(person4);
    personList.add(person1);


    person2.addInterests("Books", "Cooking");
    person2.addFriends(person0, person4);
    personList.add(person2);


    person3.addInterests("Music", "Play drums", "Yoga");
    person3.addFriends(person0, person1, person2, person4);
    personList.add(person3);


    person4.addInterests("Programming", "Dancing");
    person4.addFriends(person2);
    personList.add(person4);

    for (Person person : personList) {
      person.introducePerson();
      person.sharePhone();
      person.showInterests();
      person.showFriends();

      System.out.println();
    }
  }
}
