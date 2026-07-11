package Learning_with_claude;

public class MaxSumSubArrayWithStartIndex {
    public void sumSubArray(int [] arr, int k){

        int windowSum = 0;

        for(int i =0; i<k; i++){
            windowSum += arr[i];
        }
        int maxSumIndex = 0;

        int maxSum = windowSum;

        for(int i = k; i<arr.length; i++){
            windowSum = windowSum - arr[i-k] + arr[i];
            if(maxSum < windowSum){
                maxSum = windowSum;
                maxSumIndex = i - k + 1;
            }
        }
        System.out.println("Maximum sum: "+maxSum+" found at index: "+maxSumIndex);
    }

    public static void main(String[] args) {
        int [] arr = {4, 2, 1, 7, 3, 6};

        MaxSumSubArrayWithStartIndex mxi = new MaxSumSubArrayWithStartIndex();
        mxi.sumSubArray(arr,2);
    }
}
