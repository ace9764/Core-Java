package com.aaron.core.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class CustomArrayList<T> implements Iterable<T>{

    private T [] newArray;

    private int size;

    public CustomArrayList(){
        this.newArray = (T[]) new Object [10];
        this.size = 0;
    }

    public void add(T element){

        this.newArray[this.size] = element;
        this.size ++;

    }

    public int size(){

        return this.size;

    }

    public T get(int i){

        return this.newArray[i];
    }

    @Override
    public Iterator<T> iterator(){

        return new CustomIterator(this);
    }

    @Override
    public String toString(){

        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0; i < newArray.length; i++){

            stringBuilder.append(" "+ newArray[i] );
        }

        return stringBuilder.toString();
    }


    private class CustomIterator<T> implements Iterator<T>{

        private CustomArrayList<T> customList;

        private int index = 0 ;



        public CustomIterator(CustomArrayList<T> customList){

            this.customList = customList;

        }

        @Override
        public boolean hasNext() {

            System.out.println("has element index of " + this.index);

            if(customList.size() - index > 0) {

                System.out.println("true");
                return true;
            }

            return false;
        }

        @Override
        public T next() {

            System.out.println("Next -> ");
            return customList.get(index++);
        }

        @Override
        public void remove() {
            Iterator.super.remove();
        }

        @Override
        public void forEachRemaining(Consumer<? super T> action) {
            Iterator.super.forEachRemaining(action);
        }
    }

    public static void main(String args[]){

        CustomArrayList<Object> customArrayList = new CustomArrayList<>();

        customArrayList.add("5");
        customArrayList.add(5.0);
        customArrayList.add(new Object());



        HashMap<String,String> newMap = new HashMap<>();

        newMap.put("test", "value");

        customArrayList.add(newMap);

        customArrayList.add(customArrayList);

        List<Object>  newList = new ArrayList<>();


//        Iterator customIterator = customArrayList.iterator();
//
//        while(customIterator.hasNext()){
//
//            System.out.println("Current Element "+ customIterator.next());
//        }

        for(Object object : customArrayList){
            System.out.println("Object "+object);
        }


    }



}
