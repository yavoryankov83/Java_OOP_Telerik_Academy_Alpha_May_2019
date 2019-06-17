package com.telerikacademy.cosmetics.models;

import com.telerikacademy.cosmetics.models.contracts.Category;
import com.telerikacademy.cosmetics.models.contracts.Product;

import java.util.ArrayList;
import java.util.List;

public class CategoryImpl implements Category {
  private static final int NAME_MIN_LENGTH = 2;
  private static final int NAME_MAX_LENGTH = 15;

  private String name;
  private List<Product> products;

  public CategoryImpl(String name) {
    setName(name);
    products = new ArrayList<>();
  }

  @Override
  public String getName() {
    return name;
  }

  private void setName(String name) {
    if (name == null) {
      throw new IllegalArgumentException();
    }

    if (name.length() < NAME_MIN_LENGTH || name.length() > NAME_MAX_LENGTH) {
      throw new IllegalArgumentException();
    }

    this.name = name;
  }

  public List<Product> getProducts() {
    return new ArrayList<>(products);
  }

  @Override
  public void addProduct(Product product) {
    if (product == null) {
      throw new IllegalArgumentException();
    }

    products.add(product);
  }

  @Override
  public void removeProduct(Product product) {
    if (product == null) {
      throw new IllegalArgumentException();
    }

    products.remove(product);
  }

  @Override
  public String print() {
    if (products.size() == 0) {
      return String.format("#Category: %s%n" + " #No product in this category", name);
    }

    StringBuilder builder = new StringBuilder();

    builder.append(String.format("#Category: %s%n", name));

    for (Product product : products) {
      builder.append(product.print());
    }

    return builder.toString();
  }
}
