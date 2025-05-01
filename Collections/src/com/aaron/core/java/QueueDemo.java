package com.aaron.core.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueDemo {

    public static void main (String args[]){


        Queue<String> lines = new LinkedList<>();

        lines.add("Aaron");
        lines.add("HongSun");
        lines.add("Jaeyoung");

        showQueueStatus(lines);

    }


    public static void showQueueStatus(Queue<String> lines){

        try {
            int initialSize = lines.size();
            for (int i = 0; i < initialSize; i++) {

                int lineNumber = i + 1;
                System.out.println("Line No. " + lineNumber + " " + lines.poll());
            }
        }
        catch(NoSuchElementException e){

            System.out.println("Error Occured during fetching a data: "+e);
            System.out.println("Stack Trace: "+e.getStackTrace());
        }

    }
}
