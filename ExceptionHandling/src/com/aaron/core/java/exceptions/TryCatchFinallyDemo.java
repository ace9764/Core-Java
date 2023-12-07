package com.aaron.core.java.exceptions;

public class TryCatchFinallyDemo {

    public static void returnX(){

        try {
//            return 5;
            System.out.println(5/0);
        }
        catch(ArithmeticException ae){
//            return 8;
            System.out.println(ae.getMessage());
            throw new RuntimeException("Got Arithmetic Exception");
        }
        finally{
//            return 9;
            System.out.println("Finally Block");
        }
    }

    public static void main(String args[]){

       returnX();
    }
}
