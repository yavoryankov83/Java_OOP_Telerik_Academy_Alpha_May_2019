package com.telerikacademy.cosmetics.models.products;

import com.telerikacademy.cosmetics.models.common.GenderType;
import com.telerikacademy.cosmetics.models.contracts.Product;
import com.telerikacademy.cosmetics.models.contracts.Toothpaste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ToothpasteImpl extends ProductImpl implements Product, Toothpaste {

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
            throw new IllegalArgumentException(ProductConstants.TOOTHPASTE_INGREDIENTS_NULL_EXCEPTION);
        }

        this.ingredients = new ArrayList<>(ingredients);
    }

    @Override
    void setName(String name) {
        if (name == null){
            throw new IllegalArgumentException(ProductConstants.NAME_NULL_EXCEPTION);
        }

        if (name.length() < ProductConstants.TOOTHPASTE_NAME_MIN_LENGTH || name.length() > ProductConstants.TOOTHPASTE_NAME_MAX_LENGTH){
            throw new IllegalArgumentException(ProductConstants.TOOTHPASTE_NAME_LENGTH_EXCEPTION);
        }

        super.setName(name);
    }

    @Override
    void setBrand(String brand) {
        if (brand == null) {
            throw new IllegalArgumentException(ProductConstants.BRAND_NULL_EXCEPTION);
        }

        if (brand.length() < ProductConstants.TOOTHPASTE_BRAND_NAME_MIN_LENGTH || brand.length() > ProductConstants.TOOTHPASTE_BRAND_NAME_MAX_LENGTH) {
            throw new IllegalArgumentException(ProductConstants.TOOTHPASTE_BRAND_NAME_LENGTH_EXCEPTION);
        }

        super.setBrand(brand);
    }

    @Override
    void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException(ProductConstants.TOOTHPASTE_PRICE_NEGATIVE_EXCEPTION);
        }

        super.setPrice(price);
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
