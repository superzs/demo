package com.designPattern.behavioral.visitor;

/**
 * Created by hongjingjun on 16/2/15.
 */
public class ConcreteVisitor1 implements IVisitor {

    public void visitConcreteElementA(ConcreteElementA elementA) {

        System.out.println("V1 EA ");
    }

    public void visitConcreteElementB(ConcreteElementB elementB) {
        System.out.println("V1 EB ");
    }
}
