package com.aaron.core.java;

import java.util.*;

public class Main {
    public static int romanToInt(String s) {

        Map<String,Integer> romanMap = new HashMap<>();

        romanMap.put("I", 1);
        romanMap.put("V",5);
        romanMap.put("X",10);
        romanMap.put("L",50);
        romanMap.put("C",100);
        romanMap.put("D",500);
        romanMap.put("M",1000);

        int x = 0;

        for(int i=0; i < s.length(); i++){

            if(romanMap.get(s.charAt(i)) == 1 ){

                if( i+1 < s.length() && (romanMap.get(s.charAt(i+1)) == 10 || romanMap.get(s.charAt(i+1)) == 5) ){

                    x -=1;
                }
                else{
                    x += 1;
                }

            }
            else if(romanMap.get(s.charAt(i)) == 5){

                x+= 5;
            }

            else if(romanMap.get(s.charAt(i)) == 10){


                if(i+1 <s.length() && (romanMap.get(s.charAt(i+1)) == 50 || romanMap.get(s.charAt(i+1)) ==100) ){

                    x -= 10;
                }else{
                    x+=10;
                }
            }

            else if(romanMap.get(s.charAt(i)) == 50){

                x+= 50;
            }

            else if(romanMap.get(s.charAt(i)) ==100){

                if(i+1 <s.length() && (romanMap.get(s.charAt(i+1)) == 500 || romanMap.get(s.charAt(i+1)) == 1000) )          {
                    x -= 100;
                }else{
                    x += 100;
                }
            }

            else if(romanMap.get(s.charAt(i)) == 500){

                x+= 500;
            }

            else if(romanMap.get(s.charAt(i)) == 1000){

                x+= 1000;
            }


        }



        return x;


    }

    public static void main(String args[]){

        String x = "Hello";

        Map<String,Integer> romanMap = new HashMap<>();

        romanMap.put("I", 1);
        romanMap.put("V",5);
        romanMap.put("X",10);
        romanMap.put("L",50);
        romanMap.put("C",100);
        romanMap.put("D",500);
        romanMap.put("M",1000);

        char ix = 'I';
        System.out.println(romanMap.get(ix));


        PlayListCreator playListCreator = new PlayListCreator();

        ArrayList<Song> listOfSongs = new ArrayList<>();



        Iterator i = listOfSongs.iterator();

        listOfSongs.add(new Song("Sad Song",90,"Aaron"));

        listOfSongs.add(new Song("Good Song",210,"Ben"));

        listOfSongs.add(new Song("Fresh Song",210,"Cam"));

        LinkedList<Song> playList = playListCreator.returnNewPlayList(listOfSongs);

        playList.add(new Song("Stupid Song",210,"시연이"));


        playListCreator.printPlayList( playList);

        playListCreator.printPlayListInReverse(playList);

//        List<String> list = Arrays.asList("zero", "one", "two");
//
//        ListIterator<String> iter = list.listIterator();
//
//        while (iter.hasNext()) {
//            System.out.println("index: " + iter.nextIndex() + " value: " + iter.next());
//        }



    }
}
