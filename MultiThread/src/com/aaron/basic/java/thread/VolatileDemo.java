package com.aaron.basic.java.thread;


class VolatileExecutor{

    public static void main(String args[]) throws InterruptedException{

        VolatileDemo th1 = new VolatileDemo("Aaron");

        Thread.sleep(5000);
        th1.suspend();

        Thread.sleep(5000);
        th1.resume();

        Thread.sleep(5000);
        th1.stop();


    }
}

public class VolatileDemo implements Runnable {

      boolean isSuspended = false;
      boolean isStopped = false;

    public void suspend(){

        this.isSuspended = true;
    }

    public void resume(){

        this.isSuspended = false;
    }

    public void stop(){

        this.isStopped = true;
    }

    public VolatileDemo(String name){

        th = new Thread(this,name);
        th.start();
    }

    Thread th ;

//    @Override
//    public void run(){
//
//        while(!isStopped){
//            if(!isSuspended){
//                try {
//                    Thread.sleep(1000);
//                    System.out.println("Not yet suspended. Continue to loop " + Thread.currentThread().getName());
//                }
//                catch(InterruptedException e){
//
//                    System.out.println("Error occured during sleep: "+ e);
//
//                }
//            }
//            else{
//                try {
//                    Thread.sleep(1000);
//                    System.out.println("Thread suspended. Wait until resume executed: " + Thread.currentThread().getName());
//                }
//                catch(InterruptedException e){
//
//                    System.out.println("Error occured during sleep: "+ e);
//
//                }
//            }
//        }
//
//    }

    @Override
    public void run(){

        while(!isStopped){
            if(!isSuspended){
                System.out.println("Not yet suspended. Continue to loop " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){

                    System.out.println("Error occured during sleep: "+ e);

                }
            }

        }

    }


}
