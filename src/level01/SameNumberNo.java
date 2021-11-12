package level01;

import java.util.ArrayList;
import java.util.Arrays;

public class SameNumberNo {

	public static void main(String[] args) {
		
//		같은 숫자는 싫어
		int[] arr = {1,2,3,3,2,1};
		ArrayList<Integer> aa = new ArrayList<>();
		
		for(int i = 0; i<arr.length; i++) {
			if(i == 0 ) {
				aa.add(arr[i]);
			}else if(i>=arr.length) {
				
			}else if(i<arr.length) {
				if(arr[i-1] != arr[i]) {
					aa.add(arr[i]);
				}
			}
		}
		System.out.println(aa);
		int[] answer = new int[aa.size()];
		for(int i =0; i<aa.size(); i++) {
			answer[i] = aa.get(i);
		}
		System.out.println(Arrays.toString(answer));
	}
	

}
