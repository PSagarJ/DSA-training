//package DSA_practice;

//
//public class Day_3 {
//    public static void main(String[] args) {
//        //withoud function use:
////        int [] arr = {48,50,32,9,65};
////        int target = 33;
////        boolean isfound = false;
////        for(int i = 0; i<=arr.length; i++){
////            if(arr[i] == target) {
////                System.out.println("Number found...\nNumber found at index "+i);
////                isfound = true;
////                break;
////            }
////        }
////        if(!isfound){
////            System.out.println("Number is not present in given array !!!!!!");
////        }
//    }
//}



//public class Day_3{
//    static void search(int[] arr, int target) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                System.out.println("Number " + arr[i] + " found at index " + i);
//                break; // Stop searching once found
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        int target = 3;
//
//        // Calling the static method
//        search(arr, target);
//    }
//}

package DSA_practice;

public class Day_3 {

    static int maxInt(int arr[]) {
        int maxNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= maxNum) {
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] arr = {48, 50, 32, 9, 5};

        // Call the method and print the result
//        int max = maxInt(arr);
        System.out.println("The maximum number is = " + maxInt(arr));
    }
}