public class PlatinumPlan extends HealthInsurancePlan {

  private final static double COVERAGE_MULTIPLIER = 0.9;
  private final static int PLATINUM_DISCOUNT = 50;

  public PlatinumPlan() {
    setCoverage(COVERAGE_MULTIPLIER);
    setDiscount(PLATINUM_DISCOUNT);
  }
}
