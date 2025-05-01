package core.java.multithread.chapter4.threadExceptionHandler;

public class UncaughtExceptionHandler {

    public static void main(String args[]){


        Thread thread0 = new Thread(()->{

            System.out.println("Thread 0 starts!");
            throw new RuntimeException("");

        });

        thread0.setUncaughtExceptionHandler(
                ( (t,e)->{

                    System.out.println( t.getName() +" error occurred with an exception :" + e);

                })
        );

        thread0.start();

        Thread thread1 = new Thread(()->{

            System.out.println("Thread 1 starts!");
            throw new RuntimeException("");

        });

        thread1.setUncaughtExceptionHandler(
                ( (t,e)->{

                    System.out.println(t.getName() +" error occurred with an exception :" + e);

                })
        );

        //thread1.start();

    }
}
