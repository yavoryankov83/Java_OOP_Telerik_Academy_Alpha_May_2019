public class Staff extends User {

  private int yearsOfExperience;
  private String description;
  private double salary;

  protected Staff(long id, String firtName, String lastName, String gender,
               String email, int yearsOfExperience,
               String description, double salary) {
    super(id, firtName, lastName, gender, email);
    setYearsOfExperience(yearsOfExperience);
    setDescription(description);
    setSalary(salary);
  }

  public int getYearsOfExperience() {
    return yearsOfExperience;
  }

  private void setYearsOfExperience(int yearsOfExperience) {
    this.yearsOfExperience = yearsOfExperience;
  }

  public String getDescription() {
    return description;
  }

  private void setDescription(String description) {
    this.description = description;
  }

  public double getSalary() {
    return salary;
  }

  private void setSalary(double salary) {
    this.salary = salary;
  }
}
