package com.myproject.factories;

import com.myproject.contracts.HealthInsurancePlanFactory;
import com.myproject.contracts.InsuranceBrand;
import com.myproject.insurance_models.*;

public final class HealthInsurancePlanFactoryImpl implements HealthInsurancePlanFactory {

  private static final String PLATINUM_PLAN = "platinum";
  private static final String GOLD_PLAN = "gold";
  private static final String SILVER_PLAN = "silver";
  private static final String BRONZE_PLAN = "bronze";
  private static final String NULL_HEALTH_PLAN_AND_BRAND_EXCEPTION =
          "Health plan and Brand can't be null.";
  private static final String INVALID_HEALTH_PLAN_OR_BRAND_EXCEPTION =
          "Invalid health plan or Brand = %s or %s.";

  @Override
  public HealthInsurancePlan create(String plan, InsuranceBrand brand) {
    if (plan == null || brand == null) {
      throw new IllegalArgumentException(NULL_HEALTH_PLAN_AND_BRAND_EXCEPTION);
    }

    String planToLowerCase = plan.toLowerCase();

    switch (planToLowerCase) {
      case PLATINUM_PLAN:
        return new PlatinumPlan(brand);
      case GOLD_PLAN:
        return new GoldPlan(brand);
      case SILVER_PLAN:
        return new SilverPlan(brand);
      case BRONZE_PLAN:
        return new BronzePlan(brand);
      default:
        throw new IllegalArgumentException(
                String.format(INVALID_HEALTH_PLAN_OR_BRAND_EXCEPTION, plan, brand));
    }
  }
}
