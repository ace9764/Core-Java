package com.aaron.core.java;
import java.util.regex.Pattern;

public class StringMethods {

    public static void hashCode(String value) {
        int h = 0;
        int hash=0;

        if (h == 0 && value.length() > 0) {
            char val[] = value.toCharArray();

            for (int i = 0; i < value.length(); i++) {
                h = 31 * h + val[i];
                System.out.println(0+val[i]);
                System.out.println(h);
            }
            System.out.println(h);
            hash = h;

        }
    }

    public static void main (String args[]){

        String x = "word";

               x = "hello";

//        String c ="Aaron Park";
//
//        String b ="Park Aaron";
//
//
//        System.out.println(c.hashCode());
//
//        System.out.println(b.hashCode());

        String v = new String("hello");

        String p = new String("olleh");

        hashCode(v);

        System.out.println(v.hashCode());

        hashCode(p);

        System.out.println(p.hashCode());


        String s = "Manhattan";

        String s2 ;

//        String [] strArray = s2.split(",");

//      System.out.println(strArray.length);

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.substring(s.length()-3));
        System.out.println(s.indexOf("a"));
        System.out.println(s.lastIndexOf("a"));
        System.out.println(s.indexOf("x"));
        System.out.println(s.replaceFirst("a","v"));
        System.out.println(s.replaceAll("a","v"));
        System.out.println(s.matches("[a-z]"));
        System.out.println(s.contains("z"));
        System.out.println(s.concat(" Associates"));
        System.out.println(s.startsWith("Man"));
        System.out.println(s.endsWith("ites"));



    }


}
