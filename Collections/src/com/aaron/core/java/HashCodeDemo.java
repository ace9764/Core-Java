package com.aaron.core.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeDemo {

    public static void main(String[] args) {
        Map<DataKey, Integer> hm = getAllData();
        DataKey dk = new DataKey();
        dk.setId(1);
        dk.setName("Pankaj");
        System.out.println("HashCode generation based on object when we fetch it: "+ dk.hashCode());
        Integer value = hm.get(dk);
        System.out.println("When we try to fetch with reference variable with same object data type: "+ value);

        System.out.println(hm);

        hm.put(dk,15);

        System.out.println("When we try to put, this happens: "+ hm);
    }
    private static Map<DataKey, Integer> getAllData() {
        Map<DataKey, Integer> hm = new HashMap<>();
        DataKey dk = new DataKey();
        dk.setId(1);
        dk.setName("Pankaj");
        System.out.println("HashCode generation based on object when we set it: "+ dk.hashCode());
        hm.put(dk, 10);
        return hm;
    }



}


 class DataKey {

    private String name;
    private int id;

    // getter and setter methods


     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         DataKey dataKey = (DataKey) o;
         return id == dataKey.id && Objects.equals(name, dataKey.name);
     }

     @Override
     public int hashCode() {
         return Objects.hash(name, id);
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     @Override
    public String toString() {
        return " [name=" + name + ", id=" + id + "]";
    }

}