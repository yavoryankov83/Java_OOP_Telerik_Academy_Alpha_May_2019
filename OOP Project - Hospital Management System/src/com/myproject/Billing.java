package com.myproject;

import com.myproject.user_models.User;

final class Billing {

  private static final int ARRAY_MEMBERS_COUNT = 2;
  private static final int WITHOUT_COVERAGE = 0;
  private static final int BASE_DISCOUNT = 20;

  private Billing() {
  }

  static double[] computePaymentAmount(User user, double amount) {
    double[] bill = new double[ARRAY_MEMBERS_COUNT];

    double coverage = WITHOUT_COVERAGE;
    int discount = BASE_DISCOUNT;

    if (user.getInsurancePlan() != null && user.isInsured()) {
      coverage = user.getInsurancePlan().getCoverage();
      discount = user.getInsurancePlan().getDiscount();
    }

    double insuranceCompanyBill = coverage == WITHOUT_COVERAGE ? 0 : amount * coverage;
    double userBill = amount - (amount * coverage) - discount;

    bill[0] = insuranceCompanyBill;
    bill[1] = userBill;

    return bill;
  }
}
