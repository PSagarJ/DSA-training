package CodingPractice;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;

public class allDivisionsOfNumber {
    public void checkDivisors(){
        int n = 36;
        List<Integer> largeDivisiors = new ArrayList<>();

//        for(int i = 1; i <=n; i++){
//            if(n%i == 0){
//                System.out.println(i);
//            }
//        }
        for (int i =1; i <= sqrt(n); i++){
            if(n % i == 0){
                System.out.println(i);
                if( n / i != i){
                    //System.out.println(n/i);
                    largeDivisiors.add(n / i);
                }
            }
        }
        for (int i = largeDivisiors.size() -1; i>=0; i--){
            System.out.println(largeDivisiors.get(i));
        }
    }

    public static void main(String[] args) {
        allDivisionsOfNumber ad = new allDivisionsOfNumber();
        ad.checkDivisors();
    }
}
