public class Main {
  public static void main(String[] args) {
    Patient patient = new Patient(2,"Ivan", "Ivanov", "men",
            "ivan@abv.bg",true, null);

    double[] result = Billing.computePaymentAmount(patient, 1000);

    System.out.printf("%.0f", result[1]);
  }
}
