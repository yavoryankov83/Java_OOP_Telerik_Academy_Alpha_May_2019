package com.myproject.insurance_models;

import com.myproject.contracts.InsuranceBrand;

public class BronzePlan extends HealthInsurancePlan {

  private static final double COVERAGE_BRONZE = 0.6;
  private static final int DISCOUNT_BRONZE = 25;
  private static final double PREMIUM_BRONZE = 0.05;

  public BronzePlan(InsuranceBrand offeredBy) {
    super(offeredBy);
    setCoverage(COVERAGE_BRONZE);
    setDiscount(DISCOUNT_BRONZE);
  }

  @Override
  public double computeMonthlyPremium(double salary, int age, boolean smoking) {
    return salary * PREMIUM_BRONZE + getOfferedBy().computeMonthlyPremium(this, age, smoking);
  }
}
