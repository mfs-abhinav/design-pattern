package com.abhi.structural.proxy;

public class Main {
    public static void main(String[] args) {
        Bank bank = new ProxyBank();
        try {
            bank.withdrawMoney("Abhinav");
            bank.withdrawMoney("@me");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
