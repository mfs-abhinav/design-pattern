package com.abhi.behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        TaxVisitor taxVisitor = new TaxVisitor();

        Jacket jacket = new Jacket(500);
        Shirt shirt = new Shirt(200);
        TShirt tShirt = new TShirt(100);

        System.out.println(jacket.accept(taxVisitor));
        System.out.println(shirt.accept(taxVisitor));
        System.out.println(tShirt.accept(taxVisitor));
    }
}
