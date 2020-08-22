package com.abhi.behavioral.chainofresponsibility;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}
