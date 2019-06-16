package com.myproject.premiumCalculator;

import com.myproject.premiumCalculator.contract.PremiumCalculator;

public class PremiumBronzeCalculator implements PremiumCalculator {

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
