package DSA_practice;

import java.util.Arrays;

public class stringSplit {
    public static void main(String[] args) {
        String str = "Hello world Java";
        String[] stringArray = str.split(" ");

        System.out.println("Splited string = "+ Arrays.toString(stringArray));

        StringBuilder sb = new StringBuilder();

        System.out.print("Reverse stirng: ");
        for(int i = stringArray.length -1; i>=0; i--){
//            System.out.print(stringArray[i]+" ");
            sb.append(stringArray[i]);
            if(i > 0){
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}

