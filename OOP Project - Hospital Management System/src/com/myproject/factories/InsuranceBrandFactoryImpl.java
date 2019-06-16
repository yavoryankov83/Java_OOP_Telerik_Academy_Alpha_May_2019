package com.myproject.factories;

import com.myproject.contracts.InsuranceBrand;
import com.myproject.contracts.InsuranceBrandFactory;
import com.myproject.insuranceBrand_models.BlueCrossBlueShield;

public class InsuranceBrandFactoryImpl implements InsuranceBrandFactory {

  private static final String NULL_BRAND_TYPE_AND_NAME_EXCEPTION =
          "Brand type and brand name can't be null.";
  private static final String INVALID_BRAND_TYPE_OR_BRAND_NAME_EXCEPTION =
          "Invalid brand type or brand name = %s or %s.";

  @Override
  public InsuranceBrand create(String brandType, String brandName) {
    if (brandType == null || brandName == null) {
      throw new IllegalArgumentException(NULL_BRAND_TYPE_AND_NAME_EXCEPTION);
    }

    String brandTypeToLowerCase = brandType.toLowerCase();

    switch (brandTypeToLowerCase) {
      case "bluecrossblueshield":
        return new BlueCrossBlueShield(brandName);
      default:
        throw new IllegalArgumentException(
                String.format(INVALID_BRAND_TYPE_OR_BRAND_NAME_EXCEPTION, brandType, brandName));
    }
  }
}
