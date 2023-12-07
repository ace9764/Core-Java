package com.aaron.core.java.exceptions;
import java.io.FileReader;


public class NestedTryCatchDemo {

    public static void main(String args[]) {


        try{
            System.out.println(1/2);

            try{
                System.out.println(5/0);
            }
            catch(ArithmeticException ae){

                throw new RuntimeException("cannot divide number by 0 ",new Throwable("Calculation -> Math: 5/0 is wrong"));
            }
        }
        catch(ArithmeticException ae){

            try{
                throw new RuntimeException("ArithmeticException caught");
            }
            catch(ArithmeticException ae1){
                throw new RuntimeException("Arithemtic Exception happend");
            }

        }
        finally{

            try{
                System.out.println("Will print No matter what");
            }
            catch(RuntimeException re){
                System.out.println("It will not come here");
            }

        }

    }
}
