package com.aaron.core.java.overloading;

public class PolymorphismDemo {

    public void run(){

        System.out.println("I am running now");
    }

    public void run(String name){

        System.out.println( name +" is running now");
    }


    public void run(String name, double kilometer){

        System.out.println( name+ " is running "+ kilometer +"km1 long");
    }

    public static void main(String args[]){

        PolymorphismDemo obj = new PolymorphismDemo();

        obj.run();
        obj.run("Aaron");
        obj.run("Aaron",5);

    }

}
