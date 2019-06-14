public class BronzePlan extends HealthInsurancePlan {

  private final static double COVERAGE_MULTIPLIER = 0.6;
  private final static int BRONZE_DISCOUNT = 25;

  public BronzePlan() {
    setCoverage(COVERAGE_MULTIPLIER);
    setDiscount(BRONZE_DISCOUNT);
  }
}
