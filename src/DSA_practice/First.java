package DSA_practice;

import java.util.Arrays;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("enter string: ");
//        String s1 = sc.nextLine();
//        System.out.println(s1);

//        System.out.println("enter string: ");
//        char s1 = sc.next().charAt(3);
//        System.out.println(s1);sfd

//        System.out.println("Enter the string:");
//        char x = sc.next().charAt(0);
//        int b = 0;
//        System.out.println("Char" + x + "Hii" + b);

//        int n = 5;
//        int add = 0;
//        for(int i = 0; i<=n; i++){
//             add +=i;
//            System.out.println(add);
//        }
//        System.out.println(add);

//        int n1 = sc.nextInt();
//        int add1 = 0;
//        for(int i = 0; i<= n1; i++){
//            add1 +=i; //add1 = add1+i;
//        }
//        System.out.println(add1);

        //factorial ❌
//        int n2 = sc.nextInt();
//        int add2 = 0;
//        for(int i = 0; i<=n2; i++)
//        {
//            add2 = add2 * i;
//        }
//        System.out.println(add2);

        //number of digits :
//        int num = 1234;
//        int count = 0;
//        while(num>0){
//            count ++;
//            num = num/10;
//        }
//        System.out.println(count);

//        //addtition of numbers
//    int num = 451;
//    int sum = 0;
//    int temp = num; //451
//    while(temp>0){
//        int m = temp % 10;
//        sum = sum+m;
//        temp = temp / 10;
//    }
//        System.out.println(sum);

        //sum of even and odd numbers from 1 to 10:
//        int sum = 0;
//        int sum1  = 0;
//        for(int i = 0; i<=10; i++){
//            if(i%2==0) {
//                sum += i;
//            } else {
//                sum1 += i;
//            }
//        }
//        System.out.println("sum of odd numbers: "+sum1);
//        System.out.println("sum of even numbers: "+sum);




        //1. Greatest of three numbers
//        int a = 1110;
//        int b = 200;
//        int c = 25;
//        if(a>b && a>c){
//            System.out.println("a = "+a+" is greatest.");
//        } else if (b>c) {
//            System.out.println("b = "+b+" is greatest");
//        }else {
//            System.out.println("c = "+c+" is greatest");
//        }



        //2. Multiplication table of a number
//        int num = sc.nextInt();
//        int multi = 0;
//        for(int i = 1; i<=10; i++){
////            multi *= i;
//            multi = num * i;
//            System.out.println(multi);
//        }

        //3. check num is palindrome or not
//        System.out.println("Enter a number: ");
//        int num = sc.nextInt();
//        int originalNum = num;
//        int reverseNum = 0;
//        while(num>0){
//            int digit = num % 10;
//            reverseNum = (reverseNum*10)+ digit;
//            num /= 10;
//        }
//        System.out.println(reverseNum);
//        if(reverseNum == originalNum){
//            System.out.println("Given number IS palindrome......");
//        }else {
//            System.out.println("Given number IS NOT palindrome!!!!!!!");
//        }


//        //4. find 1st digit of number
//        System.out.println("Enter a number: ");
//        int num = sc.nextInt();
//
//        int temp = num;
//
//        while(temp>=10){
//            temp = temp / 10;
//        }
//        System.out.println(temp);



//        //5. find last digit of number
//        System.out.println("Enter a number: ");
//        int num = sc.nextInt();
//        int lastDigit = num % 10;
//        System.out.println("The last digit of number is : "+lastDigit);



//        //6. find largest digit in number
//        System.out.println("Enter a number : ");
//        int num = sc.nextInt();
//        int largestDigit = 0;
//        while(num > 0){
//            int digit = num % 10;
//            if(largestDigit < digit){
//                largestDigit = digit;
//            }
//            num /= 10;
//        }
//        System.out.println("The largest digit in given number is : "+largestDigit);



//        //7. sum of first and last digit
//        System.out.println("Enter a number : ");
//        int num = sc.nextInt();
//        int temp = num;
//        int FirstDigit = 0;
//        while(temp >= 10){
//            temp = temp/10;
//            FirstDigit = temp;
//        }
//        System.out.println("The first digit is : "+FirstDigit);
//        int LastDigit = num % 10;
//        System.out.println("The last digit is : "+LastDigit);
//        int addition = FirstDigit+LastDigit;
//        System.out.println("Now the addition of first and last digit is : "+addition);


//        //8. check whether a digit exits or not
//        int num = 125934;
//        int temp = num;
//
//        System.out.println("Enter a number : ");
//        int digitToFind = sc.nextInt();
//
//        boolean found = false;
//
//        while(temp > 0){
//
//            int digit = temp % 10;
//
//            if(digit == digitToFind){
//                found = true;
//                break;
//            }
//
//            temp /= 10;
//        }
//        if(found){
//            System.out.println("Digit to find EXIST in the given number.....");
//        }else{
//            System.out.println("Digit to find DOES NOT EXIST in the given number !!!!!");
//        }



//        //9. Calculate the average of n numbers.
//        // This is done by taking the number of digits by me directly just addition is done using code...
//        System.out.println("Enter a number : ");
//        int num = sc.nextInt();//1256
//        int temp = num;//1256
//        int addition = 0;
//        while(temp > 0){
//            int digit = temp % 10;
//            addition += digit;
//            temp /=10;
//        }
//        double average = (double) addition / 4;
//        System.out.println(average);


//        System.out.println("How many numbers do you want to average? ");
//        int n = sc.nextInt(); // This is your 'n'
//
//        int sum = 0;
//
//// Loop runs exactly 'n' times to collect all numbers
//        for (int i = 1; i <= n; i++) {
//            System.out.println("Enter number " + i + ": ");
//            int currentNum = sc.nextInt();
//            sum += currentNum; // Add the current number to the running total
//        }
//
//// Use double casting to prevent integer division (e.g., 5/2 becomes 2.5, not 2)
//        double average = (double) sum / n;
//
//        System.out.println("The average of the " + n + " numbers is: " + average);



        //10. amstrong number:






        sc.close();
    }
}
