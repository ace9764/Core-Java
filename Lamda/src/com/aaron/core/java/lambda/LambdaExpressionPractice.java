package com.aaron.core.java.lambda;

interface MyFunction2{

    void run();

}
public class LambdaExpressionPractice {

    static void execute(MyFunction2 f4){

        f4.run();
    }

    static MyFunction2 getMyFunction(){

        MyFunction2 f3 = () -> System.out.println("F3.run()");

        return f3;
    }


    public static void main(String args[]){

        //램다를 이용한 함수형인터페이스 구현
        MyFunction2 f1 = () -> System.out.println("F1.run()");

        //우리가아는익명클래스를 이용한 함수형인터페이스 구현
        MyFunction2 f2 = new MyFunction2() {
            @Override
            public void run() {
                System.out.println("F2.run()");
            }
        };


        f1.run();
        f2.run();

        //f3 리턴타입이 MyFunction 인 method
        getMyFunction().run();

        //f4 매개변수의 타입이 MyFunction 인 method
        MyFunction2 f4 = () -> System.out.println("F4.run()");
        execute(f4);

    }

}

