package com.aaron.core.java;

public class StringIntern {

    public static void main(String args[]){

        String s = "Aaron";

        String s2 = new String("Aaron");

        s2.intern();

        if(s==s2.intern()){
            System.out.println("equals");
        }

        else{
            System.out.println("not equals");
        }
    }
}
