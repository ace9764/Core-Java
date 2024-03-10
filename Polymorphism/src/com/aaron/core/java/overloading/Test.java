package com.aaron.core.java.overloading;

 class Animal {

     public void sleep(int noOfHours){
         System.out.println("Animal slept for "+noOfHours);
     }

}

class Cat extends Animal {

     public void sleep(int... noOfHours){
         System.out.println("Cat slept for "+ noOfHours);
     }

}

 public class Test{

     public static void animal(Animal animal){

         System.out.println("animal");
     }

     public static void animal(Cat cat){
         System.out.println("cat");
     }

     public static void main (String args[]){

         Animal animal = new Animal();

         Cat cat = new Cat();



         Animal animal2 = new Cat();

         animal2.sleep(5);


       //  Cat cat2 = new Animal();

//         animal(animal);
//
//         animal(cat);
//
//         animal(animal2);


     }
}

