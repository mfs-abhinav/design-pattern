package com.abhi.behavioral.visitor;

public class TaxVisitor implements Visitor {
    @Override
    public double visit(Shirt shirtItem) {
        System.out.print("Calculate price of shirt item after tax: ");
        return shirtItem.getPrice() + shirtItem.getPrice() * .10;
    }

    @Override
    public double visit(TShirt tShirtItem) {
        System.out.print("Calculate price of tshirt item after tax: ");
        return tShirtItem.getPrice() + tShirtItem.getPrice() * .20;
    }

    @Override
    public double visit(Jacket jacketItem) {
        System.out.print("Calculate price of jacketItem item after tax: ");
        return jacketItem.getPrice() + jacketItem.getPrice() * .20;
    }
}
