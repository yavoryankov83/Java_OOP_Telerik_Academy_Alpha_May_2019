package com.telerikacademy.cosmetics.tests.cosmeticsfactory;

import com.telerikacademy.cosmetics.core.contracts.CosmeticsFactory;
import com.telerikacademy.cosmetics.core.factories.CosmeticsFactoryImpl;
import com.telerikacademy.cosmetics.models.common.GenderType;
import com.telerikacademy.cosmetics.models.common.UsageType;
import com.telerikacademy.cosmetics.models.contracts.Product;
import org.junit.Assert;
import org.junit.Test;

public class CreateShampoo_Should {
    @Test
    public void returnInstanceOfTypeProduct() {
        // Arrange
        CosmeticsFactory factory = new CosmeticsFactoryImpl();
        // Act
        Product shampoo = factory.createShampoo("name", "brand", 10, GenderType.UNISEX, 10, UsageType.EVERYDAY);
        // Assert
        Assert.assertTrue(shampoo instanceof Product);
    }
}
