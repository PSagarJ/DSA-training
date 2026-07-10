package Learning_with_claude;

import java.util.HashSet;

import java.util.Map;
// need hashset to sotre the values
// If the value is already in map, then found the duplicate
// if not store it

public class duplicateValues {

    public boolean findDuplicates(int [] arr){
        HashSet<Integer> seen = new HashSet<>();
        for (int i =0; i<arr.length; i++){
            if(seen.contains(arr[i])){
//                System.out.println("Find duplicate:"+arr[i]);
                return true;
            }
            else seen.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,6,2,8,9,4,3};
        duplicateValues dv = new duplicateValues();

//        boolean hasDuplicates = dv.findDuplicates(arr);
        System.out.println("Contains duplicates: "+dv.findDuplicates(arr));
    }
}
