package level01;

import java.util.ArrayList;

public class EachNumberNo {

	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 0; i<arr.length; i++) {
			if(i==0) {
				al.add(i, arr[i]);				
			}else if(i>0) {
				if(arr[i] == arr[i-1]) {
				}else if(arr[i] != arr[i-1]) {
					al.add(i, arr[i]);			
				}
			}
			
		}
//		int s = al.size();
//		int[] answer = new int[s];
//		for(int i=0; i<s; i++) {
//			answer[i] = al.get(i);
//		}
		
	}

}
