package com.myproject.insurancePlan.factory;

import com.myproject.insuranceBrand.InsuranceBrand;
import com.myproject.insurancePlan.HealthInsurancePlan;

public interface HealthInsurancePlanFactory {

  HealthInsurancePlan create(String plan, InsuranceBrand brand);
}
