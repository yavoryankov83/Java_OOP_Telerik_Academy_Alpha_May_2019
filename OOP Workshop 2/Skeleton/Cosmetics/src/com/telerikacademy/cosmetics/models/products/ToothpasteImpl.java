package com.telerikacademy.cosmetics.models.products;

import com.telerikacademy.cosmetics.models.common.GenderType;
import com.telerikacademy.cosmetics.models.contracts.Product;
import com.telerikacademy.cosmetics.models.contracts.Toothpaste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ToothpasteImpl extends AbstractProduct implements Product, Toothpaste {

    private static final String INGREDIENTS_NULL_EXCEPTION = "Ingredients should not be null.";

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
        if (ingredients == null){
            throw new IllegalArgumentException(INGREDIENTS_NULL_EXCEPTION);
        }

        this.ingredients = new ArrayList<>(ingredients);
    }

    @Override
    public String print() {
        StringBuilder builder = new StringBuilder();

        builder
                .append(super.print())
                .append(" #Ingredients: ")
                .append("[");

        for (int i = 0; i < ingredients.size(); i++) {
            if (i == ingredients.size() - 1){
                builder.append(ingredients.get(i));
            } else {
                builder.append(ingredients.get(i) + ", ");
            }
        }

        builder.append("]")
                .append(System.lineSeparator())
                .append(" ===");

        return builder.toString();
    }
}
