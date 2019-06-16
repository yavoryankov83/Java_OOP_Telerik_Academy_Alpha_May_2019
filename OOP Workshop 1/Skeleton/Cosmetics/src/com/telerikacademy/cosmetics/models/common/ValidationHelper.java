package com.telerikacademy.cosmetics.models.common;

import com.telerikacademy.cosmetics.models.products.Product;

public class ValidationHelper {

  public static final String NO_EXISTING_PRODUCT_MESSAGE = "Product doesn't exist in category";

  private ValidationHelper() {
  }

  public static void ckeckProductNotNull(Product product) {
    if (product == null) {
      throw new IllegalArgumentException(NO_EXISTING_PRODUCT_MESSAGE);
    }
  }
}
