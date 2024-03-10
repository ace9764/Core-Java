package com.aaron.core.java.exceptions;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class TryWithResourcesDemo {
    public static void reader()   {

        try(AutoCloseableDemo ad = new AutoCloseableDemo()) {

        }
        catch(Exception fe){

        }
    }
    public static void main (String args[]){

        reader();

    }
}
