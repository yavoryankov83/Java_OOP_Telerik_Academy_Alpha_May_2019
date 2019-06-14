public class GoldPlan extends HealthInsurancePlan {

  private final static double COVERAGE_MULTIPLIER = 0.8;
  private final static int GOLDEN_DISCOUNT = 40;

  public GoldPlan() {
    setCoverage(COVERAGE_MULTIPLIER);
    setDiscount(GOLDEN_DISCOUNT);
  }
}
