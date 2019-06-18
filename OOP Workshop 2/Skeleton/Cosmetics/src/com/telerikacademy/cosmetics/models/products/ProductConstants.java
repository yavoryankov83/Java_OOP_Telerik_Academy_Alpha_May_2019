package com.telerikacademy.cosmetics.models.products;

final class ProductConstants {

  private ProductConstants() {
  }

  static final String NAME_NULL_EXCEPTION = "Name should not be null.";
  static final String BRAND_NULL_EXCEPTION = "Brand should not be null";

  static final String SHAMPOO_MILLILITERS_NEGATIVE_EXCEPTION = "Milliliters should be positive.";
  static final int SHAMPOO_NAME_MIN_LENGTH = 3;
  static final int SHAMPOO_NAME_MAX_LENGTH = 10;
  static final String SHAMPOO_NAME_LENGTH_EXCEPTION = "Name should be between 3 and 10 symbols.";
  static final int SHAMPOO_BRAND_NAME_MIN_LENGTH = 2;
  static final int SHAMPOO_BRAND_NAME_MAX_LENGTH = 10;
  static final String SHAMPOO_BRAND_NAME_LENGTH_EXCEPTION = "Brand name should be between 2 and 10 symbols.";
  static final String SHAMPOO_PRICE_NEGATIVE_EXCEPTION = "Price should be positive.";

  static final String TOOTHPASTE_INGREDIENTS_NULL_EXCEPTION = "Ingredients should not be null.";
  static final int TOOTHPASTE_NAME_MIN_LENGTH = 3;
  static final int TOOTHPASTE_NAME_MAX_LENGTH = 10;
  static final String TOOTHPASTE_NAME_LENGTH_EXCEPTION = "Name should be between 3 and 10 symbols.";
  static final int TOOTHPASTE_BRAND_NAME_MIN_LENGTH = 2;
  static final int TOOTHPASTE_BRAND_NAME_MAX_LENGTH = 10;
  static final String TOOTHPASTE_BRAND_NAME_LENGTH_EXCEPTION = "Brand name should be between 2 and 10 symbols.";
  static final String TOOTHPASTE_PRICE_NEGATIVE_EXCEPTION = "Price should be positive.";

  static final int CREAM_NAME_MIN_LENGTH = 3;
  static final int CREAM_NAME_MAX_LENGTH = 15;
  static final String CREAM_NAME_LENGTH_EXCEPTION = "Cream name should be between 3 and 15 symbols.";
  static final int CREAM_BRAND_NAME_MIN_LENGTH = 3;
  static final int CREAM_BRAND_NAME_MAX_LENGTH = 10;
  static final String CREAM_BRAND_NAME_LENGTH_EXCEPTION = "Brand name should be between 3 and 10 symbols.";
  static final String CREAM_PRICE_NEGATIVE_OR_EQUAL_TO_ZERO_EXCEPTION = "Price should be greater than 0.";
}
