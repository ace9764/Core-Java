package com.aaron.core.java;

public class StringDemo {

    public static void main (String ars[]){

        String c = "Hi";



//     final   String s = new String("Aaron");
        String s ="Aaron";
        final  String s10 ="Stupid";
        String s2 = s +"Park";
        System.out.println("hash S2 ->" + s2.hashCode());
//

        String s3 = "Aaron" + "Park";
        System.out.println("hash S3 ->" + s3.hashCode());
        System.out.println(s2==s3);
        String s4 = s.concat("Park");
        System.out.println(s2==s4);

        String s5 = "AaronPark";
        System.out.println(s3==s5);

        String s6 = s.concat("Park");

        System.out.println(s4==s6);

      //  s = new String("Aaron");

        String s8 = "Park";
        //s -->resolved to a string
      //  s += s8;

        System.out.println(s);

        s3 = s3 +"Seungbin";
        s4 += "Stupid" +s3;



//        String c = new String ("OneStar");
//
//       String c = "onestar";
//
//
//       String c1 = c.toUpperCase();
//       String c2 = c.toLowerCase();
//       String c3 = c.toString();
//
//       System.out.println(c == c1);
//       System.out.println(c == c2);
//       System.out.println(c == c3);


        String test = " ";

        if(test != null) {
            System.out.println("null is not equal to length empty string, length: "+ test.length());
        }

    }


}
