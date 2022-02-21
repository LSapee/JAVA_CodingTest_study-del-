package bronze;

import java.util.Arrays;
import java.util.Scanner;

public class Array04 {
    public static void main(String[] aaa){
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        int b =0;
        int count =0;
        for(int i =0; i<10; i++){
            b=sc.nextInt();
            a[i] =b%42;
        }
        Arrays.sort(a);
        for(int i =0; i<9; i++){
            if(a[i] != a[i+1]){
                count++;
            }
        }
        System.out.println(count+1);
    }
}
