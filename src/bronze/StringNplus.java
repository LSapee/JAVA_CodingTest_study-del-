package bronze;

import java.util.Scanner;

public class StringNplus {
    public static void main(String[] aaaaaaa){
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String all = sc.nextLine();

        String[] number = all.split("");
        int sum = 0;
        for(int i =0; i<n; i++){
            sum += Integer.parseInt(number[i]);
        }

        System.out.println(sum);
    }
}
