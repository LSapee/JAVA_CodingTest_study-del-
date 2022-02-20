package bronze;

import java.util.Scanner;

public class Ovtime {
    public static void main(String [] as){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        int t = sc.nextInt();

       b = b+t;

       if(b>59){
           for(int i=1; b>59; i++ ){
               b = b-60;
                c=i;
           }
       }
       a = a+c;
       if(a>23){
           a=a-24;
       }
        System.out.println(a +" " + b);
    }
}
