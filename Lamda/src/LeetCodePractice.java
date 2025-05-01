import java.util.Arrays;

public class LeetCodePractice {

    public int[] productExceptSelf(int[] nums) {

        int noOfZeros = 0;
        int total = 1;

        int zeroIndex = 0;

        // for(int number: nums){

        //     if(number != 0){

        //         total *= number;

        //     }else{
        //         zeroIndex = Arrays.asList(nums).indexOf(number);
        //         noOfZeros++;
        //     }

        // }

        for(int i=0 ; i < nums.length; i++){

            if(nums[i] != 0){
                total *= nums[i];
            }else{
                zeroIndex = i;
                noOfZeros++;
            }

        }

        if(noOfZeros > 1 ){
            return new int[nums.length];
        }


        int [] outPutArray = new int[nums.length];


        if(noOfZeros > 0 ){

            outPutArray[zeroIndex] = total;

            return outPutArray;
        }

        for(int i = 0; i < nums.length; i++){

            outPutArray[i] = total/nums[i];
        }


        return outPutArray;
    }

    public int[] productExceptSelfNeetCodeSoluiton(int[] nums) {

        int noOfZeros = 0;
        int total = 1;

        for(int number: nums){

            if(number != 0){

                total *= number;

            }else{
                noOfZeros++;
            }

        }

        if(noOfZeros > 1 ){
            return new int[nums.length];
        }


        int [] outPutArray = new int[nums.length];


        for(int i = 0; i < nums.length; i++){

            if(noOfZeros > 0) {
                outPutArray[i] = nums[i] == 0 ? total: 0;
            }
            else{
                outPutArray[i] = total/nums[i];
            }
        }


        return outPutArray;
    }



    public static void main(String args[]){

        new LeetCodePractice().productExceptSelf(new int[] {-1,0,1,2,3});

    }
}
