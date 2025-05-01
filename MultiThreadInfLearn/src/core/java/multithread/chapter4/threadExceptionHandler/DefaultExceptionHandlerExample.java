package core.java.multithread.chapter4.threadExceptionHandler;

public class DefaultExceptionHandlerExample {

    public static void main(String args[]){

        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){

            @Override
            public void uncaughtException(Thread t, Throwable e){

                System.out.println(t.getName() + " 에서 예외발생 " + e  );
            }
        });

        new Thread(()->{

            throw new RuntimeException("Thread 0 Exception Occured!");

        }).start();

        new Thread(()->{

            throw new RuntimeException("Thread 1 Exception Occured!");

        }).start();

    }

}
