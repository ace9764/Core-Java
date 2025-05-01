package com.aaron.core.java.lambda.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParellelStreamPractice<T> {

    public static void main(String args[]) {


        restaurantSimulator();
        //Store2 testStore = new Store2();
        //System.out.println("StoreId: "+testStore.getStoreId()) ;

    }


    Stream<T> returnParellelStream(Collection<T> collection){

        return collection.stream().parallel();
    }

    Stream<T> returnParellelStreamCollections(Collection<T> collection){

        return collection.parallelStream();
    }

   static  public void restaurantSimulator(){


        Store2 store1 = new Store2("1234", "Jaeyoung-123");
        Store2 store2 = new Store2("3456", "Jaeyoung-123");

        Store2 store3 = new Store2("4543", "Hongsun-123");
        Store2 store4 = new Store2("2444", "Hongsun-123");

        Store2 store5 = new Store2("6453", "Aaron-123");
        Store2 store6 = new Store2("1214", "Aaron-123");


        Manager jaeyoung = new Manager("Jaeyoung-123","Jaeyoung",31, store1,store2 );

        Manager hongsun = new Manager("Hongsun-123","Hongsun",35, store3,store4 );

        Manager aaron = new Manager("Aaron-123","Aaron",27, store5,store6 );

        //int totalStores = Stream.of(jaeyoung,hongsun,aaron).mapToInt(Manager::returnNoOfStores).sum();

        //System.out.println("Total Stores: "+totalStores);
        Stream<List<Store2>> streamStoreList = Stream.of(jaeyoung,hongsun,aaron).map(Manager::getStoreList);
        Stream<Store2> storeStream  = streamStoreList.flatMap(p -> p.stream());
        List<Store2> storeList = storeStream.collect(Collectors.toList());

        //storeStream.reduce(0, (a,b)-> b.setOrders(generateFoodAndOrder(new Random().nextInt(20))) );

        //#1 Store list by manager
        storeList.forEach(b-> b.setOrders(generateFoodAndOrder(new Random().nextInt(20))));
        Map<String, List<Store2>> storeListByManager = storeList.stream().collect(Collectors.groupingBy(Store2::getManagerId, Collectors.toList()));
        System.out.println("Store List by manager: "+ storeListByManager);

        //#2 StoreId + noOfOrders by managers
        //Map<String, String> storeIdAndNoOfOrdersByManager = storeList.stream().collect(Collectors.toMap(s -> s.getManagerId(), s -> s.getManagerId() + s.getNoOfOrders()));
        Map<String, List<String>> storeIdAndNoOfOrdersByManager = storeList.stream().collect(Collectors.groupingBy(Store2::getManagerId, Collectors.mapping(s -> s.getStoreId() + "-"+ s.getNoOfOrders(), Collectors.toList())   )   );
        System.out.println("StoreId and No of orders groubed by manager: "+ storeIdAndNoOfOrdersByManager);

       //#3 Best performing store(in no of sales) by managers
       Map<String, String> bestStoreByManager = storeList.stream().collect(Collectors.groupingBy(Store2::getManagerId, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Store2::getNoOfOrders)), o -> "Best StoreId: "+ o.orElseGet(() -> new Store2()).getStoreId() + " No of orders: "+ o.orElseGet( () -> new Store2() ).getNoOfOrders()  )));
       System.out.println("Best store per manager: "+ bestStoreByManager);
    }

    static public List<Order2> generateFoodAndOrder(int noOfFoods){

        List<Order2> order2List = new ArrayList();

        for(int i =0; i <noOfFoods; i++){
            int index1 = new Random().nextInt(4);
            order2List.add( new Order2(String.valueOf(new Random().nextInt(10000)),new Food2(Menu.menuList.get(index1).getName(), Menu.menuList.get(index1).getCuisine() ) , customerList.customerList.get(new Random().nextInt(5)) ));
        }

        return order2List;
    }

}


class Manager{


    public Manager(String managerId, String name, int age, Store2... listOfStores) {
        this.name = name;
        this.age = age;
        this.storeList = Arrays.asList(listOfStores);
        this.managerId = managerId;

    }


    public int returnNoOfStores(){

        return this.storeList.size();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Store2> getStoreList() {
        return storeList;
    }

    public void setStoreList(List<Store2> storeList) {
        this.storeList = storeList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "age=" + age +
                ", storeList=" + storeList +
                ", name='" + name + '\'' +
                ", managerId='" + managerId + '\'' +
                '}';
    }

    int age;
    List<Store2> storeList;

    String name;

    String managerId;


}


class Store2{


    public Store2() {
        this.storeId ="Default Store (empty store)";
        this.managerId= "No manager assigned yet! ";
    }

    public Store2(String storeId, String managerId) {
        this.storeId = storeId;
        this.managerId = managerId;
    }



    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public List<Order2> getOrders() {
        return orders;
    }

    public void setOrders(List<Order2> orders) {
        this.orders = orders;
        setNoOfOrders(this.orders.size());
    }

    public int getNoOfOrders() {
        return this.noOfOrders;
    }

    public void setNoOfOrders(int noOfOrders) {
        this.noOfOrders = noOfOrders;

    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    @Override
    public String toString() {
        return "Store2{" +
                "orders=" + orders +
                ", noOfOrders=" + noOfOrders +
                ", storeId='" + storeId + '\'' +
                ", managerId='" + managerId + '\'' +
                '}';
    }

    List<Order2> orders;

    int noOfOrders;
    String storeId;
    String managerId;



}


class Order2{

    public Order2(String orderId, Food2 food, String customerName) {
        this.orderId = String.valueOf(new Random().nextInt(1000));
        this.food = food;
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Order2{" +
                "orderId='" + orderId + '\'' +
                ", food=" + food +
                ", customerName='" + customerName + '\'' +
                '}';
    }

    String orderId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Food2 getFood() {
        return food;
    }

    public void setFood(Food2 food) {
        this.food = food;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    Food2 food;

    String customerName;


}

class Food2{

    public Food2(){

    }

    public Food2(String name, String cuisine ){
        this.name = name;
        this.cuisine=cuisine;
    }

    String name;
    String cuisine;

    @Override
    public String toString() {
        return "Food2{" +
                "name='" + name + '\'' +
                ", cuisine='" + cuisine + '\'' +
                '}';
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }




}

class Menu{

    public static List<menu1> menuList = Arrays.asList(menu1.PIZZA, menu1.TACO, menu1.BURGER,menu1.GALBI);

}

enum menu1{
    TACO("Taco","Mexican"),
    BURGER("Burger", "American"),
    PIZZA("Pizza", "Italian"),
    GALBI("Galbi","Korean");

    public String getName() {
        return name;
    }

    public String getCuisine() {
        return cuisine;
    }

    String name;

    String cuisine;

    menu1(String name, String cuisine)
    {
        this.name = name; this.cuisine =cuisine;
    }

}


class customerList{

    public static List<String> customerList = Arrays.asList("Jake","Brendan","Davis","Mohit","Prabhat");

}