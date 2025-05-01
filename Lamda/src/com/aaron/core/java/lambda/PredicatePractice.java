package com.aaron.core.java.lambda;

import java.sql.Array;
import java.util.*;
import java.util.function.Predicate;

public class PredicatePractice {

    static TreeSet<String> studentGrades = new TreeSet<>();


    public static void main(String args[]){




        List<String> stringList = Arrays.asList("CGUS_A02957083|11".split("\\|"));

        System.out.println(stringList);

    }

    public void test(int noOfStudents){

        for(int no = 0 ; no <noOfStudents; no++){

            Integer i =  new Random().nextInt(101);

            String grade ="";

     
            if(returnPredicateA().test(i)){

                System.out.println("You have scored "+ i+ " Your Grade is: "+ GradeList.gradeList.get(0));
                grade = GradeList.gradeList.get(0);
            }
            else if(returnPredicateA().negate().and(returnPredicateB()).test(i)  ){

                System.out.println("You have scored "+ i+ " Your Grade is: "+ GradeList.gradeList.get(1));
                grade = GradeList.gradeList.get(1);
            }
            else if(returnPredicateC().test(i)){

                System.out.println("You have scored "+ i+ " Your Grade is: "+ GradeList.gradeList.get(2));
                grade = GradeList.gradeList.get(2);
            }

            else if(returnPredicateC().negate().and(returnPredicateD()).test(i)){
                System.out.println("You have scored "+ i+ " Your Grade is: "+ GradeList.gradeList.get(3));
                grade = GradeList.gradeList.get(3);
            }
            else if(returnPredicateF().or(returnPredicateF().negate()).test(i)){

                System.out.println("You have scored "+ i+ " Your Grade is: "+ GradeList.gradeList.get(4) +" Please practice more next time! ");
                grade = GradeList.gradeList.get(4);
            }


            PredicatePractice.studentGrades.add(grade);
        }

        System.out.println("List of grades in this class: "+ PredicatePractice.studentGrades);

    }

    public Predicate<Integer> returnPredicateF(){
        return i ->  i > 50;
    }
    public Predicate<Integer> returnPredicateD(){
        return i ->  i >= 60;
    }

    public Predicate<Integer> returnPredicateC(){
        return i ->  i >= 70;
    }

    public Predicate<Integer> returnPredicateB(){
        return i ->  i >= 80;
    }

    public Predicate<Integer> returnPredicateA(){
        return i ->  i >= 90;
    }

//    public Boolean doesNotContain(String s, Predicate<String> doesContain){
//
//        return doesContain.test(;
//    }


}

class GradeList{
    static List<String> gradeList = new ArrayList<>(Arrays.asList(new String[] {"A", "B", "C","D","F"}));
}


