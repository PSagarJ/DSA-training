package CodingPractice;

import java.util.HashMap;

public class StringAnagrams {
    public void anagrameCheck(){
        String str = "listen";
        String str2 = "silent";

        // Step 1: Checking length is equal or not. If not equal exit right here because there will be not anagram
        if(str.length() != str2.length()){
            System.out.println("Given strings are not anagrams");
            return;
        }

        // hash map creation with char and count
        HashMap<Character, Integer> map = new HashMap<>();

        //Step 2: Counting characters in str.
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                // if char is presnet increase count by 1
                map.put(ch, map.get(ch) + 1);
            } else {
                //if chara is new give count of 1
                map.put(ch, 1);
            }
        }

        // step 3: spending the counts between str and str2
        for(int i = 0; i < str2.length(); i++){
            char ch = str2.charAt(i);

            if(!map.containsKey(ch)){ // this check whether the character is presnet if not present exits here
                System.out.println("Not anagram");
                return;
            }
            // if character is in map decrease the count by 1
            map.put(ch,map.get(ch) -1);


            if(map.get(ch) == 0){
                map.remove(ch);
            }
        }
        if(map.isEmpty()){
            System.out.println("The strings are anagram");
        }else {
            System.out.println("String is not anagrams");
        }
    }

    public static void main(String[] args) {
        StringAnagrams sa = new StringAnagrams();
        sa.anagrameCheck();
    }
}
