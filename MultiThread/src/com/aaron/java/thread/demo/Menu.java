package com.aaron.java.thread.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {

    public static List<Cuisine> getMenuList() {
        return menuList;
    }

    public final static List<Cuisine> menuList = Arrays.asList(new Cuisine[]{Cuisine.PIZZA,Cuisine.PASTA,Cuisine.TACO, Cuisine.BURGER, Cuisine.BIBIMBAP} ) ;


}
