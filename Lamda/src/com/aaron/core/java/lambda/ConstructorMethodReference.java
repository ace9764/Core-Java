package com.aaron.core.java.lambda;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ConstructorMethodReference {

    public Integer age ;

    @Override
    public String toString() {
        return "ConstructorMethodReference{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public String name ;

    public ConstructorMethodReference(Integer i){

        this.name="Default Name";
        this.age = i;
    }

    public ConstructorMethodReference(Integer i, String s){

        this.age = i;
        this.name = s;
    }

    public static void main(String args[]){

//        Stream<Integer> s = 


        //Suppler의경우 input이없기때문에 default constructor 에 쓴다 (혹은 인풋이없을때)
//        ConstructorMethodReference s =  ConstructorMethodReference.returnSupplier().get();
//
//        System.out.println("Memory address: "+ s);

        ConstructorMethodReference f =  ConstructorMethodReference.returnFunction().apply(5);

        System.out.println("Function Object: "+ f);


        ConstructorMethodReference b =  ConstructorMethodReference.returnBiFunction().apply(5,"Aaron");

        System.out.println("BiFunction Object: "+ b);


        int[] a =  ConstructorMethodReference.returnArrayFunction().apply(5);

        System.out.println("Array Object: "+ Arrays.toString(a));


    }


//        static Supplier<ConstructorMethodReference> returnSupplier(){
//
//        Supplier<ConstructorMethodReference> s = ()-> new ConstructorMethodReference();
//
//        return s;
//    }

//    static Supplier<ConstructorMethodReference> returnSupplier(){
//
//        Supplier<ConstructorMethodReference> s = ConstructorMethodReference::new;
//
//        return s;
//    }


    static Function<Integer, ConstructorMethodReference> returnFunction(){

        Function<Integer,ConstructorMethodReference> f = ConstructorMethodReference::new;

//        Function<Integer,ConstructorMethodReference> f = i -> new ConstructorMethodReference(i);

        return f;
    }

    static BiFunction<Integer, String, ConstructorMethodReference> returnBiFunction(){

        BiFunction<Integer,String, ConstructorMethodReference> f = ConstructorMethodReference::new;

//        BiFunction<Integer,String, ConstructorMethodReference> f = (i, s) -> new ConstructorMethodReference(i,s) ;

        return f;
    }

    static Function<Integer, int[]> returnArrayFunction(){

        //Function<Integer,int[]> a = i -> new int[i];

        Function<Integer,int[]> a = ConstructorMethodReference::returnArray;

        //or simply
//        Function<Integer,int[]> a = int[]::new; //메서드참조

        return a;
    }

    static int[] returnArray(int i){

        return new int[i];
    }

}
