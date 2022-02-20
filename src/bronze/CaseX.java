package bronze;

import java.util.Scanner;

public class CaseX {
    public static void main(String []aa ) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int c;
        int d;

        for (int i = 1; i<=a; i++) {
            c = sc.nextInt();
            d = sc.nextInt();
            System.out.println("Case #" + i + ": " + (c + d));
        }
    }
}
