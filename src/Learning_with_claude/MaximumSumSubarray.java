package Learning_with_claude;

public class MaximumSumSubarray {

    public int subarray(int [] arr, int k){

        int windowSum = 0;

        for(int i = 0; i<k; i++){  // 0 1 2 < 3
            windowSum = windowSum + arr[i]; // 0+2 = 2 -> 2+1 = 3 -> 3+5=8 end
        }

        int maxSum = windowSum;

        for(int i = k; i<arr.length; i++){
            windowSum = windowSum -arr[i-k]+arr[i];
            if(windowSum>maxSum) maxSum = windowSum;
        }
        return maxSum;




//        for(int i = 0; i<=arr.length-k; i++){
//            int newSum = 0;
//
//            for(int j = i; j < i + k; j++){
//                newSum = newSum+arr[j];
//            }
//
//            if(newSum > maxSum) {
//                maxSum = newSum;
//            }
//        }
    }

    public static void main(String[] args) {
        int [] arr = {1,2,4,1,2,4,2,4,9,9,3,5,3,2,3,4,5,3,5,9};
        MaximumSumSubarray ms = new MaximumSumSubarray();

        System.out.println("Max sum of subarray: "+ms.subarray(arr,3));
    }
}
