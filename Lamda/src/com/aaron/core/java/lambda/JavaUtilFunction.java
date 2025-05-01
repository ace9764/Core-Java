package com.aaron.core.java.lambda;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JavaUtilFunction {


    static TreeSet<String> treeSet = new TreeSet<>();

    public static void main(String args[]){

        new JavaUtilFunction().placeOrder (5, "Aaron");
    }

    public void placeOrder(int noOfOrders, String customerName){

        for(int i = 0; i < noOfOrders; i++){

            String s = returnSupplier().get();

            if(returnPredicate().test(s)) {
                returnConsumer().accept(s);
                returnFunction().apply(s);
            }
            else{
                System.out.println("We do not have such food "+ s+" on the menu. Please order something else on menu! ");
            }
        }

        System.out.println( customerName + "'s Final Order list: " + JavaUtilFunction.treeSet);

    }
    public Supplier<String> returnSupplier(){

        int number = new Random().nextInt(3);

        Supplier<String> supplierFunction = () -> FoodConstants.menuList.get(number) ;

        return supplierFunction;
    }

    public Consumer<String> returnConsumer(){

        Consumer<String> consumerFunction = s -> System.out.println("Food ordered is: "+ s ) ;

        return consumerFunction;
    }

    public Predicate<String> returnPredicate(){

        Predicate<String> predicateFunction = s ->  FoodConstants.menuList.contains(s);

        return predicateFunction;
    }

    public Function<String,Boolean> returnFunction(){

        Function<String,Boolean> returnFunction= s ->  JavaUtilFunction.treeSet.add(s)  ;

        return returnFunction;

    }


}


class FoodConstants{

    static final List<String> menuList = new ArrayList<>(Arrays.asList(new String[]{"Burger","Pizza","Taco"})) ;



}
