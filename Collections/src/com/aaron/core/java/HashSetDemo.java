package com.aaron.core.java;


import java.util.*;

public class HashSetDemo {


    public static void main(String args[]){

//        List<String> stringList = new ArrayList<>();
//
//        stringList.add("Aaron");
//
//        stringList.add("David");
//
//        stringList.add("John");
//
//        System.out.println("people list : " + stringList);

//        String s ="Aaron";
//
//        String s1 = "Park";
//
//        String s2 = s+ "park";
//
//        String s3 = "Aaron Park";
//
//        s2.equals(s3);

//        HashSet<Page> set1 = new HashSet<>();
//
//        HashSet<Page> set2 = new HashSet<>();
//
//        set1.add(new Page("Aaron","Aaron"));
//
//        set2.add(new Page("Aaron","Aaron"));
//
//        System.out.println( set1.equals(set2)  );


        Map<String,String> stringMap =new HashMap<>();

        stringMap.put("Name","Aaron");

        for(Map.Entry<String, String> e : stringMap.entrySet()) {
            String key = e.getKey();
            String value = e.getValue();
        }



        HashSet<Song> aaronPlaySet = new HashSet<>();

        aaronPlaySet.add(new Song("살다가", 180, "SG Wannabe"));

        //aaronPlaySet.add(new Song("살다가", 180, "SG Wannabe"));

        aaronPlaySet.add(new Song("Play Again", 180, "Luke Bryan"));


        System.out.println("Aaron's playlist: " + aaronPlaySet);


        HashSet<Song> davidPlaySet = new HashSet<>();

        davidPlaySet.add(new Song("큰일이다", 180, "VOS"));

        davidPlaySet.add(new Song("이별하러가는길", 180, "임한별"));


        //Add all
        HashSet<Song> totalList = new HashSet<>();

        Iterator<Song> it = aaronPlaySet.iterator();
        while(it.hasNext()){

            totalList.add(it.next());
        }

        it = davidPlaySet.iterator();
        while(it.hasNext()){
            totalList.add(it.next());
        }

        System.out.println("Add All: " +totalList );


        List<Song> listSong1 = new LinkedList<>(davidPlaySet);


        //PlayListCreator<Song> playListCreator = new PlayListCreator<>();

        //playListCreator.returnNewPlayList(new LinkedList(aaronPlaySet));

//        List<Song> aaronPlayList = new LinkedList<>(aaronPlaySet);

        //Collections.sort(aaronPlayList);

//        System.out.println("Aaron's playlist: " +  aaronPlayList);

    }

}
