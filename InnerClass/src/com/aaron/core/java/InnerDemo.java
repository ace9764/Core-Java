package com.aaron.core.java;


import java.util.*;

class A{ /// A 는 B의 외부클래스

    //static int x = 5;
    int i = 100;


    class B{ // B 는 A의 내부클래스

        int x = 30;

        int i = 100;
        void method(){ //이 B를 A에서만 쓴다는가정이라면, class A에 넣는게 효율적

            int i = 300;
//            A a = new A();
//            System.out.println("A's i: " + a.i);

            System.out.println("B's local i: "  + i) ;
            System.out.println("B's i: "  + this.i) ;
            System.out.println("A's i: "  + A.this.i) ;
        }
    }


}

//class B{
//    void method(){
//
//        A a = new A();
//        System.out.println("A's i: " + a.i);
//    }
//}

class C{

//    B b = new B();
}
public class InnerDemo {

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map <String, List<String> > stringMap = new HashMap<>();

        for(String s: strs){

            int[] intArray = new int[26];

            for(char a : s.toCharArray()){
                intArray[ a - 'a' ]++;
            }

            stringMap.putIfAbsent(Arrays.toString(intArray), new ArrayList<String>());

            stringMap.get(Arrays.toString(intArray)).add(s);

        }

        System.out.println(stringMap);

        return new ArrayList<>(stringMap.values());

    }

    public static void main(String args[]){


        String [] sxArray = new String[]{"act","pots","tops","cat","stop","hat"};

        System.out.println(groupAnagrams(sxArray));


        //ArrayList<Integer> i = new ArrayList<Integer>();

        Set<Integer> x = new HashSet<Integer>();

        String s ="Hello";

        char sArray [] = s.toCharArray();


        Arrays.sort(sArray);

        int [] nums = new int[2];

        nums[0] = 6;
        nums[1] = 4;

        //List<Integer> numsList = Arrays.asList(nums);


        int[] count = new int[26];

        System.out.println('H' - 'a');

        for (char c : s.toCharArray()) {

            count[2]++;
        }

        System.out.println("count "+ Arrays.asList(count));


        Arrays.sort(nums);

        System.out.println(Arrays.asList(nums));

//        A.B c = new A().new B();

        A a = new A();

        //이런식으로 가능 ->
        A.B b = a.new B();

        b.method();

        
    }


}
