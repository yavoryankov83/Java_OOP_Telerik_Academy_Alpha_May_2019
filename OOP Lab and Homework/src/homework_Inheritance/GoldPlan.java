package homework_Inheritance;

public class GoldPlan extends HealthInsurancePlan {

  private final static double COVERAGE_MULTIPLIER = 0.8;
  private final static int GOLDEN_DISCOUNT = 40;

  @Override
  public void setCoverage(double coverage) {
    super.setCoverage(COVERAGE_MULTIPLIER);
  }

  @Override
  public void setDiscount(int discount) {
    super.setDiscount(GOLDEN_DISCOUNT);
  }
}
