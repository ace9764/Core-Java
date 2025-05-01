package core.java.multithread.chapter5.singlemultithread;

public class SingleThreadPractice {

    public static void main(String args[]){



        new Thread(()->{

            long start = System.currentTimeMillis();

            for(int i = 0 ; i < 10 ; i++){

                try {
                    System.out.println("Calculation in process");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

            long end = System.currentTimeMillis();

            System.out.println("Time it took to complete thread process in ms " +  (end- start));

        }).start();




    }

}
