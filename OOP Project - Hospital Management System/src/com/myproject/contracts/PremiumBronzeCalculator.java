package com.myproject.contracts;

public class PremiumBronzeCalculator implements PremiumCalculatorByHealthInsurancePlan {

  @Override
  public double calculate(int age, boolean smoking) {
    double premium = 0;

    if (age > 55) {
      premium += 50;
    }
    if (smoking) {
      premium += 70;
    }

    return premium;
  }
}
