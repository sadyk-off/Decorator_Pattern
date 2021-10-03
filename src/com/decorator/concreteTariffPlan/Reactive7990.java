package com.decorator.concreteTariffPlan;

import com.decorator.baseTariffPlan.BaseTariffOfActive;
import com.decorator.mobileOperator.MobileOperator;

public class Reactive7990 extends BaseTariffOfActive {

    public Reactive7990(MobileOperator mobileOperator) {
        super(mobileOperator);
    }

    @Override
    public void provideCalls() {
        System.out.println("Unlimited on-net, 300 minute");
    }

    @Override
    public void provideInternet() {
        System.out.println("Unlimited Internet");
    }

    @Override
    public void provideSMS() {
        System.out.println("exchange minutes to SMS");
    }
}
