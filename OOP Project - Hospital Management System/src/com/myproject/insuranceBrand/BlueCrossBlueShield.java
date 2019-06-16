package com.myproject.insuranceBrand;

import com.myproject.IdDispacher;
import com.myproject.insurancePlan.AbstractHealthInsurancePlan;
import com.myproject.premiumCalculator.contract.PremiumCalculator;
import com.myproject.premiumCalculator.factory.PremiumCalculatorFactory;
import com.myproject.premiumCalculator.factory.PremiumCalculatorFactoryImpl;

public class BlueCrossBlueShield implements InsuranceBrand {

  private long id;
  private String name;
  private PremiumCalculatorFactory premiumCalculatorFactory;

  public BlueCrossBlueShield(String name, PremiumCalculatorFactory premiumCalculatorFactory) {
    setId(IdDispacher.getId());
    setName(name);
    setPremiumCalculatorFactory(premiumCalculatorFactory);
  }

  public long getId() {
    return id;
  }

  private void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  private void setName(String name) {
    this.name = name;
  }

  public PremiumCalculatorFactory getPremiumCalculatorFactory() {
    return premiumCalculatorFactory;
  }

  private void setPremiumCalculatorFactory(PremiumCalculatorFactory premiumCalculatorFactory) {
    this.premiumCalculatorFactory = new PremiumCalculatorFactoryImpl();
  }

  @Override
  public double computeMonthlyPremium(AbstractHealthInsurancePlan insurancePlan, int age, boolean smoking) {
    PremiumCalculator premiumCalculator = getPremiumCalculatorFactory().create(insurancePlan);

    return premiumCalculator.calculate(age, smoking);
  }
}
