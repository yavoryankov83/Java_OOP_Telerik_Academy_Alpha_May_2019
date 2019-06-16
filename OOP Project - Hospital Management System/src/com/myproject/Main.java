package com.myproject;

import com.myproject.contracts.*;
import com.myproject.factories.HealthInsurancePlanFactoryImpl;
import com.myproject.factories.InsuranceBrandFactoryImpl;
import com.myproject.insurance_models.HealthInsurancePlan;
import com.myproject.user_models.User;

public class Main {
  public static void main(String[] args) {

    HealthInsurancePlanFactory healthInsurancePlanFactory = new HealthInsurancePlanFactoryImpl();
    InsuranceBrandFactory insuranceBrandFactory = new InsuranceBrandFactoryImpl();

    InsuranceBrand insuranceBrand =
            insuranceBrandFactory.create("BlueCrossBlueShield", "Blue plan");
    HealthInsurancePlan insurancePlan = healthInsurancePlanFactory.create("platinum", insuranceBrand);

    User staff = new User("Ivan", "Ivanov", "men",
            "ivan@abv.bg", false, insurancePlan, 60, true);

    double[] bill = Billing.computePaymentAmount(staff, 1000);

    System.out.printf("User bill is %.0f.%n", bill[1]);

    double premuim = insurancePlan.computeMonthlyPremium(5000, 56, true);

    System.out.printf("Premuim is %.0f.", premuim);
  }
}
