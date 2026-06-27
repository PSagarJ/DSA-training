package CodingPractice;

import java.util.Scanner;

public class armstrongNumber {

    public void checkArmstrong(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;//  371 or 1634
        int sum = 0;
        int count = 0;
        int mainNum = n;

        int temp = n;
        while(temp > 0){
            count ++;
            temp /= 10;
        }
        // Here got count = 3 if we enter 371

        temp = original;
        while(temp > 0){
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }

        if(sum == mainNum){
            System.out.println(mainNum + " is an Armstrong number.");
        }else{
            System.out.println(mainNum+ " is not an Armstrong number.");
        }

        sc.close();
    }

    public static void main(String[] args) {
        armstrongNumber am = new armstrongNumber();
        am.checkArmstrong();
    }
}


