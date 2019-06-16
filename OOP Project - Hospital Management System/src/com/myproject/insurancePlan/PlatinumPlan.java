package com.myproject.insurancePlan;

import com.myproject.insuranceBrand.InsuranceBrand;

public class PlatinumPlan extends HealthInsurancePlan {

  private static final double COVERAGE_PLATINUM = 0.9;
  private static final int DISCOUNT_PLATINUM = 50;
  private static final double PREMIUM_PLATINUM = 0.08;

  public PlatinumPlan(InsuranceBrand offeredBy) {
    super(offeredBy);
    setCoverage(COVERAGE_PLATINUM);
    setDiscount(DISCOUNT_PLATINUM);
  }

  @Override
  public double computeMonthlyPremium(double salary, int age, boolean smoking) {
    return salary * PREMIUM_PLATINUM + getOfferedBy().computeMonthlyPremium(this, age, smoking);
  }
}
