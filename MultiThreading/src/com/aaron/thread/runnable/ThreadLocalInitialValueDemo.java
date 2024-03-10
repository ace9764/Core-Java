package com.aaron.thread.runnable;

class Animal{

}
public class ThreadLocalInitialValueDemo {

    public static void main(String argument[]){

        ThreadLocal<Animal> threadLocal1 = new ThreadLocal<Animal>(){
            @Override
            protected Animal initialValue(){

                return new Animal();
            }
        };

        ThreadLocal<Animal> threadLocal2 = ThreadLocal.withInitial(()->{
            return new Animal();
        });

        Thread thread1 = new Thread(()->{

           System.out.println("Parent Thread1 Overriden Method :"+ threadLocal1.get()) ;
           System.out.println("Parent Thread1 Static Method :"+threadLocal2.get()) ;

             Thread thread1Child1 = new Thread(()->
             {

                 System.out.println("Child Thread1 Overriden Method :"+threadLocal1.get()) ;
                 System.out.println("Child Thread1 Static Method :"+threadLocal2.get()) ;

             });

            thread1Child1.start();
        });

        Thread thread2 = new Thread(()->{


            System.out.println("Parent Thread2 Overriden Method :"+threadLocal1.get()) ;
            System.out.println("Parent Thread2 Static Method :"+threadLocal2.get()) ;

        });


        thread1.start();
        thread2.start();



    }
}
