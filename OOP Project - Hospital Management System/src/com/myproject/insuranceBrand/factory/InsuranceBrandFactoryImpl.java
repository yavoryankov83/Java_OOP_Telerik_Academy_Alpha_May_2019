package com.myproject.insuranceBrand.factory;

import com.myproject.insuranceBrand.BlueCrossBlueShield;
import com.myproject.insuranceBrand.InsuranceBrand;
import com.myproject.premiumCalculator.factory.PremiumCalculatorFactory;

public class InsuranceBrandFactoryImpl implements InsuranceBrandFactory {

  private static final String NULL_BRAND_TYPE_AND_NAME_EXCEPTION =
          "Brand type and brand name can't be null.";
  private static final String INVALID_BRAND_TYPE_OR_BRAND_NAME_EXCEPTION =
          "Invalid brand type or brand name = %s or %s.";

  @Override
  public InsuranceBrand create(String brandType, String brandName, PremiumCalculatorFactory premiumCalculatorFactory) {
    if (brandType == null || brandName == null) {
      throw new IllegalArgumentException(NULL_BRAND_TYPE_AND_NAME_EXCEPTION);
    }

    String brandTypeToLowerCase = brandType.toLowerCase();

    switch (brandTypeToLowerCase) {
      case "bluecrossblueshield":
        return new BlueCrossBlueShield(brandName, premiumCalculatorFactory);
      default:
        throw new IllegalArgumentException(
                String.format(INVALID_BRAND_TYPE_OR_BRAND_NAME_EXCEPTION, brandType, brandName));
    }
  }
}
