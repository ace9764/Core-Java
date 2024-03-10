package com.aaron.core.java.overloading;
public class PolymorphismDemo3 {

    public void eat(Object Burger) {
        System.out.println("eating..?" + Burger);
    }

//    public void eat(Long size) {
//        System.out.println("size..?" + size);
//    }
//    public void eat(Double size) {
//        System.out.println("size..?" + size);
//    }

//    public void eat(String Burger) {
//        System.out.println("eating...?" + Burger);
//    }


    public void eat(StringBuffer str){
        System.out.println(str);
    }



    public static void main(String[] args) {

        PolymorphismDemo3 pd = new PolymorphismDemo3();

        pd.eat(new Object());
        pd.eat(1);
        pd.eat("Cheese burger");
        pd.eat(null);


    }



}