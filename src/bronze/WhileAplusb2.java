package bronze;

import java.util.Scanner;

public class WhileAplusb2 {
    public static void main(String [] klk){
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        while(sc.hasNextInt()){
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println(a+b);
        }
    }
}
