package com.myproject.user;

import com.myproject.insurancePlan.AbstractHealthInsurancePlan;

class Patient extends User {

  Patient(String firstName,
          String lastName,
          String gender,
          String email,
          boolean insured,
          AbstractHealthInsurancePlan insurancePlan,
          int age,
          boolean smoking) {
    super(firstName, lastName, gender, email, insured, insurancePlan, age, smoking);
  }
}
