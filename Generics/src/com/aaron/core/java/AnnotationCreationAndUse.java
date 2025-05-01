package com.aaron.core.java;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface TestAnnotation{

    int count() default 1;
    String testedBy ();

    String[] testTools() default "Junit";
    TestType testType();

    TestAnnotation2 testAnnotation();

}

@interface TestAnnotation2{

    int count() default 1;
    String testedBy ();

    String createdTimeStamp ();

}

@TestAnnotation(testTools = {"Junit", "AutoTester"} ,
                testedBy = "Aaron", testType= TestType.FIRST,
                testAnnotation = @TestAnnotation2 (testedBy ="Jenny",
                createdTimeStamp ="2025-03-23" ))
@Deprecated
@SuppressWarnings("1111") //유효하지않기 때문에 무시된다
public class AnnotationCreationAndUse {



    public static void main(String args[]){

        Class<AnnotationCreationAndUse> annotationCreationAndUse = AnnotationCreationAndUse.class;

        TestAnnotation testAnnotation = annotationCreationAndUse.getAnnotation(TestAnnotation.class);

        System.out.println("Resources in TestAnnotation used in AnnotationCreationAndUse class ");

        System.out.println("Count: "+ testAnnotation.count());
        System.out.println("testedBy: "+ testAnnotation.testedBy());
        System.out.println("testType: "+ testAnnotation.testType());
        Arrays.stream(testAnnotation.testTools()).forEach(s -> System.out.println("TestTool: "+ s) );
        System.out.println("TestAnnotation2: " + testAnnotation.testAnnotation());


        System.out.println("");
        Arrays.stream(annotationCreationAndUse.getAnnotations()).forEach(a -> System.out.println("All Annotation used in class: AnnotationCreationAndUse -> " +a));


        Object[] objArray = new Object[]{"String",5};

    }

}


enum TestType {
    FIRST("First","First");

    String key;

    String value;

     TestType(String key, String value){

         this.key = key;
         this.value=value;
    }

}

