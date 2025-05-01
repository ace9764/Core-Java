package com.aaron.core.java;

public class Page implements WebPage {

    public String title;

    public String content;


    public Page(String title, String content){

        this.title =title;
        this.content=content;
    }

    @Override
    public void printInfo(String content) {

        System.out.println("This is default info about this page! ");

    }
}
