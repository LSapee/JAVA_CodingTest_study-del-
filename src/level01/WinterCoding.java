package level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WinterCoding {
//        �Ҽ� ���ϱ� �����佺�׳׽��� ü static
        static boolean prime[] = new boolean[3001];

    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        int answer= 0;
        int n = 3000;
        ArrayList<Integer> al = new ArrayList<>();

//        1�� �Ҽ�X ����
        prime[0] = prime[1] = true;

//
        for(int i =2; i*i<=n; i++){
//          prime[i]�� �Ҽ����
            if(!prime[i]){
//          prime[i]�� �Ҽ��� �ƴ� ��
                for(int j = i*i; j<=n; j+=i) prime[j] =true;
            }
        }

//        3���� ���� ��ġ��
        for(int i=0; i<nums.length-2; i++){
            for(int j= i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    al.add(nums[i]+nums[j]+nums[k]);
                }
            }
        }

//�Ҽ��Ǻ��ϱ�
        for(int i =0; i<al.size(); i++){
            for(int j =2; j<=n; j++){
                if(!prime[j]){
                    if(al.get(i) == j){
                        answer +=1;
                        break;
                    }
                }
                if(j>al.get(i)){
                    break;
                }


            }
        }
    System.out.println(answer);
    }
}
