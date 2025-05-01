package com.aaron.core.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo {

    public static void main(String args[]){

        Collection<Object> objList = new ArrayList<>();




        ArrayList<Object> aryList= new ArrayList<>();

        //         objList.listIterator();
        aryList.listIterator();

        aryList.ensureCapacity(10);

        aryList.add("5");
        aryList.add("5");
        aryList.add("5");
        aryList.add("5");
        aryList.add("5");
        aryList.add("5");
        aryList.add("5");
        aryList.add("5");
        aryList.add("5");
        aryList.add("5");

        System.out.println("With 10 elements: "+ aryList +" Size of list: " +aryList.size() );

        aryList.add("20");

        System.out.println("With 11 elements: "+ aryList +" Size of list: " +aryList.size()  );


        System.out.println("Contains 5? "+ aryList.contains("5")   );





    }

//    public int thirdOccurenceIndex(ArrayList<Object> aryList){
//
//        for()
//
//        return 0;
//    }

//    public int thirdOccurenceIndex(ArrayList<Object> aryList){
//
//        for()
//
//        return 0;
//    }

}
