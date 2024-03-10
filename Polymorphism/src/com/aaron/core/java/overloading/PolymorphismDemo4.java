package com.aaron.core.java.overloading;

public class PolymorphismDemo4
{
    public static void count(int i){

        System.out.println("Count -> "+ i);
    }

    public static void count(int... i){

        for(int j :i) {
            System.out.println("Count (variable argument) ---> " + j);
        }
    }

    public static void main(String... args){

        //int [] arrayInt = {0,1,2};
        count(0);

        count();

        count(3, 6);

        count(3, 6, 9);

    }


}
