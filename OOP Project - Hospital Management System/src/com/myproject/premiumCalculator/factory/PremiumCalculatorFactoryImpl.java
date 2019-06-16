package com.myproject.premiumCalculator.factory;

import com.myproject.insurancePlan.GoldPlan;
import com.myproject.insurancePlan.HealthInsurancePlan;
import com.myproject.insurancePlan.PlatinumPlan;
import com.myproject.insurancePlan.SilverPlan;
import com.myproject.premiumCalculator.*;
import com.myproject.premiumCalculator.contract.PremiumCalculator;

public class PremiumCalculatorFactoryImpl implements
        PremiumCalculatorFactory {

  @Override
  public PremiumCalculator create(HealthInsurancePlan healthInsurancePlan) {
    if (healthInsurancePlan instanceof PlatinumPlan) {
      return new PremiumPlatinumCalculator();
    } else if (healthInsurancePlan instanceof GoldPlan) {
      return new PremiumGoldCalculator();
    } else if (healthInsurancePlan instanceof SilverPlan) {
      return new PremiumSilverCalculator();
    } else {
      return new PremiumBronzeCalculator();
    }
  }
}
