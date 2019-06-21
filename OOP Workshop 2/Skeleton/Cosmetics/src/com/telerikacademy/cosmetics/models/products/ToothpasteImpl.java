package com.telerikacademy.cosmetics.models.products;

import com.telerikacademy.cosmetics.models.common.GenderType;
import com.telerikacademy.cosmetics.models.common.ProductExceptions;
import com.telerikacademy.cosmetics.models.common.ProductValidator;
import com.telerikacademy.cosmetics.models.contracts.Toothpaste;

import java.util.Collections;
import java.util.List;

public class ToothpasteImpl extends AbstractProduct implements Toothpaste {

  private List<String> ingredients;

  public ToothpasteImpl(String name, String brand, double price,
                        GenderType gender, List<String> ingredients) {
    super(name, brand, price, gender);
    setIngredients(ingredients);
  }

  @Override
  public List<String> getIngredients() {
    return Collections.unmodifiableList(ingredients);
  }

  private void setIngredients(List<String> ingredients) {
    ProductValidator.validateIngredients(ingredients, ProductExceptions.TOOTHPASTE_INGREDIENTS_NULL_EXCEPTION);

    this.ingredients = Collections.unmodifiableList(ingredients);
  }

  @Override
  String printDetails() {
    StringBuilder builder = new StringBuilder();

    builder
            .append(String.format(" #Ingredients: %s%n", getIngredients()));

    return builder.toString();
  }
}
