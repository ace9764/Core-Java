package com.aaron.core.java.lambda.streams;

import java.util.stream.Stream;

public class StreamGenerateAndIterate<E> {

    public static void main(String args[]){

        Stream<Integer> integerIterateStream = new StreamGenerateAndIterate<>().returnIterateStream();

        integerIterateStream.limit(10).forEach(System.out::println);


        Stream<Integer> integerGenerateStream = new StreamGenerateAndIterate<>().returnGenerateStream();

        integerGenerateStream.limit(10).forEach(System.out::println);


    }

    public Stream<Integer> returnIterateStream(){

        //Unary operator (T seed,  UnaryOperator f)
        return Stream.iterate(1, n -> n + 2);
    }

    public Stream<Integer> returnGenerateStream(){

        //generate 는 주기만하는 Supplier 이다
        return Stream.generate(() -> 1);
    }
}
