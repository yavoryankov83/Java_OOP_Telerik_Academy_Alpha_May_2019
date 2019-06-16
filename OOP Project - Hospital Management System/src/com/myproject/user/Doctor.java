package com.myproject.user;

import com.myproject.insurancePlan.HealthInsurancePlan;

class Doctor extends Staff {

  private String specialization;

  Doctor(String firstName,
         String lastName,
         String gender,
         String email,
         boolean insured,
         HealthInsurancePlan insurancePlan,
         int age,
         boolean smoking,
         int yearsOfExperience,
         String description,
         double salary,
         String specialization) {
    super(firstName, lastName, gender, email, insured, insurancePlan, age, smoking,
            yearsOfExperience, description, salary);
    setSpecialization(specialization);
  }

  public String getSpecialization() {
    return specialization;
  }

  private void setSpecialization(String specialization) {
    this.specialization = specialization;
  }
}
