package com.aaron.core.java.interfaces;

public abstract class Cat implements Animals{

    public int noOfHoursOfSleep ;
    protected int age;

    public Cat(){

    }

    public Cat(int noOfHoursOfSleep, int age){

        this.noOfHoursOfSleep = noOfHoursOfSleep;
        this.age = age;
    }

    @Override
    public void noise() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat just ate tuna in a can");

    }

    @Override
    public void sleep() {
        System.out.println("Cat just slept for " + this.noOfHoursOfSleep);
    }

    public void attack()
    {
        System.out.println("Cat just attacked ");
    }

    public static void testStatic()
    {
        System.out.println("Static ");
    }
    public abstract void run();



}


