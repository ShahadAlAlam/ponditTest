package org.example;

public class AbstractClassTestChild extends AbstractClassTest{

    AbstractClassTestChild(int no, String id) {
        super(no, id);
    }

    public AbstractClassTestChild(){
        super();
    }

    @Override
    public void printString() {
        System.out.println("this is child class");
    }

    public static void main(String[] args) {
        printStringBody();
        AbstractClassTestChild c = new AbstractClassTestChild();
        c.printString();
    }

}
