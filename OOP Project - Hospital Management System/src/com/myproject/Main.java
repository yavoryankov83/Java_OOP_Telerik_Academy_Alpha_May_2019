package com.myproject;

import com.myproject.insuranceBrand.InsuranceBrand;
import com.myproject.insuranceBrand.factory.InsuranceBrandFactory;
import com.myproject.insuranceBrand.factory.InsuranceBrandFactoryImpl;
import com.myproject.insurancePlan.AbstractHealthInsurancePlan;
import com.myproject.insurancePlan.factory.HealthInsurancePlanFactory;
import com.myproject.insurancePlan.factory.HealthInsurancePlanFactoryImpl;
import com.myproject.premiumCalculator.factory.PremiumCalculatorFactory;
import com.myproject.premiumCalculator.factory.PremiumCalculatorFactoryImpl;
import com.myproject.user.User;

public class Main {
  public static void main(String[] args) {

    HealthInsurancePlanFactory healthInsurancePlanFactory = new HealthInsurancePlanFactoryImpl();
    InsuranceBrandFactory insuranceBrandFactory = new InsuranceBrandFactoryImpl();
    PremiumCalculatorFactory premiumCalculatorFactory = new PremiumCalculatorFactoryImpl();

    InsuranceBrand insuranceBrand =
            insuranceBrandFactory.create("BlueCrossBlueShield", "Blue plan", premiumCalculatorFactory);
    AbstractHealthInsurancePlan insurancePlan = healthInsurancePlanFactory.create("platinum", insuranceBrand);

    User staff = new User("Ivan", "Ivanov", "men",
            "ivan@abv.bg", false, insurancePlan, 60, true);

    double[] bill = Billing.computePaymentAmount(staff, 1000);

    System.out.printf("User bill is %.0f.%n", bill[1]);

    double premuim = insurancePlan.computeMonthlyPremium(5000, 56, true);

    System.out.printf("Premuim is %.0f.", premuim);
  }
}
