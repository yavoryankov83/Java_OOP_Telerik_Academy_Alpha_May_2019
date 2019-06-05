package lab.person_Class;

public class Main {

  public static void main(String[] args) {
    Person person = new Person("Ivan", 45, "+359887693584");

    person.introduce();
    person.shareContact();
  }
}
