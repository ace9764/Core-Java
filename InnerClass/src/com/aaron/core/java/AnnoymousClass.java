package com.aaron.core.java;

public class AnnoymousClass {

   static void add(Executor t){

        System.out.println("Tester "+ t);
    }

    public static void main(String args[]){


//        Tester t = new Tester();
//
//        t.test();

//        Object t = new Object(){
//            void test(){
//                System.out.println("Tested Successfuly");
//            }
//        };


//       add(new Object(){
//           void test(){
//               System.out.println("Tested Successfuly");
//           }
//       });

        add(new Executor(){
            public void test(){
                System.out.println("Tested Successfuly");
            }
        });

    }

}

//class Tester extends Object{
//
//
//    void test(){
//        System.out.println("Tested Successfuly");
//    }
//
//
//
//}

class Tester implements Executor{

    @Override
    public void test(){
        System.out.println("Tested Successfuly");
    }


}


