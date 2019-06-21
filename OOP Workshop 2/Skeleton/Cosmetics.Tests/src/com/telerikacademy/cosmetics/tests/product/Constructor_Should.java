package com.telerikacademy.cosmetics.tests.product;

import com.telerikacademy.cosmetics.models.common.GenderType;
import com.telerikacademy.cosmetics.models.common.ScentType;
import com.telerikacademy.cosmetics.models.common.UsageType;
import com.telerikacademy.cosmetics.models.contracts.Product;
import com.telerikacademy.cosmetics.models.products.CreamImpl;
import com.telerikacademy.cosmetics.models.products.ShampooImpl;
import com.telerikacademy.cosmetics.models.products.ToothpasteImpl;
import org.junit.Test;

import java.util.ArrayList;

public class Constructor_Should {

    //ShampooImpl Tests
    @Test(expected = IllegalArgumentException.class)
    public void throwWhenTheNameIsNull() {
        // Arrange, Act, Assert
        Product shampoo = new ShampooImpl(null, "brand", 10, GenderType.MEN, 10, UsageType.EVERYDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwWhenTheBrandIsNull() {
        // Arrange, Act, Assert
        Product shampoo = new ShampooImpl("name", null, 10, GenderType.MEN, 10, UsageType.EVERYDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwWhenTheNameIsSmallerThanMinValue() {
        // Arrange, Act, Assert
        Product shampoo = new ShampooImpl("0", "brand", 10, GenderType.MEN, 10, UsageType.EVERYDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwWhenTheNameIsLargerThanMaxValue() {
        // Arrange, Act, Assert
        Product shampoo = new ShampooImpl("01234567890", "brand", 10, GenderType.MEN, 10, UsageType.EVERYDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwWhenTheBrandIsSmallerThanMinValue() {
        // Arrange, Act, Assert
        Product shampoo = new ShampooImpl("name", "0", 10, GenderType.MEN, 10, UsageType.EVERYDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwWhenTheBrandIsLargerThanMaxValue() {
        // Arrange, Act, Assert
        Product shampoo = new ShampooImpl("name", "01234567890", 10, GenderType.MEN, 10, UsageType.EVERYDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwWhenPriceIsNegative() {
        // Arrange, Act, Assert
        Product shampoo = new ShampooImpl("name", "brand", -1, GenderType.MEN, 10, UsageType.EVERYDAY);
    }

    @Test
    public void createShampooWhenValidValuesArePassed() {
        // Arrange, Act, Assert
        Product shampoo = new ShampooImpl("name", "brand", 10, GenderType.MEN, 10, UsageType.EVERYDAY);
    }

    //ToothpasteImpl Tests
    @Test(expected = IllegalArgumentException.class)
    public void throwWhenTheToothpasteNameIsNull() {
        // Arrange, Act, Assert
        Product toothpaste = new ToothpasteImpl(null, "brand", 10, GenderType.WOMEN, new ArrayList<>());
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwWhenTheToothpasteBrandIsNull() {
        // Arrange, Act, Assert
        Product toothpaste = new ToothpasteImpl("name", null, 10, GenderType.WOMEN, new ArrayList<>());
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwWhenNullIngredientsArePassed() {
        // Arrange, Act, Assert
        Product toothpaste = new ToothpasteImpl("name", "brand", 10, GenderType.WOMEN, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwWhenTheToothpasteNameIsSmallerThenMinValue() {
        // Arrange, Act, Assert
        Product toothpaste = new ToothpasteImpl("na", "brand", 10, GenderType.WOMEN, new ArrayList<>());
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwWhenTheToothpasteNameIsLargerThenMaxValue() {
        // Arrange, Act, Assert
        Product toothpaste = new ToothpasteImpl("01234567890", "brand", 10, GenderType.WOMEN, new ArrayList<>());
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwWhenTheToothpasteBrandIsSmallerThenMinValue() {
        // Arrange, Act, Assert
        Product toothpaste = new ToothpasteImpl("name", "0", 10, GenderType.WOMEN, new ArrayList<>());
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwWhenTheToothpasteBrandIsLargerThenMaxValue() {
        // Arrange, Act, Assert
        Product toothpaste = new ToothpasteImpl("name", "01234567890", 10, GenderType.WOMEN, new ArrayList<>());
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwWhenTheToothpastePriceIsNegative() {
        // Arrange, Act, Assert
        Product toothpaste = new ToothpasteImpl("name", "brand", -2, GenderType.WOMEN, new ArrayList<>());
    }

    @Test
    public void createToothpasteWhenValidValuesArePassed() {
        // Arrange, Act, Assert
        Product toothpaste = new ToothpasteImpl("name", "brand", 10, GenderType.WOMEN, new ArrayList<>());
    }

    //CreamImpl Tests
    @Test(expected = IllegalArgumentException.class)
    public void throwWhenTheCreamNameIsNull() {
        // Arrange, Act, Assert
        Product cream = new CreamImpl(null, "brand", 10, GenderType.MEN, ScentType.ROSE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwWhenTheCreamBrandIsNull(){
        // Arrange, Act, Assert
        Product cream = new CreamImpl("name", null, 10, GenderType.MEN, ScentType.ROSE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwWhenTheCreamNameIsSmallerThanMinValue() {
        // Arrange, Act, Assert
        Product cream = new CreamImpl("01", "brand", 10, GenderType.MEN, ScentType.ROSE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwWhenTheCreamNameIsLargerThanMaxValue() {
        // Arrange, Act, Assert
        Product cream = new CreamImpl("0123456789101112131415", "brand", 10, GenderType.MEN, ScentType.ROSE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwWhenTheCreamBrandIsSmallerThanMinValue() {
        // Arrange, Act, Assert
        Product cream = new CreamImpl("name", "01", 10, GenderType.MEN, ScentType.ROSE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwWhenTheCreamBrandIsLargerThanMaxValue() {
        // Arrange, Act, Assert
        Product cream = new CreamImpl("name", "0123456789101112131415", 10, GenderType.MEN, ScentType.ROSE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwWhenTheCreamPriceIsSmallerOrEqualToZero() {
        // Arrange, Act, Assert
        Product cream = new CreamImpl("name", "brand", 0, GenderType.MEN, ScentType.ROSE);
    }

    @Test
    public void createCreamWhenValidValuesArePassed() {
        // Arrange, Act, Assert
        Product cream = new CreamImpl("name", "brand", 10, GenderType.MEN, ScentType.ROSE);
    }
}