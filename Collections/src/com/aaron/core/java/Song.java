package com.aaron.core.java;

import java.util.Comparator;
import java.util.Objects;

public class Song {

    public String title;
    public String duration;

    public String artist;

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration='" + duration + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object a) {

        if (!(a instanceof Song)){

            return false;
        }

        Song songObject = (Song) a;

        return this.duration.equals(songObject.duration)  && this.title.equals(songObject.title) && this.artist.equals(songObject.artist);
    }

    @Override
    public int hashCode(){

        return Objects.hash(this.title,this.artist,this.duration);
    }



    public Song(){

        this.title = "No Tile";

        this.duration = "90";

        this.artist = "Aaron";
    }

    public Song(String title, int duration, String artist){

        this.title = title;

        this.duration = convertSecToDuration(duration);

        this.artist = artist;
    }


    public String convertSecToDuration(int seconds){

        int input = 500000;
        int numberOfDays;
        int numberOfHours;
        int numberOfMinutes;
        int numberOfSeconds;

        numberOfMinutes = ((input % 86400) % 3600) / 60;
        numberOfSeconds = ((input % 86400) % 3600) % 60;

        return numberOfMinutes + ":" + numberOfSeconds ;
    }


}
