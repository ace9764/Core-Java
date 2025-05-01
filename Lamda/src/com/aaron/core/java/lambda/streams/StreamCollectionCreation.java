package com.aaron.core.java.lambda.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamCollectionCreation<E> {

    public static void main(String args[]){

        //스트림을 한번생성하고 Terminal operation 을 이미 쓰고 요소를 소모해서 에러가뜨는모습
//        Stream<Integer> integerStream = StreamCreation.performStreamIntegerCreation();
//
//        new StreamCreation().printStreamResource(integerStream);
//
//        new StreamCreation().printStreamResource(integerStream);


        //스트림을 두번생성하고 Terminal operation 따로해서 에러가없는모습 1 (남궁성씨 예제) method 많이만들어서 dynmiac 말고 그냥 메인에 하는방법

        List<Integer> integerList = Arrays.asList(1,2,3,4,5);

        Stream<Integer> integerStream = integerList.stream();

        integerStream.forEach(System.out::println);

        integerStream = integerList.stream();
        //Iterator 랑 상당히 비슷하다 거의 똑같다 Iterator 랑 상당히 비슷하다 Stream 역시 1회성

        // 여기서 에러가뜸 스트림을 다시 assign 안하면
        integerStream.forEach(System.out::println);

//        System.out.println("Second approcah (aaron's): ");

        //스트림을 두번생성하고 Terminal operation 따로해서 에러가없는모습 2
//        new StreamCreation().printStreamResource(StreamCreation.performStreamIntegerCreation()) ;
//
//        new StreamCreation().printStreamResource(StreamCreation.performStreamIntegerCreation()) ;


        new StreamCollectionCreation<String>().printStreamResource(StreamCollectionCreation.performStreamStringCreation()) ;


    }

    public static Stream<Integer> performStreamIntegerCreation(){

        List<Integer> integerList = Arrays.asList(1,2,3,4,5);

        return new StreamCollectionCreation<Integer>().createStream(integerList);

    }

    public static Stream<String> performStreamStringCreation(){

        List<String> stringList = Arrays.asList("Aaron", "Jake", "Brendan");

        return new StreamCollectionCreation<String>().createStream(stringList);

    }

    //Global stream creation method
    public<E> Stream<E> createStream(Collection<E> a){

        Stream<E> streamObject = a.stream(); //list 를 스트림으로 변환

        return streamObject;
    }

    //Global stream print method after creation method


    public void printStreamResource(Stream<E> a){

        a.forEach(System.out::println);
    }

}
