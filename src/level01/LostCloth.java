package level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LostCloth {

	public static void main(String[] args) {
		int n = 10;
		int[] lost = {1,2,3,5,6};
		int[] reserve = {2,3,4,5};
		int answer = n-lost.length;

		Arrays.sort(lost);
		Arrays.sort(reserve);

		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();

		for(int i = 0; i<lost.length; i++){
			al.add(lost[i]);
		}
		for(int i =0; i<reserve.length; i++){
			al2.add(reserve[i]);
		}
		for(int i =0; i<al.size(); i++) {
			for (int j = 0; j < al2.size(); j++) {
				if(al.get(i)==al2.get(j)){
					al.remove(i);
					al2.remove(j);
					answer +=1;
					i=i-1;
				}
			}
		}
		System.out.println(al);
		System.out.println(al2);

		for(int i =0; i<al.size(); i++){
			for(int j=0; j<al2.size(); j++){
				if(al.get(i)+1  == al2.get(j) || al.get(i)-1  == al2.get(j)){
					answer +=1;
					al.remove(i);
					break;
				}
			}
		}

		System.out.println(answer);

//		ArrayList<Integer> all = new ArrayList<>(); 
//		
//		Arrays.sort(lost);
//		Arrays.sort(reserve);
//
//		for(int i =0; i<lost.length; i++) {
//			all.add(lost[i]);
//		}
//		for(int i =0; i<reserve.length; i++) {
//			all.add(reserve[i]);
//		}
//		System.out.println(all);
//		Collections.sort(all);
//
//		for(int i =0; i<all.size()-1; i++) {
//			if(all.get(i) == all.get(i+1)) {
//				all.remove(i);
//				all.remove(i);
//				answer +=1;
//			}
//		}
//		System.out.println(answer);
//		System.out.println(all);
//		for(int i=0; i<all.size()-1; i++) {
//			if(all.get(i)+1 == all.get(i+1)) {
//				answer +=1;
//				all.remove(i);
//				all.remove(i);
//			}
//		}
//		System.out.println(answer);
		
		

//		for(int i =0; i<reserve.length; i++) {
//			if(answer >= n) {
//				answer = n;
//				break;
//			}
//			for(int j =0; j<lost.length; j++) {
//				if(reserve[i] == lost[j]) {
//					answer +=1;
//					break;
//				}else if(reserve[i] == lost[j]-1 ||reserve[i] == lost[j]+1) {
//					answer +=1;
//					break;
//				}
//			}
//		}
		
	}

}
