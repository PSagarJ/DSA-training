package CodingPractice;

public class stringPalindrome {
    public static void main(String[] args) {

        //Test case one return true
        String str = "LEVEL";
        //Test case two return false
//        String str = "s";

        //Test case three return false
//        String str = "levle";
        char [] s = str.toCharArray();

        int left = 0;
        int right = s.length-1;
        boolean isPalindrome = true;


        while(left < right){
            if(s[left] != s[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("Given string is palindrome: "+isPalindrome);

    }
}
