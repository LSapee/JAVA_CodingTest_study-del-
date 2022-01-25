package level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Kakao2022 {
    public static void main(String[] args){
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k =2;
        int count = 0;
        int[] answer = new int[id_list.length];
//        중복제거 report
        HashSet<String> reportMember = new HashSet<>();
        ArrayList<String> reportMembers = new ArrayList<>();

        for(String item : report){
            if(!reportMember.contains(item)){
                reportMember.add(item);
            }
        }
        reportMembers.addAll(reportMember);
        System.out.println(reportMembers);
//      정지당한 아이디 구하기
        ArrayList<String> reportedaccount = new ArrayList<>();
        for(int i =0; i<id_list.length; i++){
            for(int j = 0; j< reportMembers.size();j++){
                if(reportMembers.get(j).contains(" "+id_list[i])){
                    reportedaccount.add(id_list[i]);
                }
            }
            count = 0;
        }
        System.out.println(reportedaccount);

        ArrayList<String> stopaccount = new ArrayList<>();
        for(int i =0; i<id_list.length; i++){
            if(Collections.frequency(reportedaccount,id_list[i])==k){
                stopaccount.add(id_list[i]);
            }
        }
        System.out.println(stopaccount);

        ArrayList<String> stoplist = new ArrayList<>();
        for(int i =0; i< stopaccount.size(); i++){
            for(int j = 0; j<reportMembers.size(); j++){
                if(reportMembers.get(j).contains(" "+stopaccount.get(i))){
                    stoplist.add(reportMembers.get(j));
                }
            }
        }
        System.out.println(stoplist);

        for(int i =0; i< id_list.length; i++){
            for(int j=0; j< stoplist.size(); j++){
                if(stoplist.get(j).contains(id_list[i]+" ")){
                    answer[i] += 1;
                }
            }
        }

        System.out.println(Arrays.toString(answer));
    }
}
