package com.abhi.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class RealBank implements Bank {
    private static List<String> blockedClient;

    static {
        blockedClient = new ArrayList<>();
        blockedClient.add("xyz");
        blockedClient.add("@me");
    }

    @Override
    public void withdrawMoney(String clientName) throws Exception {
        if (blockedClient.contains(clientName)) {
            throw new Exception(clientName + " You are blocked..");
        }
        System.out.println(clientName + " is withdrawing money");
    }
}
