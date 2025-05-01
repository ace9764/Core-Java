package com.aaron.core.java.interfaces;

public class Dog implements Animals{

    String name ;

    String type;

    public Dog(String name, String type)
    {
        this.name = name;
        this.type = type;
    }
    @Override
    public void eat(){
        System.out.println("Dog just ate bone");
    }

    @Override
    public void sleep(){
        System.out.println("Dog just slept for 10 hours");
    }

    @Override
    public void noise(){
        System.out.println("Dog just barked -> bow bow");
    }

    @Override
    public String toString(){
       return "Name is: " +this.name + " Dog Type is: " +this.type + "/ Category "+ category + "/ Country: " + country +"/ is non human?: "+ isNonHuman;
    }
}
