package core.aaron.java.collections;

import java.util.Arrays;

class Person{

    String Name;

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                '}';
    }
}
public class ArrayDemo {

    public static void main(String args[]){

//        int[] array1 = {1,2,3};
//
//        int[] array2 = Arrays.copyOf(array1, array1.length);

//        System.out.println("Array 1: "+ Arrays.toString(array1));
//
//        System.out.println("Array 2: "+ Arrays.toString(array2));

//        array1[1] = 22;   // value of array2[1] is not set to 22
//
//        array1[2] = 33;   // value of array1[2] is not set to 33

//        System.out.println("After modifiying Array 1: "+ Arrays.toString(array1));
//
//        System.out.println("After modifiying Array 2: "+ Arrays.toString(array2));


        Person[] AllPersons = new Person[3];

        for(int i=0; i<3; i++)
        {
            AllPersons[i] = new Person();
        }

        AllPersons[0].Name = "Aaron";
        AllPersons[1].Name = "Bill";
        AllPersons[2].Name = "James";

        Person[] OtherPersons  =  Arrays.copyOf(AllPersons, 3);  // value of OtherPersons[2].Name is also set to "xyz"

        AllPersons[0].Name = "Jim";
        AllPersons[1].Name = "Kevin";
        AllPersons[2].Name = "David";

        System.out.println("After modifiying Array 1: "+ Arrays.toString(AllPersons));

        System.out.println("After modifiying Array 2: "+ Arrays.toString(OtherPersons));


        int [] a = new int[3];

        a[0] = 3;
        a[1] = 4;
        a[2] = 5;


       int [] b = a;

        a[0] = 6;
        a[1] = 7;
        a[2] = 8;

        System.out.println("Before modifiying Array 1: "+ Arrays.toString(a));

        System.out.println("Before modifiying Array 2: "+ Arrays.toString(b));

        System.out.println("After modifiying Array 1: "+ Arrays.toString(a));

        System.out.println("After modifiying Array 2: "+ Arrays.toString(b));


    }
}
