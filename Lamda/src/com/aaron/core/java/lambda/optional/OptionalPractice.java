package com.aaron.core.java.lambda.optional;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalInt;

public class OptionalPractice<T> {

    public static void main(String args[]){

        String result = null;

        if(result != null) {
            System.out.println(result.toLowerCase());
        }

        System.out.println(Optional.ofNullable(result).orElse("NULL VALUE").toLowerCase());


        //Optional of empty string 과 empty 오브젝를사용해 밑에 exception 발생하는걸볼수잇는 예제. ifPresent에 가기도전에 number format exception 이뜬다
        Optional<String> option2 = Optional.of("");
        //Optional<String> option2 = Optional.ofNullable(null);
        //Optional<String> option2 = Optional.empty();
        option2.map(Integer::parseInt).ifPresent(System.out::println);
        //System.out.println("Empty?: "+ option2.filter(s -> s.length()>0).map(Integer::parseInt).orElse(-1));


        OptionalPractice optionalPractice = new OptionalPractice();

        //Optional<String> optionalObject = null;
        //이렇게 해도되지만, 바람직하지않다. 이런 null pointer를 피하기위해 optional 를쓰는거고 어떤 타입의 객채이던
        // null 을직접 다루는건 좋지않다

        //null pointer 발생
        //optionalPractice.optionalGet(optionalPractice.returnOptionalObject(null));

        //optionalPractice.optionalGet(optionalPractice.returnOptionalObject(""));

        //optionalPractice.optionalGet(Optional.empty());

        //same thing as above Because if input is null,
        // it will simply internally call static empty method and return empty optional object
        //optionalPractice.optionalGet(optionalPractice.returnOptionalOfNullableObject(null));

        //optionalPractice.optionalOrElse(optionalPractice.returnOptionalObject(new String("ABC")));

        //optionalPractice.optionalOrElseGet(optionalPractice.returnOptionalObject(new String("Aaron")));


        //primitive data type OptionalInt
        OptionalInt a = OptionalInt.of(0);
        //OptionalInt b = OptionalInt.of(0);
        OptionalInt b = OptionalInt.empty();

        //System.out.println("Default: "+ b.getAsInt()); // number format exception 이뜬다
        //System.out.println("Default: "+ b.orElseGet( () -> new Integer(0) )  );

        //System.out.println("Is A present?: "+ a.isPresent());
        //System.out.println("Is B present?: "+ b.isPresent());

        //System.out.println("are optional objects equal?:  "+ optionalPractice.isOptionalIntEqual(a,b));

    }


    public Optional<T> returnOptionalObject(T data){

        return Optional.of(data);
    }

    public Optional<T> returnOptionalOfNullableObject(T data){

        return Optional.ofNullable(data);
    }

    public OptionalInt returnOptionalIntObject(int i){

        return OptionalInt.of(i);
    }

    public boolean isOptionalIntEqual(OptionalInt a, OptionalInt b){

        //return a.getAsInt() == b.getAsInt();
        return a.equals(b);
    }


    public void optionalGet(Optional<T> optionalT){

        //이런식으로 예외처리를 해줘야하는데, 굉장히 번거롭기때문에이렇게 안한다
        try{
            System.out.println("Optional get value: "+optionalT.get());
        }catch(NoSuchElementException e){

            System.out.println("Error occured: "+e);
            System.out.println("Empty " + optionalT);
        }
    }

    public void optionalOrElse(Optional<String> optionalT){
        //이런식으로 예외처리를 해줘야하는데, 굉장히 번거롭기때문에이렇게 안한다

         System.out.println(optionalT.orElse("Empty")) ;
    }

    public void optionalOrElseGet(Optional<String> optionalT){

        //이런식으로 예외처리를 해줘야하는데, 굉장히 번거롭기때문에이렇게 안한다

        // or System.out.println(optionalT.<String>orElseGet(()-> new String())) ;
        //System.out.println(optionalT.<String>orElseGet(()-> "Empty")) ;

        System.out.println(optionalT.<String>orElseGet(String::new)) ;
    }


}
