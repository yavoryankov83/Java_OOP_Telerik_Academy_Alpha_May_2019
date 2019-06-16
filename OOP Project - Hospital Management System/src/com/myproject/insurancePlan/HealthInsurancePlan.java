package com.myproject.insurancePlan;

import com.myproject.insuranceBrand.InsuranceBrand;

public abstract class HealthInsurancePlan {

  private double coverage;
  private int discount;
  private InsuranceBrand offeredBy;

  protected HealthInsurancePlan(InsuranceBrand offeredBy) {
    setCoverage(coverage);
    setDiscount(discount);
    setOfferedBy(offeredBy);
  }

  public double getCoverage() {
    return coverage;
  }

  void setCoverage(double coverage) {
    this.coverage = coverage;
  }

  public int getDiscount() {
    return discount;
  }

  void setDiscount(int discount) {
    this.discount = discount;
  }

  InsuranceBrand getOfferedBy() {
    return offeredBy;
  }

  private void setOfferedBy(InsuranceBrand offeredBy) {
    this.offeredBy = offeredBy;
  }

  public abstract double computeMonthlyPremium(double salary, int age, boolean smoking);
}
