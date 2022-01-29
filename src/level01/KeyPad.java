package level01;

import java.util.Arrays;
import java.util.stream.IntStream;

public class KeyPad {
    public static void main(String[] args){
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        String answer ="";
        int left = 10;
        int right = 12;

        for(int i =0; i<numbers.length; i++){
            int n =numbers[i];
            if(n==0){
                n=11;
            }
            if(numbers[i] ==1 ||numbers[i] ==4 ||numbers[i] ==7){
                left = numbers[i];
                answer += "L";
            }else if(numbers[i] ==3||numbers[i] ==6||numbers[i] ==9){
                right = numbers[i];
                answer += "R";
            }else{
//                시작이 2,5,8,0일때
                if(hand.equals("left")){
                    left = n;
                    answer += "L";
                }else if(hand.equals("right")){
                    right = n;
                    answer += "R";
                }
            }
        }
        System.out.println(answer);

    }
}
