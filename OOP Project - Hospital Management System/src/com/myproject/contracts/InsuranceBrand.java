package com.myproject.contracts;

import com.myproject.insurance_models.HealthInsurancePlan;

public interface InsuranceBrand {

  double computeMonthlyPremium(HealthInsurancePlan insurancePlan, int age, boolean smoking);
}
