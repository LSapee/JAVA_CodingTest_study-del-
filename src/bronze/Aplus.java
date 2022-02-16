package bronze;

import java.util.Scanner;

public class Aplus {
    public static void main(String [] aa){
        Scanner sc = new Scanner(System.in);

        int t= sc.nextInt();
        int a =0;
        int b = 0;
        for(int i =0; i<t; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a+b);
        }
    }
}
