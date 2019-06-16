package com.myproject.insurancePlan.factory;

import com.myproject.insuranceBrand.InsuranceBrand;
import com.myproject.insurancePlan.AbstractHealthInsurancePlan;

public interface HealthInsurancePlanFactory {

  AbstractHealthInsurancePlan create(String plan, InsuranceBrand brand);
}
