package bronze;

import java.util.Scanner;

public class CaseX2 {
    public static void main(String []aa ) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int c;
        int d;

        for (int i = 1; i<=a; i++) {
            c = sc.nextInt();
            d = sc.nextInt();
            System.out.printf("Case #%d: %d + %d = %d%n",i,c,d,c+d);
        }
    }
}
