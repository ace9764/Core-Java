package com.aaron.core.java;

import java.util.Arrays;
import java.util.List;

public class GenericTypePractice<T> {

    public static void main(String args[]){

        performGenericTest();
    }

    public static void performGenericTest(){

        // 여기서 foodList 에 element add 할때,  boolean add(E e) -> boolean add(Food e) 로 type parameter 가 실제타입으로 대입되는것!
        //좋은방법 이아닐수있다는거 -?
       List<Food> foodList =  new GenericTypePractice().returnList( new Food(), new Taco(), new Pasta(), new String("Hello"));



       Food food = foodList.get(0);

       System.out.println("Food object "+ food);

       Taco food1 = (Taco) foodList.get(1);

       //class cast exception 안뜬다

        System.out.println("Taco object "+ food1);

       Pasta food2 = (Pasta) foodList.get(2);
       //class cast exception 안뜬다

       System.out.println("Pasta object "+ food2);


        //String food3 =  (String) foodList.get(3);
        //class cast exception 가 뜬다

        //System.out.println("String object "+ food3);

    }

    public List<T> returnList(T... tList){

        return Arrays.asList(tList);
    }

}

class Food{

}

class Taco extends Food{

    public void printTaco(){

        System.out.println("I am taco!");
    }
}

class Pasta extends Food{

    public void printPasta(){

        System.out.println("I am pasta!");
    }

}
