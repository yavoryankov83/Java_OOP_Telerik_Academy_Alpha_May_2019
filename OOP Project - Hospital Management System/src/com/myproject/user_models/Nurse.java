package com.myproject.user_models;

import com.myproject.insurance_models.HealthInsurancePlan;

class Nurse extends Staff {

  Nurse(String firstName,
        String lastName,
        String gender,
        String email,
        boolean insured,
        HealthInsurancePlan insurancePlan,
        int age,
        boolean smoking,
        int yearsOfExperience,
        String description,
        double salary) {
    super(firstName, lastName, gender, email, insured, insurancePlan, age,
            smoking, yearsOfExperience, description, salary);
  }
}
