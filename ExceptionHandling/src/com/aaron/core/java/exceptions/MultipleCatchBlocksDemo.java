package com.aaron.core.java.exceptions;

public class MultipleCatchBlocksDemo {

    public static void main (String args[]){

        try{
            throw new RuntimeException("RunTimeException");
        }
        catch(Exception re){

            System.out.println(re.getMessage());
        }

    }

}
