package core.java.multithread.chapter4.threadlocal;

public class InheritableThreadLocalExample {

    public static InheritableThreadLocal<String> inheritableThreadLocal =new InheritableThreadLocal<>();

    public static ThreadLocal<String> threadLocal =new ThreadLocal<>();


    public static void main(String args[]){

        inheritableThreadLocal.set("Parent Thread value");

        Thread childThread = new Thread(()->
        {

            System.out.println("Parent Thread's value: " +inheritableThreadLocal.get());

            inheritableThreadLocal.set("Child Thread Value");

            System.out.println("Child Thread's value: " +inheritableThreadLocal.get());



        });

        childThread.start();


        try {
            childThread.join();
        } catch (InterruptedException e) {
            //throw new RuntimeException(e);
        }

        System.out.println("In Main / Parent Thread's value: " +inheritableThreadLocal.get());

    }




}
