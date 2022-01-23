package level01;

import java.util.ArrayList;
import java.util.Collections;

public class Test010 {
    public static void main(String[] args){

        
//        다시 해보기
//        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
//        int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int[][] sizes = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
        int h= 0;
        int w = 0;
        int k =0;
        int answer = 0;

        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0; i<sizes.length; i++){
            for(int j = 0; j<sizes[0].length; j++){
                al.add(sizes[i][j]);
            }
        }
        Collections.sort(al);
        for(int i=0; i<sizes.length; i++){
            if(al.get(al.size()-1) == sizes[i][1]){
                h = al.get(al.size()-1);
                k=i;
                w=0;
                break;
            }else{
                w = al.get(al.size()-1);
                k=i;
            }
        }
        System.out.println("h =" +h);
        System.out.println("w = "+w);
        System.out.println(k);
//        가로길이는 구해져 있을 때
        if(h!=0){
            for(int i=0; i<sizes.length; i++){
                if(w<sizes[i][0] && sizes[k][0] <= sizes[i][1] && sizes[k][1] <= sizes[i][1]){
                    w = sizes[i][0];
                }
            }
        }else{
            for(int i=0; i<sizes.length; i++){
                if(h<sizes[i][1] && sizes[k][1] <sizes[i][0]&& sizes[k][1] <sizes[i][1]){
                    h = sizes[i][1];
                }
            }
        }
        if(h == 0){
            h = sizes[k][1];
        }
        if(w == 0){
            w = sizes[k][0];
        }
        answer = w*h;
        System.out.println(answer);
    }
}
