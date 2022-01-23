package level01;

import java.util.Arrays;

public class SecretMap {
    public static void main(String[] args){
        long beforeTime = System.currentTimeMillis();
        int n = 6;
        int[] arr1 = {46,33,33,22,31,50};
        int[] arr2 = {27,56,19,14,14,10};
        String[] answer = new String[n];

        for(int i =0; i<n; i++) {
            answer[i] = "" +(Long.parseLong(Integer.toBinaryString(arr1[i])) + Long.parseLong(Integer.toBinaryString(arr2[i])));
            if(answer[i].length() <n){
                for(int j =answer[i].length(); j<n; j++){
                    answer[i] = "0" +answer[i];
                }
            }
            answer[i] = answer[i].replace("0" , " ");
            answer[i] = answer[i].replaceAll("[1-2]","#");
        }


        System.out.println(Arrays.toString(answer));
        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime);
        System.out.println("시간차이(ms) : "+secDiffTime);
    }
}
