package codingTest;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysDel {

	public static void main(String[] args) {
		ArrayList<Integer> aa = new ArrayList<>(Arrays.asList(5,2,3,4));
		int[] ab = new int[aa.size()-1];
		int min = aa.get(0);
		int c =0;
		
		for(int i = 0; i<aa.size(); i++) {
			if(min < aa.get(i)) {
				min = min;
			}else if(min > aa.get(i)){
				min = aa.get(i);
				c = i;
			}
		}
		aa.remove(c);
		for(int i=0; i<aa.size(); i++) {
			ab[i] = aa.get(i);
		}
		System.out.println(Arrays.toString(ab));
		
	}

}
