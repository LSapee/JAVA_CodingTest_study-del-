package bronze;

import java.util.Scanner;

public class NPlus {
    public static void main(String[] as){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int k =0;
        for(int i=1; i<=a; i++){
            k +=i;
        }
        System.out.println(k);
    }
}
