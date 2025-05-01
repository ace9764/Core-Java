package core.java.multithread.chapter1;

import java.util.ArrayList;
import java.util.List;

public class ParellelismExample {

    public static void main(String args[]){

        //Parellel
        int cpuCores = Runtime.getRuntime().availableProcessors();

        //Concurrent
        //int cpuCores = Runtime.getRuntime().availableProcessors() * 2;
        //int cpuCores = 9;


        List<Integer> data= new ArrayList<>();

        for (int i=0; i < cpuCores; i++){
            data.add(i);
        }

        //System.out.println(cpuCores);

        long startTime = System.currentTimeMillis();

        long sum1 =  data.parallelStream().mapToLong(

                i->{

            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }

            return i*i;
        }).sum();

        long endTime = System.currentTimeMillis();

        System.out.println("Time it took to process data parellely: " +    (endTime - startTime)+ "ms");
        System.out.println("Result : " +  sum1);


    }

}
