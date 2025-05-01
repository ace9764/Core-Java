package com.aaron.core.java;

import java.util.Arrays;

public class twoSum {

    public static int[] twoSum(int[] nums, int target) {

        int [] indexArray = new int[2];

        outerloop:
        for(int i = 0; i < nums.length-1; i++){

            for(int j =0; j <nums.length; j++){

                if( i != j && (nums[i] + nums[j] == target) ){

                    indexArray[0] = i;
                    indexArray[1] = j;

                    break outerloop;
                }
            }

        }

        System.out.println("Indexes: "+ Arrays.toString(indexArray));
        return indexArray;
    }

//    public static int[] twoSum(int[] nums, int target) {
//
//        int[] indexArray = new int[2];
//
//        for(int i =0; i <nums.length-1; i++){
//
//            if( (nums[i] + nums[i+1] == target)){
//
//                indexArray[0] = i;
//                indexArray[1] = i+1;
//
//                break;
//            }
//
//        }
//
//
//        return indexArray;
//    }

    public static void main(String args[]){

        int [] numArray = {3,2,4};
        System.out.println(Arrays.toString(twoSum(numArray, 6)));


    }
}
