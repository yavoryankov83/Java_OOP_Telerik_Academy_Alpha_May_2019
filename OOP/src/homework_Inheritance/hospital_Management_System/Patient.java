public class Patient extends User {

  private boolean insured;
  private HealthInsurancePlan insurancePlan;

  protected Patient(long id, String firtName, String lastName, String gender,
                 String email, boolean insured,
                 HealthInsurancePlan insurancePlan) {
    super(id, firtName, lastName, gender, email);
    setInsured(insured);
    setInsurancePlan(insurancePlan);
  }

  public boolean isInsured() {
    return insured;
  }

  private void setInsured(boolean insured) {
    this.insured = insured;
  }

  public HealthInsurancePlan getInsurancePlan() {
    if (insurancePlan == null){
      return new HealthInsurancePlan();
    }

    return insurancePlan;
  }

  private void setInsurancePlan(HealthInsurancePlan insurancePlan) {
    this.insurancePlan = insurancePlan;
  }
}
