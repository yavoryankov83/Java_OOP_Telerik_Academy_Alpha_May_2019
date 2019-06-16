package lab_Inheritance.hospital_Management_System;

public class Main {

  public static void main(String[] args) {
    User patient1 = new Patient("Ivan", "Ivanov", "men",
            "ivan@abv.bg", true);
    User patient2 = new Patient("Gosho", "Petkov", "men",
            "gosho@abv.bg", false);
    User staff1 = new Staff("Ivo", "Georgiev", "men",
            "ivo@abv.bg", 3, "polite", 50.0);

    System.out.println("Breakpoint");
  }
}
