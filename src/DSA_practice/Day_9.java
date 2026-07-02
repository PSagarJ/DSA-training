package DSA_practice;

public class Day_9 {
    public static void main(String[] args) {
        int n = 3;
        int cr = 0, cc = 0;

        find("",cr,cc,n);
    }
    public static void find(String ans, int cr, int cc, int n){
        if(cr == n-1 && cc == n-1){
            System.out.print(" "+ans);
            return;
        }
        if(cr >= n || cc>=n)return;

        //horizontal
        find(ans + "H",cr,cc+1,n);
        //vertical
        find(ans+ "V",cr+1,cc,n);
    }
}
