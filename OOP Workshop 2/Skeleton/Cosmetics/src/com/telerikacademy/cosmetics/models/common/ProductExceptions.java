package com.telerikacademy.cosmetics.models.common;

public final class ProductExceptions {

  private ProductExceptions() {
  }

  public static final String NAME_NULL_EXCEPTION = "Name should not be null.";
  public static final String BRAND_NULL_EXCEPTION = "Brand should not be null.";

  public static final String NAME_LENGTH_EXCEPTION = "Name length is invalid.";
  public static final String BRAND_LENGTH_EXCEPTION = "Brand length is invalid.";

  public static final String PRICE_NEGATIVE_EXCEPTION = "Price should'n be negative.";

  public static final String TOOTHPASTE_INGREDIENTS_NULL_EXCEPTION = "Ingredients should not be null.";

  public static final String SHAMPOO_MILLILITERS_NEGATIVE_EXCEPTION = "Milliliters should be zero or positive.";
}
