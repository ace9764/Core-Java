package com.aaron.core.java.interfaces;

public class DogDemo {

    public static void main (String args[]){

        Dog dog1 = new Dog("Alex", "Huskey");

        System.out.println(dog1);

        dog1.eat();

        dog1.sleep();

        dog1.noise();

    }
}
