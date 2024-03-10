package com.aaron.core.java;
public class StringBufferDemo1 {

    public static void main(String args[]){

        StringBuilder strBuilder = new StringBuilder();

        //dummy object
        StringBufferDemo1 strDemo = new StringBufferDemo1();

        StringBuffer strBuff1 = new StringBuffer();
        //capacity initally 16 when initialized without parameter

        System.out.println(strBuff1.capacity());

        System.out.println(strBuff1.append("HelloAaronParkisStupid"));

        System.out.println(strBuff1.capacity());

        System.out.println(strBuff1.append("HelloAaronParkisStupidIloveBugerIlovePizza"));

        System.out.println(strBuff1.capacity());
        // (current capacity *2) + 2 = 70

        StringBuffer strBuff2 = new StringBuffer("Hello");
        //capacity 16 + length of string I added when initiziling
        System.out.println(strBuff2.capacity());
        // Capacity = 21

        strBuff2.append("my name is Aaron Park");
        System.out.println(strBuff2.capacity());
        // Capacity = (21 * 2) + 2 = 44


        StringBuffer strBuff3 = new StringBuffer( 10);
        strBuff3.ensureCapacity(15);
        strBuff3.append("Hi my name is Aaron and I want burger");
        // Capacity = Post initial Capacity of 10, it will be length string literal
        System.out.println(strBuff3.capacity());

        strBuff3.append(25.55);
        strBuff3.append(25.55f);
        strBuff3.append('C');
        strBuff3.append(false);

        char [] charArray = {'a','b','c'} ;

        strBuff3.append(charArray);

        strBuff3.append(strDemo);

        System.out.println(strBuff3);

        System.out.println(strBuff3.capacity());

        System.out.println(strBuff3.length() +" Length");
//        System.out.println(strBuff3.charAt(191));
            //throws exception StringIndexOutofBoundsException

        strBuff3.replace(0,4,"");

        System.out.println(strBuff3);

        System.out.println(strBuff3.length() +" Length");

        strBuff3.delete(10,14);

        System.out.println(strBuff3);

        System.out.println(strBuff3.length() +" Length");

        strBuff3.deleteCharAt(10) ;

        System.out.println(strBuff3);

        System.out.println(strBuff3.length() +" Length");

        strBuff3.reverse();

        System.out.println(strBuff3);

        strBuff3.reverse();
        //revert back
        System.out.println(strBuff3);

        //Capacity till now
        System.out.println(strBuff3.capacity());

        strBuff3.trimToSize();

        //Capacity after trim
        System.out.println("After trim to match actual size/length -> " + strBuff3.capacity());


        StringBuffer strBuff4 = new StringBuffer("Manhattan Associates");

        strBuff4.setLength(10);

        System.out.println(strBuff4);

        System.out.println(strBuff4.capacity());


        StringBuffer newBuff1 = new StringBuffer("Hello");

        StringBuffer newBuff2 = new StringBuffer("Hello");

        System.out.println(newBuff1 == newBuff2);

        System.out.println(newBuff1.equals(newBuff2));

        System.out.println(newBuff1.toString().equals(newBuff2.toString()));

        String strObj1 = new String ("hi");
        String strObj2 = new String ("hi");

        System.out.println(strObj1 == strObj2);

        System.out.println(strObj1.equals(strObj2));

    }
}
