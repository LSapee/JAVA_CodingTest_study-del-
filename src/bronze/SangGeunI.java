package bronze;

import java.util.Scanner;

public class SangGeunI {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        String[] a = sc.next().split("");
        String[] b = sc.next().split("");
        int n =0;
        int m =0;
        String word1 = "";
        String word2 = "";

        for(int i=a.length-1; i>=0; i--){
            n = Integer.parseInt(a[i]);
            m = Integer.parseInt(b[i]);
            if(n>m){
                a=a;
                break;
            }else if(m>n){
                a =b ;
                break;
            }
        }
        for(int i=a.length-1; i>=0; i--){
            System.out.print(a[i]);
        }

    }
}
