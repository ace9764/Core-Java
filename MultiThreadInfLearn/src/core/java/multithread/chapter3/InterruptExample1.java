package core.java.multithread.chapter3;

public class InterruptExample1 {

    public static void main(String args[]) {


        Thread thread = new Thread(()->{

            while(!Thread.interrupted()){
                System.out.println("스레드 작동중");
            }

            System.out.println("스레드 인터럽트됨");
            System.out.println("Thread interruption status: "+Thread.currentThread().isInterrupted());

            Thread.currentThread().interrupt();
            System.out.println("Thread interruption status after reset: "+Thread.currentThread().isInterrupted());


        });

        thread.start();

        try {
            Thread.sleep(300);
        }
        catch(Exception e){

        }

        thread.interrupt();


    }

}
