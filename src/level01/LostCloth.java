package level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LostCloth {

	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {1,3,5};
		int answer = n-lost.length;
		
		
		
		for(int i =0; i<reserve.length; i++) {
		if(answer >= n) {
			answer = n;
			break;
		}
		for(int j =0; j<lost.length; j++) {
			if(reserve[i] == lost[j]) {
				answer +=1;
				break;
			}else if(reserve[i] == lost[j]-1 ||reserve[i] == lost[j]+1) {
				answer +=1;
				break;
			}
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
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
