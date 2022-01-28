package level01;

import java.util.Arrays;
import java.util.stream.IntStream;

public class KeyPad {
    public static void main(String[] args){
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        char line = ' ';
        int[] lefthand = {1,4,7};
        int[] righthand  = {3,6,9};
        int[] center = {2,5,8,0};
        String result ="";
        int n =0;
        int r = 0;
        int l = 0;
        for(int i=0; i<numbers.length; i++){
            int num = i;
            if(IntStream.of(lefthand).anyMatch(x -> x == numbers[num])){
                r= Arrays.binarySearch(lefthand,numbers[i]);
                line = 'l';
                result += "L";
                continue;
            }else if(IntStream.of(righthand).anyMatch(x -> x == numbers[num])){
                l= Arrays.binarySearch(righthand,numbers[i]);
                line = 'r';
                result += "R";
                continue;
            }else if(IntStream.of(center).anyMatch(x -> x == numbers[num])){
               n = Arrays.binarySearch(center,numbers[i]);
            }
            if(hand.equals("right")&& line!='c' && r == l && l == n ){
                r = n;
                line = 'c';
                result += "R";
            }else{
                l = n;
                line = 'c';
                result += "L";
            }


        }
        System.out.println(result);
        System.out.println(result.length());
        System.out.println(line);
    }
}
