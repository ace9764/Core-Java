package com.aaron.java.thread.demo;

public class Food {

    public Food(String name, String cuisineType) {
        this.name = name;
        this.cuisineType = cuisineType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }

    private String name;

    private String cuisineType;

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", cuisineType='" + cuisineType + '\'' +
                '}';
    }
}
