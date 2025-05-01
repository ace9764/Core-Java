package com.aaron.core.java;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String args[]){

        TreeSet<String> stringTreeSet = new TreeSet<>();

        stringTreeSet.add("ABCD");

        stringTreeSet.add("BCD");

        stringTreeSet.add("CD");

        stringTreeSet.add("Czzzz");


        System.out.println("Print between A and C: " + stringTreeSet.subSet("A","Czzzz"));





    }
}
