package com.aaron.core.java;

import java.util.Arrays;
import java.util.List;
import java.util.*;

public class ArraysDemo {


    public static void main (String[] args){

        Integer[] intArrayI = new Integer[5];

        intArrayI[0] = 6;
        intArrayI[1] = 61;
        intArrayI[2] = 611;
        intArrayI[3] = 6111;
        intArrayI[4] = 61111;

        for(int i =0; i< 5; i++){

            System.out.println("At Index " + i +" Value is : " +intArrayI[i] );
        }

        System.out.println("Printing Numbers: " + Arrays.toString(intArrayI));

        List<Integer> in = Arrays.asList(intArrayI);

        List<Integer> o = new ArrayList<>();

        //in.add(1); UnsupportedOperationExceptions

        List<Integer> list =new ArrayList<>(in);




    }

}
