package com.aaron.thread.runnable;


public class StaticSynchronizedDemo {

    static int counter = 1;

    public  static void eat()
    {
        synchronized(StaticSynchronizedDemo.class) {
            for (int i = 0; i < 10; i++) {
                System.out.println("This is my " + counter + "th meal");
                counter++;
            }
        }
    }

    public static void daysWithoutShower()
    {
        for(int i=0; i<10; i++) {
            System.out.println("This is my day " + counter + " without shower");
            counter++;
        }
    }

    public static void main(String args[]) throws Exception{

        Thread tr1 = new Thread(new Runnable(){
            @Override
            public void run(){
                eat();
            }
        });

        Thread tr2 = new Thread(new Runnable(){
            @Override
            public void run(){
                daysWithoutShower();
            }
        });


//        tr1.join();
//        tr2.join();

        tr1.start();
        tr2.start();


    }

}
