package core.java.multithread.chapter3;

public class IsInterruptedExample {

    static int  counter =0;

    public static void main(String args[]) throws InterruptedException{


//        Thread thread0 = new Thread(()->{
//
//
//            System.out.println("Thread0's status: "+ Thread.currentThread().isInterrupted());
//
//        }
//        );
//
//        Thread thread1 = new Thread(()->{
//
//            System.out.println("Thread1 is starting");
//            thread0.interrupt();
//            System.out.println("Thread1 is interrupting thread0");
//
//        }
//        );
//
//
//        thread1.start();
//
//        Thread.sleep(1000);
//
//        thread0.start();
//


        Thread thread2 = new Thread(()->{

            while(!Thread.currentThread().isInterrupted()){

                counter++;
            }

            System.out.println("Thread is interrupted "+ Thread.currentThread().isInterrupted());

        });

        thread2.start();

        Thread.sleep(500);
        thread2.interrupt();
        System.out.println("Final result ->" + counter);


    }
}
