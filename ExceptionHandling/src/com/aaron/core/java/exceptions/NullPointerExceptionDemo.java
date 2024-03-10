package com.aaron.core.java.exceptions;
import java.util.ArrayList;

public class NullPointerExceptionDemo {

    static boolean isNull ;

    public static void main (String args[]){

        ArrayList<String> aryList = new ArrayList<>() ;

        //aryList.add("Hi");

        System.out.println(aryList.get(0).length());

        System.out.println(aryList.get(0));

        System.out.println(isNull);

        if(!isNull){
            System.out.println("hello ");
        }

    }
}
