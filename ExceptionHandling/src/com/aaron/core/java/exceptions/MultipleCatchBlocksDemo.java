package com.aaron.core.java.exceptions;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class MultipleCatchBlocksDemo {

    public static void exceptionCatcher()  {

        String fileName = null;

        try {
            int i = 4/0;
            FileReader fileObj = new FileReader(fileName);

        }

        catch(FileNotFoundException | RuntimeException e){

            if(e.getClass().isInstance(new NullPointerException()) ){
                System.out.println("File name should not be null");

                e.printStackTrace();
            }

            if(e.getClass().isInstance(new FileNotFoundException()) ) {
                System.out.println("Handling file not found exception");
            }



        }

    }

    public static void main (String args[]) throws ArithmeticException{


            exceptionCatcher();

    }

}
