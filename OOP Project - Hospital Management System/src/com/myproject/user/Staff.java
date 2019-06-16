package com.myproject.user;

import com.myproject.insurancePlan.AbstractHealthInsurancePlan;

class Staff extends User {

  private int yearsOfExperience;
  private String description;
  private double salary;

  Staff(String firstName,
        String lastName,
        String gender,
        String email,
        boolean insured,
        AbstractHealthInsurancePlan insurancePlan,
        int age,
        boolean smoking,
        int yearsOfExperience,
        String description,
        double salary) {
    super(firstName, lastName, gender, email, insured, insurancePlan, age, smoking);
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
