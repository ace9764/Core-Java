package com.aaron.core.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsBasicPractice<T> {

    public static void main(String args[]){

//        Object pizzaObject = new Pizza();

//        try {
//            Burger burger = (Burger) pizzaObject;
//            System.out.println("Burger: "+burger);
//        }
//        catch(Exception e) {
//            System.out.println("Exception occured!: "+ e);
//            e.printStackTrace();
//        }

        //List pizzaList = new GenericsBasicPractice().returnList(new Pizza(), new Pizza(), new Burger());

        //List<Object> pizzaList = new GenericsBasicPractice().returnList(new Pizza(), new Pizza(), new Burger());

        //trying to convert Burger into Pizza - causes class cast exception
        //Pizza pizza = (Pizza) pizzaList.get(2);

        //List<Pizza> pizzaList = new GenericsBasicPractice().returnList(new Pizza(), new Pizza(), new Burger());

        //이렇게하면 컴파일러게 에러를표시한다
        //List<Pizza> pizzaList = new GenericsBasicPractice().returnList(new Pizza(), new Pizza(), new Burger());



    }


    //이거조차도, T로 define 햇기때문에, compilier 가 알아채지못하고 버거가들어와도 컴파일에러를 안낸다
//    public List<T> returnList(T... ts){
//
//        return Arrays.asList(ts);
//    }

        public List<Pizza> returnList(Pizza... ts){

        return Arrays.asList(ts);
    }

}


class Pizza{

    public Pizza(){

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }

    String type;

    int price;
}

class Burger{

    public Burger(){

    }

    @Override
    public String toString() {
        return "Burger{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }

    String type;

    int price;
}