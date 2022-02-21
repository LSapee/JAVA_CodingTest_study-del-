package bronze;

import java.util.Scanner;

public class Array02 {
    public static  void main(String[] aaa){
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int m = 0;
        int a =0;
        int ar[] = new int[9];

        for(int i =0; i<9; i++){
            n=sc.nextInt();
            if(n>m){
                m=n;
                a = i;
            }
        }
        System.out.println(m);
        System.out.println(a+1);
    }
}
