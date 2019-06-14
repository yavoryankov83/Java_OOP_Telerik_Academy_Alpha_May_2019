public class HealthInsurancePlan {

  private static final int BASE_DISCOUNT = 20;
  private static final int BASE_COVERAGE = 0;

  private double coverage;
  private int discount;

  public HealthInsurancePlan() {
    setCoverage(BASE_COVERAGE);
    setDiscount(BASE_DISCOUNT);
  }

  public double getCoverage() {
    return coverage;
  }

  protected void setCoverage(double coverage) {
    this.coverage = coverage;
  }

  public int getDiscount() {
    return discount;
  }

  protected void setDiscount(int discount) {
    this.discount = discount;
  }
}
