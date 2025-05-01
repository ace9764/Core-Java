package com.aaron.core.java.interfaces;

public interface Animals {

    String category ="Animal";

    String country ="USA";

    boolean isNonHuman = true;

    public void noise();

    public void eat();

    public void sleep();

    default void walk(){

        System.out.println("Walking forward 1mile !");
    }

}
