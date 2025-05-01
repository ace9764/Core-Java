package com.aaron.core.java;


import java.util.ArrayList;
import java.util.List;

//wildcard
//generic method
public class GenericWildCardPractice<T> {

    public static void main(String args[]){

        performCarDisplay();
    }
    List<T> listOfObjects = new ArrayList<>();

//    public static void displayCars(Dealer<? extends Car> dealer){
//
//        dealer.listOfCars.forEach(s -> System.out.println("List of cars: "+ s));
//
//    }

    public static<T extends Car> void displayCars(Dealer<T> dealer){

        dealer.listOfCars.forEach(s -> System.out.println("List of cars: "+ s) );
    }

    public static void performCarDisplay(){

            Dealer<? extends Car> jaeyoung = new Dealer<SportsCar>("Jaeyoung");

            //wildcard의 장점은 이렇게 하나의 generic type reference variable로 여러가지 객체를 refer하는게가능하다는점,
            // 원래의 generic type만으로는 안되는걸 가능해가헤준다
            jaeyoung = new Dealer<CampingCar>("Jaeyoung");
            jaeyoung = new Dealer<ComfortCar>("Jaeyoung");
            jaeyoung = new Dealer<Car>("Jaeyoung");

            //jaeyoung.listOfCars.add(new Car());
            //jaeyoung.addCar(new Car("Regular Car"));

;

        Dealer<SportsCar> hongsun = new Dealer<SportsCar>("Hongsun");

        hongsun.addCar(new SportsCar("Lambo"));
        hongsun.addCar(new SportsCar("Tesla"));
        hongsun.addCar(new SportsCar("Rolce royce"));


        Dealer<ComfortCar> aaron = new Dealer<ComfortCar>("Aaron");

        aaron.addCar(new ComfortCar("Honda Pilot"));
        aaron.addCar(new ComfortCar("Honda Odeyseey"));
        aaron.addCar(new ComfortCar("Toyota Camry"));


        System.out.print("Hongsun -> ");
        GenericWildCardPractice.<SportsCar>displayCars(hongsun);

        System.out.println("");

        System.out.print("Aaron -> ");
        GenericWildCardPractice.<ComfortCar>displayCars(aaron); //생략가능



    }

}


class Car implements Driveable{

    public Car(){

    }

    @Override
    public void printCarSpecs(){

        System.out.println("This is Year 2025, White color car with newest Engine");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }

    String name;

    public Car(String name){
        this.name=name;
    }

}

class Dealer<T extends Car & Driveable >{

    String name;

    List<T> listOfCars = new ArrayList<>();

     void addCar(T car){

        listOfCars.add(car);
    }

    public Dealer(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dealer{" +
                "name='" + name + '\'' +
                ", listOfCars=" + listOfCars +
                '}';
    }


}

class SportsCar extends Car{

    String name;

    public SportsCar(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "SportsCar{" +
                "name='" + name + '\'' +
                '}';
    }
}

class CampingCar extends Car{

    String name;

    public CampingCar(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "CampingCar{" +
                "name='" + name + '\'' +
                '}';
    }
}


class ComfortCar extends Car{

    String name;


    public ComfortCar(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "ComfortCar{" +
                "name='" + name + '\'' +
                '}';
    }
}


interface Driveable{

    public void printCarSpecs();
}

