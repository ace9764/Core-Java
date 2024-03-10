package com.aaron.core.java.overriding;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Restaurant  {

    public StringBuilder food() throws IOException {

        FileReader file = new FileReader("Json.json");

        System.out.println("chef is preparing food");

        return new StringBuilder();
    }

    public Number propertyPrice(){
        System.out.println("chef is preparing food");
        return 5;
    }

    public void menu(){

        System.out.println("Here are lists of Menus ");
    }

    public synchronized void display(){

        System.out.println("Here are food samples ");
    }

    public String getLocation(){

        return "Address";
    }

//    public int propertyPricePrmitiveType(){
//        System.out.println("chef is preparing food");
//        return 5;
//    }

}

abstract class BurgerRestaurant extends Restaurant  {

    String burgerName;

    @Override
    public StringBuilder food() throws IOException, FileNotFoundException {
        System.out.println("chef is preparing burger");
        return new StringBuilder();
    }

    @Override
    public Double propertyPrice(){
        System.out.println("chef is preparing food");
        return 5.0;
    }

    @Override
    public abstract void menu();

    @Override
    public void display(){

        System.out.println("Here are burger samples ");
    }

    @Override
    public synchronized String getLocation(){

        return "Address";
    }


//    @Override
//    public byte propertyPricePrmitiveType(){
//        System.out.println("chef is preparing food");
//        return 5;
//    }

}

public class OverridingDemo {

    public static void main (String args[]){

        Restaurant restaurant = new Restaurant();

//        BurgerRestaurant burgerRestaurant = new BurgerRestaurant();

//        restaurant.food();

//        burgerRestaurant.food();

    }
}
