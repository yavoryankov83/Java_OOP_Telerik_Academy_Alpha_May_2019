package homework_Inheritance;

public class SilverPlan extends HealthInsurancePlan {

  private final static double COVERAGE_MULTIPLIER = 0.7;
  private final static int SILVER_DISCOUNT = 30;

  @Override
  public void setCoverage(double coverage) {
    super.setCoverage(COVERAGE_MULTIPLIER);
  }

  @Override
  public void setDiscount(int discount) {
    super.setDiscount(SILVER_DISCOUNT);
  }
}
