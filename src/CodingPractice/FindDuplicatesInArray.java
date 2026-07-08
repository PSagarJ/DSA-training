package CodingPractice;

import java.util.HashSet;

public class FindDuplicatesInArray {

    public void findDuplicates(){
        int [] arr = {4, 3, 2, 7, 8, 2, 3, 1};

//        HashSet<Integer> seen = new HashSet<>();
//        HashSet<Integer> duplicates = new HashSet<>();
//
//        for(int i = 0; i<arr.length; i++){
//            int num = arr[i];
//
//            boolean isNew = seen.add(num);
//
//            if(isNew == false){
//                duplicates.add(num);
//            }
//        }
//        System.out.println(duplicates);

        // Even smaller and easier approach or technique for same problem

        HashSet<Integer> set = new HashSet<>();

        System.out.println("Duplicate elements are:");
        for (int i = 0; i<arr.length; i++){
            if(set.contains(arr[i])){
                System.out.println(arr[i]);
            }
            else {
                set.add(arr[i]);
            }
        }

    }

    public static void main(String[] args) {
        FindDuplicatesInArray fda = new FindDuplicatesInArray();
        fda.findDuplicates();
    }
}
