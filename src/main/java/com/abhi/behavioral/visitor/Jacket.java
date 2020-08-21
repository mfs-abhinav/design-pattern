package com.abhi.behavioral.visitor;

public class Jacket implements Visitable {
    private double price;

    public Jacket(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
