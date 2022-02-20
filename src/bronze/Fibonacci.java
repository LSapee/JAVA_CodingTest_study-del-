package bronze;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);

        int f = sc.nextInt();

        int k = 0;
        int n =0;
        int m =1;

//        if (f == 0) {
//            k = 0;
//        } else if (f == 1) {
//            k =1;
//        } else {
            for (int i = 1; i < f; i++) {
                k = n+m;
                n = m;
                m = k;
            }

//        }
        System.out.println(k);
    }
}