package org.example;

public abstract class AbstractClassTest {
    int no;
    String id;

    AbstractClassTest(int no,
    String id
    ){
        this.id=id;
        this.no=no;
    }

    public abstract void printString();
}
