package core.java.multithread.chapter2;

public class ThreadJoinExample {

    static int counter = 0;
    public static void main(String args[]){


        Thread mainThread = Thread.currentThread();

        Thread thread0 = new Thread(()->{

//            while(true){
//                try {
//                    Thread.sleep(1000);
//                    counter++;
//                }
//                catch(InterruptedException e){
//                    System.out.println("Thread "+ Thread.currentThread()+" got interrupted!" + e);
//                    mainThread.interrupt();
//                    // or
//                    //break; so that we dont need to interrupt main to wake up from join
//                }
//            }


                //have while inside  of try catch so that we dont need to interrupt main to wake up from join
//                try {
//                    while(true){
//                    Thread.sleep(1000);
//                    counter++;
//                    }
//                }
//                catch(InterruptedException e){
//                    System.out.println("Thread "+ Thread.currentThread()+" got interrupted!" + e);
//                    //mainThread.interrupt();
//
//                }



            //or simply just use for loop

//                try {
//                    for(int i =0; i<10; i++) {
//                        Thread.sleep(1000);
//                        counter++;
//                    }
//                }
//                catch(InterruptedException e){
//                    System.out.println("Thread "+ Thread.currentThread()+" got interrupted!" + e);
//                    //mainThread.interrupt();
//                }


        });

        Thread thread1 = new Thread(()->{

            try {
                System.out.println("Thread "+ Thread.currentThread()+" will interrupt Thread 0 in 3 seconds.");
                Thread.sleep(3000);
                thread0.interrupt();
                System.out.println("Thread "+ Thread.currentThread()+"  interrupted Thread 0.");
            }
            catch(InterruptedException e){
                System.out.println("Thread "+ Thread.currentThread()+" got interrupted!" + e);
            }

        });

        thread0.setDaemon(true);

        thread0.start();
        thread1.start();

        try {
            System.out.println("Main Thread "+ Thread.currentThread()+" wants to join thread1.");
            thread0.join();
            System.out.println("Final result of counter is " + counter);
        }
        catch(InterruptedException e){
            System.out.println("Main Thread "+ Thread.currentThread()+" got interrupted! Terminating a program" + e);
            System.out.println("Still printing a result: Final result of counter is " + counter);
        }

    }



}
