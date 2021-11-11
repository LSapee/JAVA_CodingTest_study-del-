package codingTest;

import java.util.ArrayList;
import java.util.Arrays;

public class LowArrayDel {

	public static void main(String[] args) {
		int[] arr = {1};
		ArrayList<Integer> ar = new ArrayList<>(Arrays.asList());
		int min =arr[0];
		int c = 0;
		int[] answer;
		
		for(int i=0; i<arr.length; i++) {
			ar.add(arr[i]);
		}

		if(arr.length <= 1) {
			answer = new int[1];
			answer[0] = -1;
//			System.out.println(Arrays.toString(answer));
		}else {
			answer =new int[arr.length-1];
			for(int i=0; i<arr.length; i++) {
				if(min > arr[i]) {
					min = arr[i];
					c = i;
				}else if(min < arr[i]) {
					min = min;
				}
			}
			ar.remove(c);
			for(int i =0; i<ar.size(); i++) {
				answer[i] = ar.get(i);
			}
			System.out.println(Arrays.toString(answer));
			
		}
	}

}
