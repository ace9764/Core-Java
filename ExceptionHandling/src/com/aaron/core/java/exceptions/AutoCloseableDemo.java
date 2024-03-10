package com.aaron.core.java.exceptions;


public class AutoCloseableDemo implements AutoCloseable{

    public void close(){
        System.out.println("closing this custom resource");
    }
}
