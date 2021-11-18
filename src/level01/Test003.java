package level01;

import java.util.ArrayList;
import java.util.Arrays;

public class Test003 {

	public static void main(String[] args) {
//		나누어 떨어지는 숫자 배열  (통과)
		int[] arr = {5,9,7,10};
		int divisor =5;
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%divisor == 0) {
				al.add(arr[i]);
			}
		}
		int[] answer;
		if(al.size() > 0) {
			answer = new int[al.size()];
		for(int i=0; i<al.size(); i++) {
			answer[i] = al.get(i);
		}
		Arrays.sort(answer);
		}else {
			answer =new int[1];
			answer[0] =-1;
		}
	}

}
