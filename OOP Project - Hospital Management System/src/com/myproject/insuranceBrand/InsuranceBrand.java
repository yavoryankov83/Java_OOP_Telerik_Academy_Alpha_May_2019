package com.myproject.insuranceBrand;

import com.myproject.insurancePlan.AbstractHealthInsurancePlan;

public interface InsuranceBrand {

  double computeMonthlyPremium(AbstractHealthInsurancePlan insurancePlan, int age, boolean smoking);
}
