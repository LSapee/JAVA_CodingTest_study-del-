package bronze;

import java.util.Scanner;

public class Array03 {
    public static void main(String[] aaa){
        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        String d = (a*b*c)+"";
        String[] ar = d.split("");

        int count =0;

        int[] arr = new int[ar.length];
        for(int i =0; i<ar.length; i++){
            arr[i] = Integer.parseInt(ar[i]);
        }
        for(int i =0; i<10; i++){
            for(int j=0; j<arr.length;j++){
                if(i == arr[j]){
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }
    }
}
