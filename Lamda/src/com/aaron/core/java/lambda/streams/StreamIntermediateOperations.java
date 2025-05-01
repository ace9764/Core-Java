package com.aaron.core.java.lambda.streams;


import java.util.*;
import java.util.stream.Stream;


public class StreamIntermediateOperations<E> {

        public static void main(String args[]){


            StreamIntermediateOperations streamIntermediateOperations  = new StreamIntermediateOperations<>();

            //#Skip and Limit
            List<String> stringList1 = Arrays.asList("Hello", "안녕");

            Stream<String> streamStream1 = streamIntermediateOperations.limitStream(streamIntermediateOperations.skipStream(streamIntermediateOperations.returnStream(stringList1)))    ;

//            streamStream1.forEach(System.out::println);


            //#distinct
            List<Integer> stringList2 = Arrays.asList(1,1,2,2,3,4,5,5,5,5);
            Stream<Integer> streamStream2 =  streamIntermediateOperations.returnStream(stringList2);

            //Stream streamStream2 =  streamIntermediateOperations.returnStream(stringList2);

//            streamIntermediateOperations.distinctStream(streamStream2).forEach(System.out::println);

            //#filter
            //streamStream2 = streamIntermediateOperations.returnStream(stringList2);
//            streamIntermediateOperations.filterStream(streamStream2).forEach(System.out::println);




            //#Sort

            //#1 basic Reference type Integer
            List<Integer> stringList3 = Arrays.asList(4,3,5,12,2);

            streamStream2 = streamIntermediateOperations.returnStream(stringList3);

//            streamIntermediateOperations.basicSort(streamStream2).forEach(System.out::println);

            //#2 Custom reference type Food
            List<Food> foodList = Arrays.asList(new Food(1000,"Taco", "Mexican",6.0),new Food(500,"Fried Chicken", "American",6.0),new Food(300,"Sushi", "Janese",8.0) ,new Food());

            //여기서 streamStream2 를다시 쓰면 에러가발생한다, streamStream2 가 Stream<Integer>로 generic type을 define 했기 때문에 하지만 여기서 처음에
            // Stream 하고 generic type 을 define 안한다면?  Stream streamStream2 =  streamIntermediateOperations.returnStream(stringList2);
            // 그러면에러가 뜨지는 않지만, 좋은방법이아닐수 있다

            //streamStream2 = streamIntermediateOperations.returnStream(foodList); <- streamStream2 가 egeneric type 을 define 안햇다면 가능

            Stream<Food> foodStream = streamIntermediateOperations.returnStream(foodList);

            //정렬전에
            //foodStream.forEach(System.out::println);

            //Food class 안에 define 된 compareTo 기본정렬에의한 정렬 through sort without any paramter ->
            //streamIntermediateOperations.basicSort(foodStream).forEach(System.out::println);

            //익명객채를 이용한
            //streamIntermediateOperations.sortWithAnonymousClass(foodStream).forEach(System.out::println);

            //기본람다를 이용한
            //streamIntermediateOperations.sortWithLambda(foodStream).forEach(System.out::println);

            //Method Reference 를 이용한
            //streamIntermediateOperations.sortWithMethodReference(foodStream).forEach(System.out::println);

            //Food class 안에 define 된 compareTo 기본정렬에의한 정렬 through naturalOrder method->
            //streamIntermediateOperations.basicSortNaturalOrder(foodStream).forEach(System.out::println);

            //Food class 안에 define 된 compareTo 기본정렬에의한 정렬 through naturalOrder method Reversed->
            //streamIntermediateOperations.basicSortNaturalOrderReversed(foodStream).forEach(System.out::println);

            //Comparing 메소드를 이용한
            //streamIntermediateOperations.sortWithComparing(foodStream).forEach(System.out::println);

            //ComparingThen 메소드를 이용한
            //streamIntermediateOperations.sortWithThenComparing(foodStream).forEach(System.out::println);

            //ComparingThenReversed Price reversed 메소드를 이용한
            //streamIntermediateOperations.sortWithThenComparingPriceReversed(foodStream).forEach(System.out::println);

            //ComparingThenReversed Calorie reversed 메소드를 이용한
            //streamIntermediateOperations.sortWithThenComparingCalorieReversed(foodStream).forEach(System.out::println);


            //Comparator 를 구현한 객체는? Comparator 조차도안된다 무조건 Comparable (기본정렬)
            //List<Order> orderList = Arrays.asList(new Order("Burger", 10),  new Order("Pizza", 8));
            //orderList.stream().sorted().forEach(System.out::println);


           // #peek, map, flatmap


            //Customer [] customerArray = new Customer[] {new Customer("Aaron", new Order("Taco",15))};

            //Customer[][]  customerArrayArray = new Customer[][] { customerArray };


            Customer[] store1Customers = new Customer[] {new Customer("Aaron", new Order("Taco",15)), new Customer("Jake",new Order("Pizza", 20))};

            Customer[] store2Customers = new Customer[] {new Customer("David", new Order("Burger",8)), new Customer("Sean",new Order("Hot Dog", 11))};

            Customer[] store3Customers = new Customer[] {new Customer("Tammy", new Order("Ramen",9)), new Customer("Justin",new Order("Paster", 30))};


            List<Customer[]> customerArrayStoreList = Arrays.asList(store1Customers, store2Customers, store3Customers );

            Stream<Customer[]> customerArrayStoreListStream = streamIntermediateOperations.returnStream(customerArrayStoreList);

            //Order 에 comparable을 구현 안했기에, 기본 sorted 를쓰면 에러가뜬다 (class cast exception)
            customerArrayStoreListStream.flatMap(Arrays::stream).sorted(Comparator.<Customer,String>comparing(Customer::getName)).peek(System.out::println).map(Customer::getOrder).peek(System.out::println).sorted(Comparator.<Order,Integer>comparing(Order::getPrice)).forEach(System.out::println);


        }


    public<E> Stream<E> returnStream(List<E> list){

        return list.stream();
    }

    public Stream skipStream(Stream stream){

        return stream.skip(1);
    }

    public Stream limitStream(Stream stream){

        return stream.limit(2);
    }


    public Stream<Integer> filterStream(Stream<Integer> stream){

        return stream.filter(i -> i % 2 != 0);
    }

    public Stream distinctStream(Stream stream){

        return stream.distinct();
    }

    public Stream basicSort(Stream stream){

        return stream.sorted();
    }

    public Stream<Food> sortWithAnonymousClass (Stream<Food> stream){

            return stream.sorted(new Comparator<Food>() {
                @Override
                public int compare(Food o1, Food o2) {

                    return o1.compareTo(o2);
                }
            });
    }

    // 여기서 generic 을 food 라고 확실히 define 해줘야한다,아니면 compiler 가 자세히모르기때문에 complain 한다 object type 을달라고
    public Stream<Food> sortWithLambda(Stream<Food> stream){

        return stream.sorted( (Food a, Food b) -> a.compareTo(b)  );
    }

    // 여기서 generic 을 food 라고 확실히 define 해줘야한다,아니면 compiler 가 Object type 으로 오해하고, static method를 non static reference에 쓸수없다고 판단한다
    public Stream<Food> sortWithMethodReference (Stream<Food> stream){

        return stream.sorted(Food::compareTo);
    }


    public Stream basicSortNaturalOrder(Stream stream){

        return stream.sorted(Comparator.naturalOrder());
    }

    public Stream basicSortNaturalOrderReversed(Stream stream){

        return stream.sorted(Comparator.naturalOrder().reversed());
    }

    public Stream<Food> sortWithComparing (Stream<Food> stream){

        return stream.sorted(Comparator.comparing(Food::getPrice));

    }

    public Stream<Food> sortWithThenComparing (Stream<Food> stream){

        return stream.sorted(Comparator.comparing(Food::getPrice).thenComparing(Comparator.naturalOrder()));

    }

    public Stream<Food> sortWithThenComparingPriceReversed (Stream<Food> stream){

        return stream.sorted(Comparator.comparing(Food::getPrice).reversed().thenComparing(Comparator.naturalOrder()));

    }

    public Stream<Food> sortWithThenComparingCalorieReversed (Stream<Food> stream){

        return stream.sorted( Comparator.comparing(Food::getPrice).thenComparing(Comparator.<Food>naturalOrder().reversed()) );

    }



}


