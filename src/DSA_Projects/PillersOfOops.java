package DSA_Projects;

public class PillersOfOops {

    public static void main(String[] args) {

        int s1 = sum(2,6);
        int s2 = sum(2,5,8,3);
        System.out.println(s1);
        System.out.println(s2);
    }

    public static int sum(int d1, int d2){
        return d1+d2;
    }
    public static int sum(int d1, int d2,int d3, int d4){
        return d1+d2+d3+d4;
    }
}
