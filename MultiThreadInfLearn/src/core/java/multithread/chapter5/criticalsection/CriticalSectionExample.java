package core.java.multithread.chapter5.criticalsection;

public class CriticalSectionExample {

    public static void main (String args[]){

        SharedResource resource =  new SharedResource();

        Thread th1 = new Thread(()->{
            resource.increment();


        }, "Thread1");

        Thread th2 = new Thread(resource::increment, "Thread2");



        th1.start();
        th2.start();


        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Final result of counter: "+ resource.counter);


    }



}

class SharedResource{

    public int counter=0;

    public void increment(){

        for( int i =0; i<100000; i++){

            synchronized (this) {
                counter++;
            }

        }

        //System.out.println("Thread entering remainder section: "+ Thread.currentThread().getName());
        System.out.println("Thread entering remainder section: "+ Thread.currentThread().getName());


    }

}