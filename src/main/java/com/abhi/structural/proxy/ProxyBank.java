package com.abhi.structural.proxy;

public class ProxyBank implements Bank {
    Bank bank = new RealBank();

    @Override
    public void withdrawMoney(String clientName) throws Exception {
        bank.withdrawMoney(clientName);
    }
}
