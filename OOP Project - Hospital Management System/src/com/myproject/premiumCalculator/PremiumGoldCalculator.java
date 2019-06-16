package com.myproject.premiumCalculator;

import com.myproject.premiumCalculator.contract.PremiumCalculator;

public class PremiumGoldCalculator implements PremiumCalculator {

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
