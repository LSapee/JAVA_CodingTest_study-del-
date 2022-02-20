package bronze;

import java.util.Scanner;

public class TDice {
    public static void main(String aa[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int p = 0;

        if(a==b&& b==c){
            p = 10000+(a*1000);
        }else if((a==b&&b!=c) ||(a!=b&&b==c)){
            p = 1000+(b*100);
        }else if((a==c&&b!=c) ||(a!=c&&b==c)){
            p = 1000+(c*100);
        }else if(a>b &&a>c){
            p = a*100;
        }else if(b>a &&b>c){
            p = b*100;
        }else{
            p = c*100;
        }
        System.out.println(p);
    }
}
