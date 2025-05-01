package com.aaron.java.thread.demo;

public enum Cuisine {

    PIZZA("Pizza", "Italian"),

    PASTA("Pasta", "Italian"),

    TACO("Taco", "Mexican"),

    BURGER("Burger", "American"),

    BIBIMBAP("Bibimbap", "Korean");

    private String name;

    private String cuisine;

    private Cuisine(String name, String cuisine)
    {
        this.name = name;
        this.cuisine = cuisine;
    }

    public String getName()
    {
        return this.name;
    }

    public String getCuisine()
    {
        return this.cuisine;
    }








}
