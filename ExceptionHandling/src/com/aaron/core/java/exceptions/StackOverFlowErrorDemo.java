package com.aaron.core.java.exceptions;

public class StackOverFlowErrorDemo {


    public void printX(String word){

        printX(word);
    }

    public static void main (String args[]){

        StackOverFlowErrorDemo seDemo = new StackOverFlowErrorDemo ();

        //demo.printX("Hello");


    }
}
