package bronze;

import java.util.Scanner;

public class Star2 {
    public static void main(String[]aa){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i =1; i<=a; i++){
            for(int j=0; j<a-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
