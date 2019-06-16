package com.myproject.insuranceBrand_models;

import com.myproject.contracts.InsuranceBrand;
import com.myproject.dispachers.IdDispacher;
import com.myproject.insurance_models.HealthInsurancePlan;

public class BlueCrossBlueShield implements InsuranceBrand {

  private long id;
  private String name;

  public BlueCrossBlueShield(String name) {
    setId(IdDispacher.getId());
    setName(name);
  }

  public long getId() {
    return id;
  }

  private void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  private void setName(String name) {
    this.name = name;
  }

  @Override
  public double computeMonthlyPremium(HealthInsurancePlan insurancePlan, int age, boolean smoking) {
    return calculatePremium(insurancePlan, age, smoking);
  }

  private double calculatePremium(HealthInsurancePlan insurancePlan, int age, boolean smoking) {
    String planName = insurancePlan.getClass().getSimpleName();

    double premium = 0;

    switch (planName) {
      case "PlatinumPlan":
        return calculatePlatinumPlanPremium(age, smoking, premium);

      case "GoldPlan":
        return calculateGoldPlanPremium(age, smoking, premium);

      case "SilverPlan":
        return calculateSilverPlanPremium(age, smoking, premium);

      case "BronzePlan":
        return calculateBronzePlanPremium(age, smoking, premium);
    }

    return premium;
  }

  private double calculateBronzePlanPremium(int age, boolean smoking, double premium) {
    if (age > 55) {
      premium += 50;
    }
    if (smoking) {
      premium += 70;
    }

    return premium;
  }

  private double calculateSilverPlanPremium(int age, boolean smoking, double premium) {
    if (age > 55) {
      premium += 100;
    }
    if (smoking) {
      premium += 80;
    }

    return premium;
  }

  private double calculateGoldPlanPremium(int age, boolean smoking, double premium) {
    if (age > 55) {
      premium += 150;
    }
    if (smoking) {
      premium += 90;
    }

    return premium;
  }

  private double calculatePlatinumPlanPremium(int age, boolean smoking, double premium) {
    if (age > 55) {
      premium += 200;
    }
    if (smoking) {
      premium += 100;
    }

    return premium;
  }
}
