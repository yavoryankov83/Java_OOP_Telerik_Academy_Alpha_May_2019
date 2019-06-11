package lab_Classes.person_Class;

public class Person {

  private String name;
  private int age;
  private String phoneNumber;

  public Person(String name, int age, String phoneNumber) {
    this.name = name;
    this.age = age;
    this.phoneNumber = phoneNumber;
  }

  public void introduce() {
    System.out.printf("Hey, I am %s and I am %d years old.", this.name, this.age);
    System.out.println();
  }

  public void shareContact() {
    System.out.printf("You can contact me at %s.", this.phoneNumber);
    System.out.println();
  }
}
