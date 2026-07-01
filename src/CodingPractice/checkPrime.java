package CodingPractice;

import java.util.Scanner;

public class checkPrime {
    public void checkPrimeNum(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //11
        int counter = 0;

//        //Bruto force
//        for(int i = 1; i <=num; i++){
//            if(num % i ==0 ){
//                counter ++;
//            }
//            if(counter == 2){
//                System.out.println(num +" is prime number");
//            }else {
//                System.out.println(num + " is Not a prime number");
//            }
//        }

        //Optimized approach: Here I check only square root of num
        for(int i = 1; i * i <= num; i++){
            if(num % i == 0){
                counter ++;

                if(num / i != i){
                    counter ++;
                }
            }
        }
        if(counter == 2){
            System.out.println(num+" is a prime number");
        }else {
            System.out.println(num+" is not a prime number");
        }
        sc.close();
    }

    public static void main(String[] args) {
        checkPrime cp = new checkPrime();
        cp.checkPrimeNum();
    }
}
