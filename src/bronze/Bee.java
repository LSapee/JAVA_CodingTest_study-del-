package bronze;

import java.util.Scanner;

public class Bee {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 1;
        int m = 0;

        for(int i =1; a<n; i++){
            a += i*6;
            m=i;
        }
        System.out.println(m+1);
    }
}
