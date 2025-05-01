package core.java.multithread.chapter3;

public class InterruptExample2 {


    public static void main(String args[]) {

        Thread thread0 = new Thread(() -> {

            while(!Thread.interrupted()){

                System.out.println("Thread "+ Thread.currentThread().getName()+" up and running.");

            }

            System.out.println("Thread "+ Thread.currentThread().getName()+" got interrupted.");
            System.out.println("Thread "+ Thread.currentThread().getName()+" interruption status : "+ Thread.currentThread().isInterrupted());


        },"Aaron");


        Thread thread1 = new Thread(()->{

            thread0.interrupt();

        });


        thread0.start();

        try {
            Thread.sleep(300);
        }
        catch(InterruptedException e){

        }


        thread1.start();

    }

}
