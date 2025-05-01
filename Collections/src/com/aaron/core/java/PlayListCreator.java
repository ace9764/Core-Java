package com.aaron.core.java;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class PlayListCreator<E extends Song> {


    public Boolean addSong(LinkedList<Song> e,Song song){

        if(e!=null && song != null && !e.contains(song) && e.add(song)){
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean addSong(LinkedList<Song> e,Song song, int index){

        if(e!=null && song != null && !e.contains(song) && e.size() > index ){

            e.add(index, song);
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean removeSong(LinkedList<Song> e,Song song){

        if(e!=null && song != null && e.contains(song) && e.remove(song)){
            return true;
        }
        else {
            return false;
        }
    }

    public LinkedList<E> returnNewPlayList(List<E> listOfSongs){

       LinkedList<E> newPlayList = new LinkedList<>();

       for(E song: listOfSongs){

           if(song != null){
               newPlayList.add(song);
           }
       }

       return newPlayList;
    }

    public void printPlayList(LinkedList<E> playList){

        ListIterator<E> playListIterator = playList.listIterator();

        while(playListIterator.hasNext()){

            E currentNode = playListIterator.next();
            System.out.println("Current Song is "+ playList.indexOf(currentNode) + " th" + " song in the playlist, Song name is "+ currentNode.title );
        }

    }

    public void printPlayListInReverse(LinkedList<E> playList){

        ListIterator<E> playListIterator = playList.listIterator(playList.size());

        while(playListIterator.hasPrevious()){

            E currentNode = playListIterator.previous();
            System.out.println("Current Song is "+ playList.indexOf(currentNode) + " th" + " song in the playlist, Song name is "+ currentNode.title );
        }

    }

//    public void printPlayListInReverse(LinkedList<E> playList){
//
//
//
//    }





}
