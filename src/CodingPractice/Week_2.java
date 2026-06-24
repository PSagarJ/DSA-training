package CodingPractice;

import java.util.Scanner;

public class Week_2 {
    static Scanner sc = new Scanner(System.in);


    //Day 1: Sum of Digits

//    public static void main(String[] args) {
////        int num = 123;
//        System.out.println("Enter a number: ");
//        int num = sc.nextInt();
//        int sum = 0;
//        while(num>0){
//            int digit = num%10;
//            sum += digit;
////            int i = num / 10; Insted of writing like this we can write it like following.
////            num  = i;
//            num = num/=10;
//        }
//        System.out.println(sum);
//    }


    //Day 2: Reverse a Number
//   public static void main(String[] args) {
//            System.out.println("Enter num to reverse: ");
//            int num = sc.nextInt();
//            int reverseNum = 0;
//            while(num >0){
//                int lastDigit = num % 10;
//                reverseNum = (reverseNum*10)+ lastDigit;
//                num /=10;
//            }
//            System.out.println(reverseNum);
//        }

        //Day 3: Check prime number
//        public static void main(String[] args) {
//            int num = sc.nextInt(); //7
//            boolean isPrime = true;
//            if (num <=1){
//                isPrime = false;
//            }
//            for(int i = 2; i<num; i++){
//                if (num % i == 0){
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime){
//                System.out.println("Number is Prime...");
//            }else {
//                System.out.println("Number is not a prime!!!!");
//            }
//        }

        //Day 4: Fibonacci Series
    // Following code just prints the first N numbers in Fibonacci series.
//    public static void main(String[] args) {
//        System.out.println("Enter a number: ");
//        int N = sc.nextInt(); //4
//        int first = 0;
//        int second = 1;
//        int nextNumber;
//
////        for(int i = 0; i<N; i++){
////            System.out.print(first+" ");
////            nextNumber = first+second;
////            first = second;
////            second = nextNumber;
////        }
//
//        // The following code prints the actual series to given N number
//        while(first<=N){
//            System.out.print(first+" ");
//            nextNumber = first + second;
//            first = second;
//            second = nextNumber;
//        }
//        System.out.println("\nNow the series is ended......");
//    }




//    Day 5
    public static void main(String[] args) {
        System.out.println("Enter a number of * to print: ");
        int N = sc.nextInt(); //4
        for (int i = 1; i<=N; i ++){
            for (int j =1; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

}