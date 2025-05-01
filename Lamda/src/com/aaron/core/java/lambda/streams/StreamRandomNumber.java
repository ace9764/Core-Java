package com.aaron.core.java.lambda.streams;

import java.util.Random;
import java.util.stream.IntStream;

public class StreamRandomNumber {

    public static void main(String args[]){

        IntStream intStream = StreamRandomNumber.returnRandomIntStream(10); //무한 난수스트림

        //리밋이 없으면 끝도없이 출력한다!
        //        intStream.limit(10).forEach(System.out::println);

        intStream.forEach(System.out::println);

    }

    public static IntStream returnRandomIntStream(int noOfSize){

//        return new Random().ints(noOfSize);
        return new Random().ints(noOfSize,5,10);
    }
}
