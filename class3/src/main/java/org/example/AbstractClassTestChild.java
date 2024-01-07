package org.example;

public class AbstractClassTestChild extends AbstractClassTest{

    AbstractClassTestChild(int no, String id) {
        super(no, id);
    }

    @Override
    public void printString() {
        System.out.println("this is child class");
    }
}
