package com.aaron.thread.runnable;



public class SynchronizedMonitorDemo {

    int counter =0;

    private Object monitor;

    public Object getMonitor () {

        synchronized (this) {
            for(int i=0; i <1000; i++){
                this.counter++;
                System.out.println("Get Monitor " + this.counter);
            }

        }
        return this.monitor;
    }
    public void setMonitor(Object monitor) {

//        synchronized (this) {
//
//            for(int i=0; i <1000; i++) {
//                this.monitor = i;
//                this.counter++;
//                System.out.println("Set Monitor " + this.counter);
//            }
//        }

            for(int i=0; i <1000; i++) {
                this.monitor = i;
                this.counter++;
                System.out.println("Set Monitor " + this.counter);
            }

    }

    public static void main(String args[]) throws InterruptedException{

        SynchronizedMonitorDemo synchronizedMonitorDemo = new SynchronizedMonitorDemo();

        SynchronizedMonitorDemo synchronizedMonitorDemo2 = new SynchronizedMonitorDemo();

        Thread thread1 = new Thread(new Runnable(){

            @Override
            public void run(){

                    synchronizedMonitorDemo.getMonitor();
//                    synchronizedMonitorDemo.setMonitor(i+"");
            }
        }
        );

        Thread thread2 = new Thread (new Runnable(){

            @Override
            public void run()  {

                try {
//                    thread1.join();

                    int i=0;
                    synchronizedMonitorDemo.setMonitor(i);
                                    }
                catch(Exception e){

                }

            }
        });

        thread1.start();
        thread2.start();


        thread1.join();
        thread2.join();

        System.out.println("Final Counter "+synchronizedMonitorDemo.counter);

//        System.out.println(synchronizedMonitorDemo2.getMonitor());
//
//        System.out.println(synchronizedMonitorDemo2.counter);

    }

}
