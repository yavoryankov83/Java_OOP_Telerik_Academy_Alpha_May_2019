package com.telerikacademy.cosmetics.core.contracts;

import com.telerikacademy.cosmetics.models.common.GenderType;
import com.telerikacademy.cosmetics.models.common.ScentType;
import com.telerikacademy.cosmetics.models.common.UsageType;
import com.telerikacademy.cosmetics.models.contracts.*;
import com.telerikacademy.cosmetics.models.products.ShampooImpl;
import com.telerikacademy.cosmetics.models.products.ToothpasteImpl;

import java.util.List;

public interface CosmeticsFactory {
  Category createCategory(String name);

  Product createShampoo(String name, String brand, double price, GenderType gender, int milliliters, UsageType usage);

  Product createToothpaste(String name, String brand, double price, GenderType gender, List<String> ingredients);

  Product createCream(String name, String brand, double price, GenderType gender, ScentType scent);

  ShoppingCart createShoppingCart();
}
