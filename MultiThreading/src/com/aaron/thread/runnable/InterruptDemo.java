package com.aaron.thread.runnable;

class MyRunnableSeven implements Runnable {

    private Thread thread;

    public void setThread(Thread thread){
        this.thread = thread;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("running" + Thread.currentThread().getName() + ":" + (i + 1) + " "
                        + Thread.currentThread().getPriority());
                    Thread.sleep(2000);
                    this.thread.interrupt();

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class InterruptDemo {

    public static void main(String args[]){

        MyRunnableSeven mr1 = new MyRunnableSeven();

        Thread thread1 = new Thread(mr1,"Aaron");

        mr1.setThread(thread1);

        thread1.start();

        System.out.println("End of main method");
    }
}
