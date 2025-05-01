package com.aaron.core.java.lambda.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamArrayCreation<E> {

    public static void main(String args[]){

//        List<String> stringList = Arrays.asList("A","B","C");
//
//        stringList.forEach((s) -> System.out.println(s));
//
//        stringList.forEach(System.out::println);


//       Stream<String> stringStream =  Stream.of("A","B","C");

//        Stream<String> stringStream =  Stream.of(new String[]{"A","B","C"});
//
//        stringStream.forEach(System.out::println);


        new StreamArrayCreation<String>().printArrayStream(Arrays.stream(new String[]{"A","B","C"}));

        //OR
        new StreamArrayCreation<String>().printArrayStream(Stream.of("A","B","C"));




        //컴파일러가 int array를 Integer Array 로 autoboxing
        Integer[] integerArray = {1,2,3,4,5};

        Stream<Integer> integerObjectStream = Arrays.stream(integerArray);

        // Stream interface 에는 카운트는있지만 sum, average 같은 메소드가없다
        System.out.println("Count: " + integerObjectStream.count()) ;


        //primitive type 을 변환 스트림으로 그럴땐 IntStream data type 을 쓴다
        int[] intArray = {1,2,3,4,5};


        IntStream integerStream = IntStream.of(intArray);

//        IntStream integerStream2 = Arrays.stream(intArray);

//        System.out.println("Average: " + integerStream.average()) ;
        System.out.println("Sum: " + integerStream.sum()) ;

    }

    public void printArrayStream(Stream<E> arrayStream){

        arrayStream.forEach(System.out::println);

    }


}

