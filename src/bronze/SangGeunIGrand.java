package bronze;

import java.util.Scanner;

public class SangGeunIGrand {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        char[] word = sc.nextLine().toCharArray();
        int[] number = new int[word.length];
        int a= 0;
        int sum =0;

        for(int i=0; i<word.length; i++){
            a = (int)word[i];
            if(a<68){
                number[i] = 2;
            }else if(a<71){
                number[i] = 3;
            }else if(a<74){
                number[i] = 4;
            }else if(a<77){
                number[i] = 5;
            }else if(a<80){
                number[i] = 6;
            }else if(a<84){
                number[i] = 7;
            }else if(a<87){
                number[i] = 8;
            }else if(a<91){
                number[i] = 9;
            }else{
                number[i] = 0;
            }
        }

        for(int i =0; i<number.length; i++){
            sum += number[i]+1;
        }
        System.out.println(sum);
    }
}
