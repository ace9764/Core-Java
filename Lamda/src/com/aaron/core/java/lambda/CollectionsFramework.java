package com.aaron.core.java.lambda;

import java.util.*;

public class CollectionsFramework {

    public static void main(String args[]){





        List<String> xList = new ArrayList<>();

        xList.add("Aaron");
        xList.add("Brendan");
        xList.add("Jake");

        xList.forEach(i -> System.out.println(i));

        xList.removeIf(i -> i.equals("Aaron"));

        xList.replaceAll(i -> i + new Random().nextInt(3));

        System.out.println(xList);

        Map<String, Object> newMap = new HashMap<>();

        newMap.put("1", "1");
        newMap.put("2", "2");
        newMap.put("3", "3");

        newMap.forEach((k,v)-> System.out.println("Key: "+ k + " Value: " + v));

        newMap.keySet().removeIf(s-> s.equals("1"));


        newMap.forEach((k,v)-> System.out.println("Key: "+ k + " Value: " + v));
    }
}
