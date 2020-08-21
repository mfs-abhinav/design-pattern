package com.abhi.behavioral.visitor;

public interface Visitable {
    double accept(Visitor visitor);
}
