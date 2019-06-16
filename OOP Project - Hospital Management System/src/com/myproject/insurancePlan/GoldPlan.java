package com.myproject.insurancePlan;

import com.myproject.insuranceBrand.InsuranceBrand;

public class GoldPlan extends AbstractHealthInsurancePlan {

  private static final double COVERAGE_GOLD = 0.8;
  private static final int DISCOUNT_GOLD = 40;
  private static final double PREMIUM_GOLD = 0.07;

  public GoldPlan(InsuranceBrand offeredBy) {
    super(offeredBy);
    setCoverage(COVERAGE_GOLD);
    setDiscount(DISCOUNT_GOLD);
  }

  @Override
  public double computeMonthlyPremium(double salary, int age, boolean smoking) {
    return salary * PREMIUM_GOLD + getOfferedBy().computeMonthlyPremium(this, age, smoking);
  }
}
