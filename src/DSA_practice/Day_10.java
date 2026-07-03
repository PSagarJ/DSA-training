package DSA_practice;

public class Day_10 {
    public static void main(String[] args) {
        boolean chair [] = new boolean[3];
        seat("",1,2,chair);
    }
    public static void seat(String ans, int q, int n, boolean chair[]){

        if(q > n){
            System.out.println(ans);
            return;
        }
        for(int i = 0; i<chair.length; i++){
            if(chair[i] == false){
                chair[i] = true;

                seat(ans+("C"+i+"Q"+q),q+1,n,chair);
                chair[i] = false;
            }
        }
    }

}
