package core.java.multithread.chapter1;

public class ContextSwitchDemo {

    public static void main(String args[]){

        performContextSwitch();

    }

    public static void performContextSwitch(){

        Thread thread1 = new Thread(()-> {

            for(int i=0; i<2; i++) {
                System.out.println("Thread 1: "+ i);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });

        Thread thread2 = new Thread(()-> {

            for(int i=0; i<2; i++) {
                System.out.println("Thread 2: "+ i);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });

        Thread thread3 = new Thread(()-> {

            for(int i=0; i<2; i++) {
                System.out.println("Thread 3: "+ i);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });

        thread1.start();
        thread2.start();
        thread3.start();

    }


}
