package com.decorator.concreteTariffPlan;

import com.decorator.baseTariffPlan.BaseTariffOfActive;
import com.decorator.mobileOperator.MobileOperator;

public class Reactive3990 extends BaseTariffOfActive {

    public Reactive3990(MobileOperator mobileOperator) {
        super(mobileOperator);
    }

    @Override
    public void provideCalls() {
        System.out.println("Reactive 3990 tariff: Unlimited on-net, 210 мин");
    }

    @Override
    public void provideInternet() {
        System.out.println("Reactive 3990 tariff: 16 GB");
    }

    @Override
    public void provideSMS() {
        System.out.println("Reactive 3990 tariff: 100 SMS");
    }
}
