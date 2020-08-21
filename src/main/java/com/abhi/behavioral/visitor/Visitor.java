package com.abhi.behavioral.visitor;

public interface Visitor {
    double visit(Shirt shirtItem);
    double visit(TShirt tShirtItem);
    double visit(Jacket jacketItem);
}
