package core.java.multithread.chapter4.threadlocal;

public class ThreadLocalExample {

//    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    //with inital value
private static ThreadLocal<String> threadLocal = ThreadLocal.withInitial(()->"Default Value");

    public static void main(String args[]){

        new Thread(()->{

            System.out.println("Thread 1 Local's value: "+ threadLocal.get());
            threadLocal.set("Thread 1's local vlue");
            System.out.println("Thread 1 Local's value after set: "+ threadLocal.get());
            threadLocal.remove();
            System.out.println("Thread 1 Local's value after remove: "+ threadLocal.get());

        },"Thread1").start();

        new Thread(()->{

            System.out.println("Thread 2 Local's value: "+ threadLocal.get());
            threadLocal.set("Thread 2's local vlue");
            System.out.println("Thread 2 Local's value: "+ threadLocal.get());

        },"Thread2").start();


    }

}
