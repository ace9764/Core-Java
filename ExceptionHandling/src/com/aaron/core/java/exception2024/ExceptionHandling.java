package com.aaron.core.java.exception2024;

public class ExceptionHandling {

    static void fun()
//            throws NullPointerException
    {
//        try {
            throw new NullPointerException("Null Data! ");
//        }
//        catch (NullPointerException e) {
//            System.out.println("Caught inside fun().");
//            throw e; // rethrowing the exception
//        }
    }

    public static void main(String args[])
    {
        try {
            fun();

        }
        catch (NullPointerException e) {
            System.out.println("Caught in main.");
//            throw e;
        }
    }

}
