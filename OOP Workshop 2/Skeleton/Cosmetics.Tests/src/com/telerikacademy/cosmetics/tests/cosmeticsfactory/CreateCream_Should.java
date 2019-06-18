package com.telerikacademy.cosmetics.tests.cosmeticsfactory;

import com.telerikacademy.cosmetics.core.contracts.CosmeticsFactory;
import com.telerikacademy.cosmetics.core.factories.CosmeticsFactoryImpl;
import com.telerikacademy.cosmetics.models.common.GenderType;
import com.telerikacademy.cosmetics.models.common.ScentType;
import com.telerikacademy.cosmetics.models.contracts.Product;
import org.junit.Assert;
import org.junit.Test;

public class CreateCream_Should {
  @Test
  public void returnInstanceOfTypeProduct() {
    // Arrange
    CosmeticsFactory factory = new CosmeticsFactoryImpl();
    // Act
    Product cream = factory.createCream("name", "brand", 10, GenderType.UNISEX, ScentType.ROSE);
    // Assert
    Assert.assertTrue(cream instanceof Product);
  }
}
