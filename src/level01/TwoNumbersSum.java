package level01;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoNumbersSum {
// 2개 뽑아서 더하기
	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();
		
		for(int i=0; i<numbers.length-1; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				al.add(numbers[i] + numbers[j]);
			}
		}
		 for(int item : al){
	            if(!al2.contains(item))
	                al2.add(item);
	        }
		 int[] answer = new int[al2.size()];
		for(int i =0; i<al2.size(); i++) {
			answer[i] = al2.get(i);
		}
		Arrays.sort(answer);
	}

}
