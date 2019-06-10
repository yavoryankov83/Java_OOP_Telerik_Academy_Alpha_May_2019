package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Person {

  private String name;
  private int age;
  private String phone;

  private List<String> interests;
  private List<Person> friends;

  public Person(String name, int age, String phone, String... interests) {
    setName(name);
    setAge(age);
    setPhone(phone);

    this.interests = new ArrayList<>(Arrays.asList(interests));
    friends = new ArrayList<>();
  }

  private void setName(String name) {
    this.name = name;
  }

  private void setAge(int age) {
    this.age = age;
  }

  private void setPhone(String phone) {
    this.phone = phone;
  }

  //always return a new collection of the field or Collections.unmodifiableList(interests),
  // so no one can modify it from outside
  public List<String> getInterests() {
    //return new ArrayList<>(interests);
    return Collections.unmodifiableList(interests);
  }

  public void addInterests(String interest){
    interests.add(interest);
  }

  public void showInterests() {
    System.out.print("My interests are: ");

    for (String interest : interests) {
      System.out.printf("%s, ", interest);
    }

    System.out.println();
  }

  public List<Person> getFriends() {
    return Collections.unmodifiableList(friends);
  }

  public void addFriends(Person... person){
    for (Person p : person) {
      friends.add(p);
    }
  }

  public void showFriends() {
    System.out.print("My friends are: ");

    for (Person person : friends) {
      System.out.printf("%s, ", person);
    }

    System.out.println();
  }

  public void introducePerson() {
    System.out.printf("Hey, I am %s and I am %d years old :)%n", name, age);
  }

  public void sharePhone() {
    System.out.printf("You can contact me at %s%n", phone);
  }

  @Override
  public String toString() {
    return name;
  }
}
