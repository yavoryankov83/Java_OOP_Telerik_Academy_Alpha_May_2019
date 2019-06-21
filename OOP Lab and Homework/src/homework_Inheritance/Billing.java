package homework_Inheritance;

public class Billing {

  private Billing() {
  }

  public static double[] computePaymentAmount(Patient patient, double amount) {
    double[] result = new double[2];

    boolean insured = patient.isInsured();
    HealthInsurancePlan insurancePlan = patient.getInsurancePlan();
    double coverage = insurancePlan.getCoverage();

    if (insured) {
      double insuranceBill = amount * coverage;
      result[0] = insuranceBill;

      double patientBill = amount - insuranceBill;
      result[1] = patientBill - patient.getInsurancePlan().getDiscount();

    } else {
      result[0] = 0;
      result[1] = amount - patient.getInsurancePlan().getDiscount();
    }

    return result;
  }
}
