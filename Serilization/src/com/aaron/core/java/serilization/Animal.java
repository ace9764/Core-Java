package com.aaron.core.java.serilization;


import java.io.*;

public class Animal  {

//    public Animal(){
//        this  (5);
//        System.out.println("Printed");
//    }

//    public Animal(int noOfLegs){
//        this.noOfLegs =noOfLegs;
//    }

    public int noOfLegs =4 ;


    @Override
    public String toString() {
        return "Animal{" +
                "noOfLegs=" + noOfLegs +
                '}';
    }

    public static void main(String args[]) throws Exception{

//        Bird bird = new Bird("blue");
//
//        bird.noOfLegs = 2;
//
//        FileOutputStream fileOutputStream = new FileOutputStream("Bird2.ser");
//
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//
//        objectOutputStream.writeObject(bird);
//
//        System.out.println(bird);


        try {
            FileInputStream fileInputStream = new FileInputStream("Bird2.ser");

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Bird birdResponse = (Bird) objectInputStream.readObject();

            System.out.println(birdResponse);
        }
        catch(Exception e){

            System.out.println("Error happened during deserializaion");
            throw new RuntimeException(e);
        }

    }
}


class Bird extends Animal implements Serializable {

    public static final Long SerialVersionUID = 123456789012314L;
    public String color;

    public String dummy;

    public Object data;

    public Object data2;

    public Object data3;



//    public Bird(){
//
//    }

        public Bird(String color){

        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    @Override
//    public String toString() {
//        return this.noOfLegs + " "+ this.color;
//    }

    @Override
    public String toString() {
        return  " "+ this.color;
    }
}


