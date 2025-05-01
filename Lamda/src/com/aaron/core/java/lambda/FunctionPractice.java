package com.aaron.core.java.lambda;

import java.util.function.Function;

public class FunctionPractice {

    public static void main(String args[]){


        Function<String,Integer> x = i -> Integer.parseInt(i);
        Function<Integer,String> f = i -> Integer.toBinaryString(i);

        Function<String,String> v = x.andThen(f);

        Function<Integer,Integer> z = x.compose(f); //Function<Integer,Integer> z = f.andThen(x);

        

    }
}
