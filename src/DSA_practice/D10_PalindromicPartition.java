package DSA_practice;

import java.util.ArrayList;
import java.util.List;

public class D10_PalindromicPartition {

    public static void main(String[] args) {
//        find("aab",new ArrayList<>());
    }
    public static void pp(String s, List<String> ans){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++){
//            if(isPal(s.substring(0,i+1))){
                ans.add(s.substring(0,i+1));
                pp(s.substring(i+1),ans);
            }
        }
    }

