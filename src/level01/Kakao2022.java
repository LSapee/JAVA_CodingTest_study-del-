package level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Kakao2022 {
    public static void main(String[] args){
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k =2;
        int[] answer = new int[id_list.length];

        HashMap reportMap = new HashMap();

        for(int i =0; i< report.length; i++){
            String[] a = report[i].split(" ");
            reportMap.put(a[0],a[1]);
        }
        System.out.println(reportMap.get("muzi"));
        reportMap.

    }
}
