package com.myproject.user;

import com.myproject.insurancePlan.AbstractHealthInsurancePlan;

class Nurse extends Staff {

  Nurse(String firstName,
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
    super(firstName, lastName, gender, email, insured, insurancePlan,
            age, smoking, yearsOfExperience, description, salary);
  }
}
