package bronze;

import java.util.Scanner;

public class WhileAplusb {
    public static void main(String [] klk){
        Scanner sc = new Scanner(System.in);

        int a;
        int b;

        while(1>0){
            a=sc.nextInt();
            b=sc.nextInt();
            if(a+b ==0){
                break;
            }
            System.out.println(a+b);
        }
    }
}
