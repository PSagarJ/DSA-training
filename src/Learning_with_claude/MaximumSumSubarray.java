package Learning_with_claude;

public class MaximumSumSubarray {

    public int subarray(int [] arr, int k){

        int windowSum = 0;

        for(int i =0; i<k; i++){
            windowSum = windowSum + arr[i];
        }

        int maxSum = windowSum;

        

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
        return maxSum;
    }

    public static void main(String[] args) {
        int [] arr = {2, 1, 5, 1, 3, 2};
        MaximumSumSubarray ms = new MaximumSumSubarray();

        System.out.println("Max sum of subarray: "+ms.subarray(arr,3));
    }
}
