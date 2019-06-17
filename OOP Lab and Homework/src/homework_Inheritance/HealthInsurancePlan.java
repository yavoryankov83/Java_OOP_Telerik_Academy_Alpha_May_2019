package homework_Inheritance;

public class HealthInsurancePlan {

  public static final int BASE_DISCOUNT = 20;
  public static final int BASE_COVERAGE = 0;

  private double coverage;
  private int discount;

  public HealthInsurancePlan() {
    setCoverage(BASE_COVERAGE);
    setDiscount(BASE_DISCOUNT);
  }

  public double getCoverage() {
    return coverage;
  }

  public void setCoverage(double coverage) {
    this.coverage = coverage;
  }

  public int getDiscount() {
    return discount;
  }

  public void setDiscount(int discount) {
    this.discount = discount;
  }
}
