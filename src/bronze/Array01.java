package bronze;

import java.util.Arrays;
import java.util.Scanner;

public class Array01 {
    public static  void main(String[] aaa){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i =0; i<n; i++){
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar);
        System.out.println(ar[0] + " " + ar[n-1]);


    }
}
