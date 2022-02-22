package bronze;

import java.util.Arrays;
import java.util.Scanner;

public class FindAlphabet {
    public static void main(String aaaaa[]){
        Scanner sc = new Scanner(System.in);

        String all = sc.nextLine();
        char [] alll = all.toCharArray();
        int[] alphabet = new int[26];
        Arrays.fill(alphabet,-1);
        for(int i =0; i<alll.length; i++){
            int n = all.indexOf(alll[i]);

        }

        System.out.println(Arrays.toString(alll));

    }
}
