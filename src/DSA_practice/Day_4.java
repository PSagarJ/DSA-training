package DSA_practice;

import java.util.Arrays;

public class Day_4 {
//    public static void main(String[] args) {
//        int [] arr = {4,1,2,3,1,3,3,2,2,3};
//        int maxFrequency = 0;
//        int element = arr[0];
//
//        for(int i = 0; i<arr.length; i++){
//
//            int count = 0;
//
//            for(int j = 0; j<arr.length; j++){
//
//                if(arr[i] == arr[j]){  //wrong : count > maxFrequency
//                    count ++;
//                }
//            }
//            if(count > maxFrequency){
//                maxFrequency = count;
//                element = arr[i];
//            }
//        }
//        System.out.println("Element with max frequency = "+element);
//    }


    static int[] productWithoutSelf(int[] nums){

        int answer [] = new int[nums.length];
        int leftProduct = 1;
        for(int i = 0; i < nums.length; i++){
            answer[i] = leftProduct;
            leftProduct = leftProduct * nums[i];
        }

        int rightProduct = 1;
        for(int i = nums.length -1; i >= 0; i--){
            answer[i] = answer[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int nums [] = {1,2,3,4};
        System.out.println(Arrays.toString(productWithoutSelf(nums)));
    }
}


