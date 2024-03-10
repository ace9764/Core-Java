package com.indy.threads.synchonizeddemo.sync;

public class StaticSynchronizationDmeo {
    public static Object obj = null;

    public static int counter = 0;
//	only 1 thread can call any one of these methods

    public static void setObject(Object o) {
        // static synchronized methods can only use this class as monitor as these methods belong
        // to this class --> static belongs to class not to any instance variables

        for (int i = 0; i < 1000; i++) {
            counter = i;
            System.out.println("Setter Counter "+ counter);
        }
        obj = o;
    }

    public static synchronized Object getObject() {

        for (int i = 0; i < 1000; i++) {
            counter = i;
            System.out.println("Getter Counter "+ counter);
        }
        return obj;
    }

//    public static void setObj(Object o) {
//        synchronized (StaticSynchronizationDmeo.class) {
//            obj = o;
//        }
//
//    }
//
//    public static Object getObj() {
//        // synchronized blocks can use any java object
//        synchronized (StaticSynchronizationDmeo.class) {
//            return obj;
//        }
//    }

    public static void main(String[] args) throws Exception{

        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                    StaticSynchronizationDmeo.setObject(0);
            }
        });

        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                    System.out.println(StaticSynchronizationDmeo.getObject());
            }
        });

        t1.join();
        t2.join();

        t1.start();
        t2.start();
    }
}
