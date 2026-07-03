package DSA_practice;

import java.util.ArrayList;
import java.util.List;

public class D10_CoinChange {

    public static void main(String[] args) {

        int arr[] = {1,2,3};
        List<List<Integer>> l = new ArrayList<>();
        find(new ArrayList<>(),arr,l);
        System.out.println(l);
    }

    public static void find(List<Integer> ans, int arr[], List<List<Integer>> l){

        if(ans.size() == arr.length){
            System.out.println(ans);
            l.add(new ArrayList<>(ans));
            return;
        }
        for (int i = 0; i<arr.length; i++){
            if(ans.contains(arr[i]) == false){
                ans.add(arr[i]);
                find(ans,arr,l);
                ans.remove(ans.size()-1);
            }
        }
    }
}
