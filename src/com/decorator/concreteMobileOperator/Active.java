package com.decorator.concreteMobileOperator;

import com.decorator.clients.Client;
import com.decorator.mobileOperator.MobileOperator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Active implements MobileOperator {

    private List<Client> subscribers;

    public Active() {
        subscribers = new ArrayList<>();
    }

    @Override
    public void provideCalls() {
        System.out.println("Without: 12 тг/мин");
    }

    @Override
    public void provideInternet() {
        System.out.println("Without: 10 тг/MB");
    }

    @Override
    public void provideSMS() {
        System.out.println("15 тг/SMS");
    }


    public boolean registrationSubscriber(Client client) {
        Iterator<Client> iterator = subscribers.iterator();

        while(iterator.hasNext()) {
            if(iterator.next().getFirstName() == client.getFirstName() && iterator.next().getLastName() == client.getLastName()){
                return false;
            }
        }

        subscribers.add(new Client(client.getFirstName(), client.getLastName(), client.getPhoneNumber(), client.getTariffOfMobileOperator()));
        return true;
    }


    public boolean reRegistration(String phoneNumber, String pastFirstName, String pastLastName, String newFirstName, String newLastName) {
        Iterator<Client> iterator = subscribers.iterator();

        while(iterator.hasNext()) {
            if(iterator.next().getFirstName() == pastFirstName && iterator.next().getLastName() == pastLastName) {
                iterator.next().setFirstName(newFirstName);
                iterator.next().setLastName(newLastName);
                return true;
            }
        }

        return false;
    }


    public boolean connectTheTariff(String phoneNumber, MobileOperator tariff) {
        Iterator<Client> iterator = subscribers.iterator();

        while(iterator.hasNext()) {
            if(iterator.next().getPhoneNumber() == phoneNumber) {
                iterator.next().setTariffOfMobileOperator(tariff);
                return true;
            }
        }

        return false;
    }


    public boolean disableTheTariff(String phoneNumber) {
        Iterator<Client> iterator = subscribers.iterator();

        while(iterator.hasNext()) {
            if(iterator.next().getPhoneNumber() == phoneNumber) {
                iterator.next().setTariffOfMobileOperator(null);
                return true;
            }
        }

        return false;
    }

    public List<Client> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(Client subscriber) {
        subscribers.add(subscriber);
    }
}
