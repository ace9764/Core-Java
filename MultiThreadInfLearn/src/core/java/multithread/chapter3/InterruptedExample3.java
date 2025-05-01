package core.java.multithread.chapter3;

public class InterruptedExample3 {

    static int noOfFood;

    public static void main(String args[]) {

        //        Thread thread2 = new Thread(
//
//                new Runnable()
//                {
//                    @Override
//                    public void run() {
//
//                    }
//                }
//
//        );


        Thread thread0 = new Thread(
                ()->{

              while(!Thread.interrupted()){

                  try{
                      Thread.sleep(1000);
                      noOfFood++;
                      System.out.println("Chef1 succesfully cooked one order");
                  }
                  catch(InterruptedException e){
                      System.out.println("\n Chef 1's end shift reached. "+ e);
                      System.out.println("Chef thread interruption status: " +Thread.currentThread().isInterrupted());
                      Thread.currentThread().interrupt();
                      System.out.println("Chef thread interruption status after reset: " +Thread.currentThread().isInterrupted());
                  }



                  //System.out.println("No Of Food cooked "+ noOfFood);

              }


        });




        Thread thread1 = new Thread(()->{

            System.out.println("Chef2 awaiting for chef1's shift end. ");

            while(true){

                try {

                    Thread.sleep(5000);
                    thread0.interrupt();

                }catch(InterruptedException e){

                }


                if(thread0.isInterrupted()){

                    try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){

                }
                    System.out.println("Finally Chef 2's shift starts!");
                    break;
                }

            }


        });


        thread0.start();
        thread1.start();

        try {
            Thread.sleep(5000);
        }
        catch(Exception e){

        }

        thread0.interrupt();

        try {
            thread0.join();

            System.out.println("\nTotal no of food cooked by chef1:  "+ noOfFood );

            //System.out.println("Chef1 status : "+ thread0.isInterrupted());

            thread1.join();
        }
        catch(InterruptedException e){
            System.out.println("Error occured while joining chef1 and chef2 thread.");
        }





    }

}
