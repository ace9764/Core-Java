package core.java.multithread.chapter4.threadExceptionHandler;

public class ThreadExceptionExample {

    public static void main(String args[]){

        try{

            new Thread(()->{

                throw new RuntimeException("Thread Exception Occured!");

            }).start();

        }
        catch(Exception e){

            System.out.println("Error occured");
        }

    }


}
