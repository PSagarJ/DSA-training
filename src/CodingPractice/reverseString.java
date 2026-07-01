package CodingPractice;

import java.util.Scanner;

public class reverseString {
    Scanner sc = new Scanner(System.in);

    public void reverse() {
        String str = sc.nextLine();
        char[] s = str.toCharArray();

        int left = 0;
        int right = s.length-1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        reverseString rs = new reverseString();
        rs.reverse();
    }

}
