package com.aaron.thread.runnable;

class Burger{

    String burgerName;

    public Burger(String burgerName){

        this.burgerName= burgerName;
    }

    @Override
    public String toString(){

        return this.burgerName;
    }
}

public class MixedSynchronizationDemo {

    Integer counter ;

    Burger burger;

    public MixedSynchronizationDemo(Burger burger){
        this.burger = burger;
    }

    public void eatBurger(){
        synchronized (this.burger) {
            for(int i=0; i <1000; i++) {
                System.out.println("Eating a burger " + this.burger);
            }
        }
    }

    public void walk(){
        synchronized (this) {
            for(int i=0; i <1000; i++) {
                System.out.println("walking " +i+ "miles " );
            }
        }
    }

    public static synchronized void eat(){
        for(int i=0; i <1000; i++) {
            System.out.println("Eating a " +i+ "th burger ");
        }
    }

    public synchronized void sleep(){
        for(int i=0; i <1000; i++) {
            System.out.println("Sleeping " +i+ " hours after lunch ");
        }
    }

    public static void main(String args[]){

        MixedSynchronizationDemo mixedSynchronizationDemo1 = new MixedSynchronizationDemo(new Burger("Cheese Burger"));

        MixedSynchronizationDemo mixedSynchronizationDemo2 = new MixedSynchronizationDemo(new Burger("Jalapeno Burger"));

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                eat();
                //static synchronized
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                mixedSynchronizationDemo1.sleep();
                //MixedSynchronizationDemo synchornized method
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                mixedSynchronizationDemo1.eatBurger();
                //synchornized block on MixedSynchronizationDemo with burger object
            }
        });

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                mixedSynchronizationDemo1.walk();
                //synchornized block on the MixedSynchronizationDemo object(this)
            }
        });

        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                mixedSynchronizationDemo2.walk();
                //synchornized block on the MixedSynchronizationDemo2 object(this)
            }
        });
        Thread thread6 = new Thread(new Runnable() {
            @Override
            public void run() {
                mixedSynchronizationDemo2.eatBurger();
                //synchornized block on MixedSynchronizationDemo2 with burger object
            }
        });


//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();

    }

}
