package core.aaron.java;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TokenizerDemo {

    public static void main(String args[]){

        int index =0;
        String words = "Aaron";

        StringTokenizer stringTokenizer = new StringTokenizer(words, ",");

        List<String> stringList = new ArrayList<String>();

        while (stringTokenizer.hasMoreElements()){
            stringList.add(stringTokenizer.nextToken());
            System.out.println("at " +index+ " "+ stringList.get(index));
            index +=1;
        }

    }
}
