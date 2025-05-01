package com.aaron.core.java;

public class ConstantsDemo {

    public static void main(String args[]){
        System.out.println("ConstA "+ innerA.constA);
        System.out.println("ConstB "+ innerB.constB);
    }

    class innerA{

        final static int constA = 500;

    }

    static class innerB{
         static int constB = 500;
    }



}


class InnerDemoB{

    public static void main(String args[]){
        System.out.println("ConstA "+ ConstantsDemo.innerA.constA);
        System.out.println("ConstB "+ ConstantsDemo.innerB.constB);
    }

}
