package org.example;

public abstract class AbstractClassTest {
    int no;
    String id;

    AbstractClassTest(int no, String id ){
        this.id=id;
        this.no=no;
    }

    AbstractClassTest(){}

    public abstract void printString();
    public static void printStringBody(){
        System.out.println("class with body");
    };
}
