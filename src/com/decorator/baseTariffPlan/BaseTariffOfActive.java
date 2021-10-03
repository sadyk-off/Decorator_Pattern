package com.decorator.baseTariffPlan;

import com.decorator.mobileOperator.MobileOperator;

public class BaseTariffOfActive implements MobileOperator {

    MobileOperator mobileOperator;

    public BaseTariffOfActive(MobileOperator mobileOperator){
        this.mobileOperator = mobileOperator;
    }

    @Override
    public void provideCalls() {
        System.out.println("base tariff: 7 тг/мин");
    }

    @Override
    public void provideInternet() {
        System.out.println("base tariff: 5 тг/мин");
    }

    @Override
    public void provideSMS() {
        System.out.println("base tariff: 5 тг/мин");
    }
}
