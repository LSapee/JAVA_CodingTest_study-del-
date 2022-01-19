package level02;

import java.util.Arrays;

public class Least_Commmon_Multiple {
    public static void main(String[] args){
        int[] arr = {3,4,5,10,20};
        int k =1;
        int answer = 1;
        int count = 0;
        for(int i =0; i<arr.length; i++){
            for(int j =2; j<50; j++){
                if(arr[i]%j == 0 && arr[i] !=j){
                    k=j;
                    count++;
                    arr[i] = arr[i]/j;
                }
                if(count >1 && i == arr.length-1){
                    count = 0;
                    break;
                }
            }
            answer *=k;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(answer);
    }
}
