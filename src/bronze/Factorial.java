package bronze;

import java.util.Scanner;

public class Factorial {
    public static void main(String a[]){
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        int k =1;
        for(int i =1; i<=n; i++){
            k *= i;
        }
        System.out.println(k);
    }
}
