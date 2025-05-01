package com.aaron.core.java.lambda;

import java.util.function.Function;

public class LambdaMethodReference {

    public static void main(String args[]){

        Function<String,Integer> functionF = new Function<String,Integer>(){
            @Override
            public Integer apply(String s) {
               return Integer.parseInt(s);
            };

        };

        Function<String,Integer> functionF1 = s -> Integer.parseInt(s);

        Function<String,Integer> functionF2 = Integer::parseInt;


        System.out.println(functionF.apply("300"));
        System.out.println(functionF1.apply("300"));
        System.out.println(functionF2.apply("300"));


    }
}
