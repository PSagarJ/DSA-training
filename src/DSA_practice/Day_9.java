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



    //LexiGraphcalOrder

//    public static void main(String[] args) {
//        //
//        for(int i = 1; i<=9; i++){
//            create(i, 113);
//        }
//    }
//    public static void create(int num, int n){
//        if(num>n) return;
//
//        System.out.println(num);
//        num=num*10;
//
//        for(int i = 0;i<=9;i++){
//            create(num+i,n);
//        }
//    }

    public static void main(String[] args) {
        char[][] ch = {{' ',' ','x',' '},
                    {' ',' ',' ',' '},
                    {' ','x',' ',' '},
                    {' ',' ',' ',' '}};

        find("",0,0,ch);
    }
    public static void find(String ans, int cr, int cc, char [][] ch){

        if(cr == ch.length-1 && cc == ch[0].length-1){
            System.out.println(ans);
            return;
        }

        if(cr >= ch.length || cc >= ch[0].length || ch[cr][cc] == 'x') return;

        //Horizontal
        find(ans+"H",cr,cc+1,ch);

        //Vertical
        find(ans+"V",cr+1, cc,ch);
    }


}
