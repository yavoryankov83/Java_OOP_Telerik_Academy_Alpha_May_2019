public class SilverPlan extends HealthInsurancePlan {

  private final static double COVERAGE_MULTIPLIER = 0.7;
  private final static int SILVER_DISCOUNT = 30;

  public SilverPlan() {
    setCoverage(COVERAGE_MULTIPLIER);
    setDiscount(SILVER_DISCOUNT);
  }
}
