public class User {

  private long id;
  private String firtName;
  private String lastName;
  private String gender;
  private String email;

  protected User(long id, String firtName, String lastName, String gender, String email) {
    setId(id);
    setFirtName(firtName);
    setLastName(lastName);
    setGender(gender);
    setEmail(email);
  }

  public long getId() {
    return id;
  }

  private void setId(long id) {
    this.id = id;
  }

  public String getFirtName() {
    return firtName;
  }

  private void setFirtName(String firtName) {
    this.firtName = firtName;
  }

  public String getLastName() {
    return lastName;
  }

  private void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getGender() {
    return gender;
  }

  private void setGender(String gender) {
    this.gender = gender;
  }

  public String getEmail() {
    return email;
  }

  private void setEmail(String email) {
    this.email = email;
  }
}
