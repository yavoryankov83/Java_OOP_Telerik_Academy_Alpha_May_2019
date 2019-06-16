package com.myproject.user_models;

import com.myproject.insurance_models.HealthInsurancePlan;

class Patient extends User {

  Patient(String firstName,
          String lastName,
          String gender,
          String email,
          boolean insured,
          HealthInsurancePlan insurancePlan,
          int age,
          boolean smoking) {
    super(firstName, lastName, gender, email, insured, insurancePlan, age, smoking);
  }
}
