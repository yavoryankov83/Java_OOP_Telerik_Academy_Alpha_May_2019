package com.telerikacademy.cosmetics.models;

import com.telerikacademy.cosmetics.models.common.ValidationHelper;
import com.telerikacademy.cosmetics.models.products.Product;

import java.util.ArrayList;
import java.util.List;

public class Category {

  private static final int NAME_MIN_VALUE = 2;
  private static final int NAME_MAX_VALUE = 15;
  private static final String CATEGORY_INVALID_MESSAGE = "Gategory name must be between 2 and 15 symbols";
  private static final String PRODUCT_NOT_FOUND_MESSAGE = "Product is not found.";

  private String name;
  private List<Product> products;

  public Category(String name) {
    setName(name);
    products = new ArrayList<>();
  }

  private void setName(String name) {
    if (name.length() < NAME_MIN_VALUE || name.length() > NAME_MAX_VALUE) {
      throw new IllegalArgumentException(CATEGORY_INVALID_MESSAGE);
    }

    this.name = name;
  }

  public List<Product> getProducts() {
    return new ArrayList<>(products);
  }

  public void addProduct(Product product) {
    ValidationHelper.ckeckProductNotNull(product);
    products.add(product);
  }

  public void removeProduct(Product product) {
    ValidationHelper.ckeckProductNotNull(product);
    if (!products.contains(product)) {
      throw new IllegalArgumentException(PRODUCT_NOT_FOUND_MESSAGE);
    }

    products.remove(product);
  }

  public String print() {
    StringBuilder builder = new StringBuilder();
    builder
            .append(String.format("#Category: %s", name))
            .append(System.lineSeparator());

    if (products.isEmpty()) {
      builder.append(" #No product in this category");
    } else {
      for (Product product : products) {
        builder.append(product.print());
      }
    }

    return builder.toString();
  }
}
