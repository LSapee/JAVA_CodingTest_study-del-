package bronze;


import java.util.Arrays;
import java.util.Scanner;

public class Array05 {
    public static void main(String[] aaa){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] score = new int[n];
        for(int i =0; i<n; i++){
            score[i] = sc.nextInt();
        }
        Arrays.sort(score);
        int m = score[n-1];

        double avg =0;
        for(int i = 0; i<n; i++){
            avg += (double)score[i]/m*100;
        }
        System.out.println(avg/n);

    }
}
