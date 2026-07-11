package Learning_with_claude;

public class MaxValueIndex {
    public int maxvalueIndex(int [] arr){
        int maxIndex = 0;

        for(int i =1; i<arr.length; i++){
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        int [] arr = {3,2,5,6,9,1,5};
        MaxValueIndex mvx = new MaxValueIndex();
        System.out.println(mvx.maxvalueIndex(arr));
    }
}
