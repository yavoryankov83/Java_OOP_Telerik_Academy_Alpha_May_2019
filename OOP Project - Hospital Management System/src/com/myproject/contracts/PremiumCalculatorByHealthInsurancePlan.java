package com.myproject.contracts;

import com.myproject.insurance_models.HealthInsurancePlan;

public interface PremiumCalculatorByHealthInsurancePlan {
  double calculate(int age, boolean smoking);
}
