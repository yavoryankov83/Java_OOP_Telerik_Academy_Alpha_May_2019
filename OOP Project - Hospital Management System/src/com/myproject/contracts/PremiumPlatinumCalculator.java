package com.myproject.contracts;

public class PremiumPlatinumCalculator implements PremiumCalculatorByHealthInsurancePlan {

  @Override
  public double calculate(int age, boolean smoking) {
    double premium = 0;

    if (age > 55) {
      premium += 200;
    }
    if (smoking) {
      premium += 100;
    }

    return premium;
  }
}
