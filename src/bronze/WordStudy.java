package bronze;

import java.util.Arrays;
import java.util.Scanner;

public class WordStudy {
    public static void main(String[] aaaaaaaaa){
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        word = word.toUpperCase();

        int count =0;
        int count1 = 0;
        int max = 0;

        char a = ' ';
        char b = ' ';
        char [] sen = word.toCharArray();
        Arrays.sort(sen);

        for(int i=65; i<91; i++){
            a = (char)(i);
            for(int j = 0; j<sen.length; j++){
                if(sen[j] == a){
                    count++;
                }
            }

            if(count>max){
                max = count;
                b =a;
            }else if(count == max){
                count1 = count;
            }
            count =0;
        }
        if(max>count1){
            System.out.println(b);
        }else if(max == count1){
            System.out.println("?");
        }
    }
}
