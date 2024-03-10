package com.aaron.core.java.constructor;

 public class ConstructorDemo {

    public String name;
    public Integer age;
    public boolean isStudent;

    public Double weight;

//     private ConstructorDemo(){
//        super();
//    }

     private ConstructorDemo(String name, Integer age, boolean isStudent) {
        this.name = name;
        this.age = age;
        this.isStudent = isStudent;
    }

     private ConstructorDemo(String name, Integer age, boolean isStudent, Double weight) {
         this.name = name;
         this.age = age;
         this.isStudent = isStudent;
         this.weight = weight;
     }



}

//class Test {
//    public static void main(String args[]){
//
//        ConstructorDemo constructorDemo = new ConstructorDemo("Aaron", 26, false);
//    }
//}