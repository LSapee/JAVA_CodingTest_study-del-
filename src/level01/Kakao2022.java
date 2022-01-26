package level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Kakao2022 {
    public static void main(String[] args){
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k =2;
        int count = 0;
        int[] answer = new int[id_list.length];

        //        중복제거 report
        Arrays.sort(report);
        ArrayList<String> reportMember = new ArrayList<>(Arrays.asList(report));
        ArrayList<String> stopMember = new ArrayList<>(Arrays.asList(report));

        for(int i =0; i< reportMember.size()-1; i++){
            if(reportMember.get(i).equals(reportMember.get(i+1))){
                reportMember.remove(i);
            }
        }
        System.out.println(reportMember);
//      정지당한 아이디 구하기
        for(int i =0; i<id_list.length; i++){
            for(int j = 0; j< reportMember.size(); j++){
                if(reportMember.get(j).contains(" "+id_list[i])){
                   reportMember.set(j,reportMember.get(j).replace(id_list[i]+" ",""));
                }
            }
        }
        System.out.println(reportMember);
        Collections.sort(reportMember);
            for(int j = 0; j< reportMember.size()-1; j++){
                if(reportMember.get(j).equals(reportMember.get(j+1))){
                    count++;
                }
                if(count == k){
                    stopMember.add(reportMember.get(j));
                    count =0;
                }
            }

        System.out.println(stopMember);

        System.out.println(Arrays.toString(answer));
    }
}
