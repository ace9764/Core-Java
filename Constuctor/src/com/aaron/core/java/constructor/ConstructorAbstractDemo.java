package com.aaron.core.java.constructor;

 abstract class AbstractTest{

    public abstract void test();

    public AbstractTest (){
        System.out.println("Parent constructor");
    }
}

public class ConstructorAbstractDemo extends AbstractTest {

    public static void main(String args[]){
        ConstructorAbstractDemo constructorAbstractDemo = new ConstructorAbstractDemo();
    }

    @Override
    public void test(){
        System.out.println("Test method invoked");
    }
}
