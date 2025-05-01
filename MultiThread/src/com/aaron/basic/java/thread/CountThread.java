package com.aaron.basic.java.thread;

import org.w3c.dom.css.Counter;

import javax.swing.*;

public class CountThread {

    public int sum(){

        return 5;
    }

    public static void main(String args[]){

        Thread th1 = new CounterThread();

        th1.start();


        String input = JOptionPane.showInputDialog("Please give us some input. Yes or no");

        th1.interrupt();

        CountThread a = new CountThread();

        a.sum();

    }


}


class CounterThread extends Thread{

    @Override
    public void run(){

        int i =10;
        while(!this.isInterrupted() && i > 0  ){

//            try {

                //Thread.sleep(1000);
                System.out.println("Retry? "+ i + " Seconds Left. Please Decide ");
                i--;
                for(long x = 0; x < 2500000000L ; x++);

                if(this.isInterrupted()){
                    //System.out.println("Thread Interrupted: " + this.interrupted());
                    System.out.println("Thread Interrupted: " + this.isInterrupted());
                }
//            }
//            catch(InterruptedException e){

//                System.out.println("Thread interrupted: "+ e);
//
//
//                Thread.currentThread().interrupt();

                System.out.println("Thread interrupt status: "+ Thread.currentThread().isInterrupted());
                //
                //                System.out.println("Thread interrupt status: "+ Thread.interrupted());

//            }
        }
    }

}


