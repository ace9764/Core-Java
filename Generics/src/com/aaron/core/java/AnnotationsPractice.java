package com.aaron.core.java;

public class AnnotationsPractice {

    @Deprecated
    String oldString;

    @Deprecated
    void dontUse(){

        System.out.println("Dont use. Deprecated!");

    }

    void useMethod(){
        System.out.println("Use this method! ");
    }



}


class AnnotationsChild extends AnnotationsPractice{

//    @Override
//    void usedMethod(){
//
//        System.out.println("Use this child method! ");
//    }


    @Override
    @Deprecated
    void dontUse(){

        System.out.println("Dont use. Deprecated child!");
    }

}

class Executor{


    @SuppressWarnings("deprecation")
    public static void main(){

        AnnotationsChild annotationsChild = new AnnotationsChild();

        annotationsChild.dontUse();

    }

}


//@FunctionalInterface
//interface eatable{
//
//    void eat();
//
//    void eatDouble();
//
//}
