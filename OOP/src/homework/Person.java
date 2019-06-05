package homework;

import java.util.ArrayList;
import java.util.List;

public class Person {

  private String name;
  private int age;
  private String phone;
  private List<String> interests;
  private List<Person> friends;

  public Person(String name, int age, String phone) {
    this.name = name;
    this.age = age;
    this.phone = phone;
    this.interests = new ArrayList<>();
    this.friends = new ArrayList<>();
  }

  private String getName() {
    return name;
  }

  public void introducePerson() {
    System.out.printf("Hey, I am %s and I am %d years old :)\n", name, age);
  }

  public void sharePhone() {
    System.out.printf("You can contact me at %s\n", phone);
  }

  public void addInterests(String... interests) {
    List<String> result = new ArrayList<>();

    for (String interest : interests) {
      result.add(interest);
    }

    this.interests = result;
  }

  public void showInterests() {
    System.out.print("My interests are: ");

    for (String interest : interests) {
      System.out.printf("%s, ", interest);
    }

    System.out.println();
  }

  public void addFriends(Person... people) {
    List<Person> result = new ArrayList<>();

    for (Person person : people) {
      result.add(person);
    }

    this.friends = result;
  }

  public void showFriends() {
    System.out.print("My friends are: ");

    for (Person person : friends) {
      System.out.printf("%s, ", person);
    }

    System.out.println();
  }

  @Override
  public String toString() {
    return getName();
  }
}
