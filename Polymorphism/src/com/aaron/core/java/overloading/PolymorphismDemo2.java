package com.aaron.core.java.overloading;

public class PolymorphismDemo2 {

        public void eat(int noOfBurgers) {
            System.out.println("eating..?" + noOfBurgers);
        }

        public void eat(float noOfBurgers) {
            System.out.println("eating these many..?" + noOfBurgers);
        }

        public static void main(String[] args) {
            PolymorphismDemo2 pd = new PolymorphismDemo2();
            pd.eat('c');
            pd.eat(10L);
            //pd.eat(10.5);
        }



    }

