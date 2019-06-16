package com.myproject.contracts;

public class PremiumSilverCalculator implements PremiumCalculatorByHealthInsurancePlan {

  @Override
  public double calculate(int age, boolean smoking) {
    double premium = 0;

    if (age > 55) {
      premium += 100;
    }
    if (smoking) {
      premium += 80;
    }

    return premium;
  }
}
