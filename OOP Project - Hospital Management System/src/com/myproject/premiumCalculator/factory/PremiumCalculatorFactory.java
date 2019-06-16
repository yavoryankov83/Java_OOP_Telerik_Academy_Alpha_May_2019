package com.myproject.premiumCalculator.factory;

import com.myproject.insurancePlan.AbstractHealthInsurancePlan;
import com.myproject.premiumCalculator.contract.PremiumCalculator;

public interface PremiumCalculatorFactory {
  PremiumCalculator create(AbstractHealthInsurancePlan healthInsurancePlan);
}
