package DSA_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D10_CombinationSum {
    public static void main(String[] args) {
        int arr [] = {5,2,3};
        Arrays.sort(arr);
        find(0,8,new ArrayList<>(),arr);
    }
    public static void find(int idx, int target, List<Integer> ans, int coin[]){
        if(target == 0){
            System.out.println(ans);
            return;
        }
        for (int i = idx; i<coin.length; i++){
            if(target >= coin[i]){
                ans.add(coin[i]);
                find(i,target-coin[i],ans,coin);
                ans.remove(ans.size()-1);
            }
        }
    }
}
