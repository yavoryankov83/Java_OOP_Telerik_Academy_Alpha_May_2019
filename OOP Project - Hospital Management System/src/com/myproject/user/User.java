package com.myproject.user;

import com.myproject.IdDispacher;
import com.myproject.insurancePlan.HealthInsurancePlan;

public class User {
  private long id;
  private String firstName;
  private String lastName;
  private String gender;
  private String email;
  private boolean insured;
  private HealthInsurancePlan insurancePlan;
  private int age;
  private boolean smoking;

  public User(String firstName,
              String lastName,
              String gender,
              String email,
              boolean insured,
              HealthInsurancePlan insurancePlan,
              int age,
              boolean smoking) {
    setId(IdDispacher.getId());
    setFirstName(firstName);
    setLastName(lastName);
    setGender(gender);
    setEmail(email);
    setInsured(insured);
    setInsurancePlan(insurancePlan);
    setAge(age);
    setSmoking(smoking);
  }

  public long getId() {
    return id;
  }

  private void setId(long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  private void setFirstName(String firstName) {
    this.firstName = firstName;
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

  public boolean isInsured() {
    return insured;
  }

  private void setInsured(boolean insured) {
    this.insured = insured;
  }

  public HealthInsurancePlan getInsurancePlan() {
    return insurancePlan;
  }

  private void setInsurancePlan(HealthInsurancePlan insurancePlan) {
    this.insurancePlan = insurancePlan;
  }

  public int getAge() {
    return age;
  }

  private void setAge(int age) {
    this.age = age;
  }

  public boolean isSmoking() {
    return smoking;
  }

  private void setSmoking(boolean smoking) {
    this.smoking = smoking;
  }
}
