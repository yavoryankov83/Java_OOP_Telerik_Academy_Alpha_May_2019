package com.myproject.insuranceBrand.factory;

import com.myproject.insuranceBrand.InsuranceBrand;
import com.myproject.premiumCalculator.factory.PremiumCalculatorFactory;

public interface InsuranceBrandFactory {

  InsuranceBrand create(String brandType, String brandName, PremiumCalculatorFactory premiumCalculatorFactory);
}
