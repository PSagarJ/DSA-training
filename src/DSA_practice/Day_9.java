package DSA_practice;

public class Day_9 {
//    public static void main(String[] args) {
//        int n = 3;
//        int cr = 0, cc = 0;
//
//        find("",cr,cc,n);
//    }
//    public static void find(String ans, int cr, int cc, int n){
//        if(cr == n-1 && cc == n-1){
//            System.out.print(" "+ans);
//            return;
//        }
//        if(cr >= n || cc>=n)return;
//
//        //horizontal
//        find(ans + "H",cr,cc+1,n);
//        //vertical
//        find(ans+ "V",cr+1,cc,n);
//    }

    public static void main(String[] args) {
        //LexiGraphcalOrder

        for(int i = 1; i<=9; i++){
            create(i, 113);
        }
    }
    public static void create(int num, int n){
        if(num>n) return;

        System.out.println(num);
        num=num*10;

        for(int i = 0;i<=9;i++){
            create(num+i,n);
        }
    }
}
