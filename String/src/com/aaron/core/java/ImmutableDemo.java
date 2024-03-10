package com.aaron.core.java;

public final class ImmutableDemo {
    private final int i;

    public ImmutableDemo(int i){

        this.i = i;
    }
    public ImmutableDemo changeValue(int i){

        if(this.i == i)
        {
            return this;
        }
        else
        {
            return new ImmutableDemo(i);
        }
    }

    public static void main(String args[]){

        ImmutableDemo im1 = new ImmutableDemo(1);

        ImmutableDemo im2 = im1.changeValue(100);

        if(im1 == im2){
            System.out.println("Same Object");
            System.out.println(im1.i);
        }else{
            System.out.println("New Object Created");
            System.out.println(im2.i);
        }

        String s = "Aaron";

        String i = s + " Burger";

        String c = "Aaron Burger";

        String j = "Aaron" +" Burger";

        String k = new String("Aaron Burger");

        System.out.println(c == j);

    }

}
