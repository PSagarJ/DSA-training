package CodingPractice;

public class allDivisionsOfNumber {
    public void checkDivisors(){
        int n = 36;

        for(int i = 1; i <=n; i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        allDivisionsOfNumber ad = new allDivisionsOfNumber();
        ad.checkDivisors();
    }
}
