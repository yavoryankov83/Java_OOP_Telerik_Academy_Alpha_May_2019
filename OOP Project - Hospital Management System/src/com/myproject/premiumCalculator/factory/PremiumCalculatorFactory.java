package com.myproject.premiumCalculator.factory;

import com.myproject.insurancePlan.HealthInsurancePlan;
import com.myproject.premiumCalculator.contract.PremiumCalculator;

public interface PremiumCalculatorFactory {
  PremiumCalculator create(HealthInsurancePlan healthInsurancePlan);
}
