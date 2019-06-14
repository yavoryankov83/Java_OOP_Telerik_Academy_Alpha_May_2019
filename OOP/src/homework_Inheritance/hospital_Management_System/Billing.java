public final class Billing {

  private Billing() {
  }

  public static double[] computePaymentAmount(Patient patient, double amount) {
    double[] result = new double[2];

    boolean insured = patient.isInsured();
    double coverage = patient.getInsurancePlan().getCoverage();
    int discount = patient.getInsurancePlan().getDiscount();

    double insuranceBill;
    double patientBill;

    if (insured) {
      insuranceBill = amount * coverage;
      patientBill = amount - insuranceBill - discount;

    } else {
      insuranceBill = 0;
      patientBill = amount - discount;
    }

    result[0] = insuranceBill;
    result[1] = patientBill;

    return result;
  }
}
