package com.decorator.main;

import com.decorator.clients.Client;
import com.decorator.concreteMobileOperator.Active;
import com.decorator.concreteTariffPlan.Reactive3990;
import com.decorator.concreteTariffPlan.Reactive7990;
import com.decorator.mobileOperator.MobileOperator;

public class Main {

    public static void main(String[] args) {

        Active active = new Active();

        MobileOperator activeWithReactive3990Tariff = new Reactive3990(active);
        MobileOperator activeWithReactive7990Tariff = new Reactive7990(active);

        Client madikhanSadykov = new Client("Madikhan", "Sadykov", "87014355475", activeWithReactive3990Tariff);
        Client michailJordan = new Client("Michail", "Jordan", "87017773434", activeWithReactive7990Tariff);

        active.registrationSubscriber(madikhanSadykov);
        active.registrationSubscriber(michailJordan);

        madikhanSadykov.getTariffOfMobileOperator().provideInternet();
        madikhanSadykov.getTariffOfMobileOperator().provideSMS();
        madikhanSadykov.getTariffOfMobileOperator().provideCalls();

        System.out.println("======================================================================================================");

        madikhanSadykov.getTariffOfMobileOperator().provideInternet();
        madikhanSadykov.getTariffOfMobileOperator().provideSMS();
        madikhanSadykov.getTariffOfMobileOperator().provideCalls();

    }
}
