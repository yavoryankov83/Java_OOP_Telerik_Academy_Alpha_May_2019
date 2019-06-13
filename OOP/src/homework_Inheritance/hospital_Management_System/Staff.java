package homework_Inheritance.hospital_Management_System;

public class Staff extends User {

  private long staffId;
  private int yearsOfExperience;
  private String description;
  private double salary;

  public Staff(String firtName, String lastName, String gender, String email,
               int yearsOfExperience, String description, double salary) {
    super(firtName, lastName, gender, email);
    setStaffId(User.getId());
    setYearsOfExperience(yearsOfExperience);
    setDescription(description);
    setSalary(salary);

  }

  public long getStaffId() {
    return staffId;
  }

  public void setStaffId(long staffId) {
    this.staffId = staffId;
  }

  public int getYearsOfExperience() {
    return yearsOfExperience;
  }

  public void setYearsOfExperience(int yearsOfExperience) {
    this.yearsOfExperience = yearsOfExperience;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
}
