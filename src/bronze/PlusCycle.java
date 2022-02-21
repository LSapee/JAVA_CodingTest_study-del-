package bronze;

import java.util.Scanner;

public class PlusCycle {
    public static void main(String qq[] ){

        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt();
        if(a<10){
            a = a*10;
        }
        int b = a;
        int c,d = 0;
        int i =0;
        while(1>0){
            c = a/10;
            d = a%10;
            a = c+d + (d*10);
            i++;
            if(a>10){
                a = (d*10) +(a%10);
            }
            if(a==b){
                break;
            }
        }
        System.out.println(i);
    }
}
