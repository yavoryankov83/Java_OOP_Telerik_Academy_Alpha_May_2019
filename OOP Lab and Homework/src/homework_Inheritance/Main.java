package homework_Inheritance;

public class Main {
  public static void main(String[] args) {
    Patient patient = new Patient("Ivan", "Ivanov", "men", "ivan@abv.bg",
            true, new PlatinumPlan());

    double[] result = Billing.computePaymentAmount(patient, 1000);

    System.out.println(result[1]);
  }
}
