package com.myproject.contracts;

import com.myproject.insurance_models.HealthInsurancePlan;

public interface PremiumCalculatorByHealthInsurancePlanFactory {
  PremiumCalculatorByHealthInsurancePlan create(HealthInsurancePlan healthInsurancePlan);
}
