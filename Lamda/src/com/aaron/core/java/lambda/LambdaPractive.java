package com.aaron.core.java.lambda;

public class LambdaPractive {

    public static void main(String args[]){





//        Object obj = (a,b) -> a > b ? a : b;

//       Object obj =  new Object(){
//            int max(int a, int b){
//
//                return a > b ? a: b;
//            }
//        };

       //int value = obj.max(5,3); Object 클래스에는 max method 가존재하지않는다


//       MyFunction functionA =  new MyFunction(){
//           @Override
//            public int max(int a, int b){ // public is needed here due to overriding rule - 접근제어자는 좁게 못바꾼다
//                return a>b ? a : b;
//            }
//        };

        // ->

        //람다를이용한 익명클래스, 객채 동시 생성
//        MyFunction functionA = (a,b)-> a>b ? a : b;
//
//        System.out.println(functionA.max(1,3));




        LambdaPractive.printInteger(new MyFunction() {
            @Override
            public void max(int a, int b) {
                System.out.println("A is: "+a + " B is: "+ b);
            }
        }, 5, 10);

        LambdaPractive.printInteger(
                (a,b)-> System.out.println("A is: "+a + " B is: "+ b), 5, 10
        );

        //or
//        MyFunction aB = (a, b) -> System.out.println("A is: "+a + " B is: "+ b);
//        MyFunction aBc = (a, b) -> printInteger2(a,b);

//        aB.max(5,10);


        LambdaPractive.printInteger(
                LambdaPractive::printInteger2, 5, 10
        );

        //OR

        MyFunction aBC = LambdaPractive::printInteger2;

        aBC.max(5,10);

    }

    public static void printInteger2( int a, int b){

       System.out.println("A is: "+a + " B is: "+ b);
    }

    public static void printInteger(MyFunction myFunction,int a, int b){
        myFunction.max(a,b);
    }
}

@FunctionalInterface // 단하나의 추상 메소드만 존재가능
interface MyFunction{

// 생략가능, by default it's public and abstract, so not needed  ->  public abstract int max();
//      int max(int a, int b);

//    int max2(int a, int b);

    void max(int a, int b);
}
