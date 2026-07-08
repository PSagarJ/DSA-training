package CodingPractice;

public class largestAndSecondLargest {
    public static void main(String[] args) {

        int [] arr = {5,5,5};
        int largest = arr[0];
        int secondLargest = 0;

        for(int i = 1; i<=arr.length-1; i++){

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }

            else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Largest num: "+largest);
        System.out.println("Second largest num: "+secondLargest);
    }
}
