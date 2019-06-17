package homework_Inheritance;

public class PlatinumPlan extends HealthInsurancePlan {

  private final static double COVERAGE_MULTIPLIER = 0.9;
  private final static int PLATINUM_DISCOUNT = 50;

  @Override
  public void setCoverage(double coverage) {
    super.setCoverage(COVERAGE_MULTIPLIER);
  }

  @Override
  public void setDiscount(int discount) {
    super.setDiscount(PLATINUM_DISCOUNT);
  }
}
