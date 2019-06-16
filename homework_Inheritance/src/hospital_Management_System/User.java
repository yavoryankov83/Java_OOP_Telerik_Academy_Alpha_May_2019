package homework_Inheritance.hospital_Management_System;

public class User {

  //static for all users and increment in constructor
  private static long id;

  private String firtName;
  private String lastName;
  private String gender;
  private String email;

  public User(String firtName, String lastName, String gender, String email) {
    setId(++User.id);
    setFirtName(firtName);
    setLastName(lastName);
    setGender(gender);
    setEmail(email);
  }

  public static long getId() {
    return id;
  }

  public static void setId(long id) {
    User.id = id;
  }

  public String getFirtName() {
    return firtName;
  }

  public void setFirtName(String firtName) {
    this.firtName = firtName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
