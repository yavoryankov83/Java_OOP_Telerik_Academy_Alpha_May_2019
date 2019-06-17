package com.telerikacademy.cosmetics.models.cart;

import com.telerikacademy.cosmetics.models.contracts.Product;
import com.telerikacademy.cosmetics.models.contracts.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartImpl implements ShoppingCart {

  private List<Product> productList;

  public ShoppingCartImpl() {
    productList = new ArrayList<>();
  }

  @Override
  public List<Product> getProductList() {
    return new ArrayList<>(productList);
  }

  @Override
  public void addProduct(Product product) {
    if (product == null) {
      throw new IllegalArgumentException();
    }
    productList.add(product);
  }

  @Override
  public void removeProduct(Product product) {
    if (product == null) {
      throw new IllegalArgumentException();
    }
    productList.remove(product);
  }

  @Override
  public boolean containsProduct(Product product) {
    if (product == null) {
      throw new IllegalArgumentException();
    }
    return productList.contains(product);
  }

  @Override
  public double totalPrice() {
    double totalPrice = 0;
    for (Product product : productList) {
      totalPrice += product.getPrice();
    }
    return totalPrice;
  }
}
