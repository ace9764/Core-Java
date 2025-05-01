package core.java.multithread.chapter2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ThreadStackExample {

    public static void showStack(){

    }

    public static void main(String args[]){

//        Double requestedAmount = 3.5;
//
//        BigDecimal chargeTotal = new BigDecimal(requestedAmount);
//
//        System.out.println(chargeTotal);

        MyRunnable task = new MyRunnable();

        new Thread(task).start();

        new Thread(task).start();

        new Thread(task).start();

        System.out.println("Main Thread Terminated: "+ Thread.currentThread());

    }


}

class MyRunnable implements Runnable {

    @Override
    public void run(){

        firstMethod();
    }

    public void firstMethod(){

        Random random = new Random();
        int i  = random.nextInt(3);
        secondMethod(i);

    }

    public void secondMethod(int i){

        Random random = new Random();
        int price  = random.nextInt(25);

        Burger burger = new Burger(Menu.burgerMenu.get(i),price);
        System.out.println("Thread "+ Thread.currentThread() +" Burger: "+ burger);

    }




}

class Burger{

    String type;

    @Override
    public String toString() {
        return "Burger{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }

    int price;

    public Burger(){

    }
    public Burger(String type, int price){

        this.type=type;
        this.price=price;
    }



}

class Menu{

   static List<String> burgerMenu = Arrays.asList("CheeseBurger", "DoubleBurger", "BaconBurger");

}