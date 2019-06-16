package com.myproject.insuranceBrand;

import com.myproject.insurancePlan.HealthInsurancePlan;

public interface InsuranceBrand {

  double computeMonthlyPremium(HealthInsurancePlan insurancePlan, int age, boolean smoking);
}
