package homework_Inheritance;

public class BronzePlan extends HealthInsurancePlan {

  private final static double COVERAGE_MULTIPLIER = 0.6;
  private final static int BRONZE_DISCOUNT = 25;

  @Override
  public void setCoverage(double coverage) {
    getCoverage();
  }

  @Override
  public void setDiscount(int discount) {
    super.setDiscount(BRONZE_DISCOUNT);
  }
}
