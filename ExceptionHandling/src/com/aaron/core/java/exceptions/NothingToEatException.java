package com.aaron.core.java.exceptions;

public class NothingToEatException extends RuntimeException{

    public NothingToEatException(String message){

        super(message);
    }

    public NothingToEatException(Throwable cause){

        super(cause);
    }

    public NothingToEatException(String message,Throwable cause ){

        super(message,cause);
    }

}
