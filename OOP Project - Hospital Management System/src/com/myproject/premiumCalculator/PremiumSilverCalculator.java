package com.myproject.premiumCalculator;

import com.myproject.premiumCalculator.contract.PremiumCalculator;

public class PremiumSilverCalculator implements PremiumCalculator {

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
