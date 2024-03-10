package com.aaron.core.java.overloading;

public class PolymorphismDemo5 {

    public static void run(int i, float f){
        System.out.println("int - float version");
    }

    public static void run(float f, int i){
        System.out.println("float - int version");
    }

    public static void main(String args[]){

         run(10, 10.5f);
        //  run(1, 1);
        //  run(1.0f, 1.0f);
        run(1.0f, 1);
    }

}
