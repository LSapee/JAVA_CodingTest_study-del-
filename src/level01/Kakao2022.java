package level01;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Kakao2022 {
    public static void main(String[] args){
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k =2;
        int[] answer = new int[id_list.length];
//        Map 개념 다시 공부 더하기
//     신고자 : 신고당한 사람들
       Map<String, HashSet<String>> reportMember = new HashMap<>(); //Hashset은 중복값을 허용하지 않음
//       신고자 : 받을 메일 갯수
       Map<String, Integer> getMail = new HashMap<>();
//      map에 키값 삽입
       for(String id : id_list){
           getMail.put(id,0);
           reportMember.put(id,new HashSet<>());
       }

        for(String reportUser : report){
            String[] reported = reportUser.split(" ");
            reportMember.get(reported[1]).add(reported[0]);
        }


        for(String key : reportMember.keySet()){
            HashSet<String> repoter = reportMember.get(key);
            if(repoter.size() >=k){
                for(String repoter1 : repoter){
                    Integer getMails = getMail.get(repoter1);
                    getMail.put(repoter1,getMails+1);
                }
            }
        }
        for(int i =0; i< answer.length; i++){
            answer[i] = getMail.get(id_list[i]);
        }

    }
}
