package com.myproject.contracts;

import com.myproject.insurance_models.HealthInsurancePlan;

public interface HealthInsurancePlanFactory {

  HealthInsurancePlan create(String plan, InsuranceBrand brand);
}
