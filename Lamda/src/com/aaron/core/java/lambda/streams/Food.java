package com.aaron.core.java.lambda.streams;

import java.util.Comparator;

public class Food implements Comparable<Food> {

    public Food(){
        this.calories= 0;
        this.name= "Default-Order";
        this.cuisine="Korean";
        this.price=0.0;

    }

    public Food(int calories, String name, String cuisine, double price){
        this.calories= calories;
        this.name= name;
        this.cuisine=cuisine;
        this.price=price;

    }

    @Override
    public int compareTo(Food a){

        return this.calories - a.calories;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", cuisine='" + cuisine + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }

    private String name;

    private String cuisine;

    private int calories;

    private double price;



}
