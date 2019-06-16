package com.myproject.contracts;

import com.myproject.insurance_models.GoldPlan;
import com.myproject.insurance_models.HealthInsurancePlan;
import com.myproject.insurance_models.PlatinumPlan;
import com.myproject.insurance_models.SilverPlan;

public class PremiumCalculatorByHealthInsurancePlanFactoryImpl implements
        PremiumCalculatorByHealthInsurancePlanFactory {

  @Override
  public PremiumCalculatorByHealthInsurancePlan create(HealthInsurancePlan healthInsurancePlan) {
    if (healthInsurancePlan instanceof PlatinumPlan){
      return new PremiumPlatinumCalculator();
    } else if (healthInsurancePlan instanceof GoldPlan){
      return new PremiumGoldCalculator();
    } else if (healthInsurancePlan instanceof SilverPlan){
      return new PremiumSilverCalculator();
    } else {
      return new PremiumBronzeCalculator();
    }
  }
}
