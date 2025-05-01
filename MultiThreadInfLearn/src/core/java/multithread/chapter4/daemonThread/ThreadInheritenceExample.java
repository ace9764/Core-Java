package core.java.multithread.chapter4.daemonThread;

public class ThreadInheritenceExample {

    public static void main(String args[]){

        showInheritance();

    }

    public static void showInheritance(){

        Thread daemonThread = new Thread(()->{

            System.out.println("Daemon Parent Thread has started. Is Daemon Parent Thread Daemon? "+ Thread.currentThread().isDaemon());
                try {

                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                   System.out.println("Exception occured: "+ e);
                }


            new Thread(()->{
                System.out.println("Daemon child Thread has started. Is Daemon child Thread Daemon? "+ Thread.currentThread().isDaemon());

                while(true){

                    try {
                        System.out.println("Daemon Child Thread executing until user threads are terminating.");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Exception occured: "+ e);
                    }



                }

            }).start();

        });


        Thread userThread = new Thread(()->{

            System.out.println("User Parent Thread has started. Is User Parent Thread Daemon? "+ Thread.currentThread().isDaemon());
            try {

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Exception occured: "+ e);
            }

            new Thread(()->{
                System.out.println("User child Thread has started. Is User child Thread Daemon? "+ Thread.currentThread().isDaemon());

                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        System.out.println("Exception occured: "+ e);
                    }

                    System.out.println("Child User Thread terminating.....");




            }).start();

        });

        daemonThread.setDaemon(true);

        daemonThread.start();
        userThread.start();


    }

}
