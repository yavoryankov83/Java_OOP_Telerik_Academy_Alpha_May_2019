package com.myproject.contracts;

public class PremiumGoldCalculator implements PremiumCalculatorByHealthInsurancePlan {

  @Override
  public double calculate(int age, boolean smoking) {
    double premium = 0;

    if (age > 55) {
      premium += 150;
    }
    if (smoking) {
      premium += 90;
    }

    return premium;
  }
}
