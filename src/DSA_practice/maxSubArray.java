package DSA_practice;

import java.util.Arrays;

public class maxSubArray {
    static int nums [] = {0,1,2,3,-6,2,-2,9,-1};

    static int maxSub(int [] nums){
        int currentSum = nums[0];
        int maxSum = nums[0];

        for(int i = 1; i< nums.length; i++){
            int v1 = nums[i];
            int v2 = currentSum + nums[i];
            currentSum = Math.max(v1,v2);
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println("Largest sum of array: "+ Arrays.toString(nums)+"\n"+maxSub(nums));
    }
}
