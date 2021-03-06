package com.myproject.insurancePlan;

import com.myproject.insuranceBrand.InsuranceBrand;

public class SilverPlan extends AbstractHealthInsurancePlan {

  private static final double COVERAGE_SILVER = 0.7;
  private static final int DISCOUNT_SILVER = 30;
  private static final double PREMIUM_SILVER = 0.06;

  public SilverPlan(InsuranceBrand offeredBy) {
    super(offeredBy);
    setCoverage(COVERAGE_SILVER);
    setDiscount(DISCOUNT_SILVER);
  }

  @Override
  public double computeMonthlyPremium(double salary, int age, boolean smoking) {
    return salary * PREMIUM_SILVER + getOfferedBy().computeMonthlyPremium(this, age, smoking);
  }
}
