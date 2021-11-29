package level01;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneC {

	public static void main(String[] args) {
		int answer =0;
		int[] nums = {3,1,2,3};
		int a =nums.length/2;
		
		Arrays.sort(nums);
		
		ArrayList<Integer> al = new ArrayList<>();
		for(int i =0; i<nums.length; i++) {
			if(i<nums.length-1) {
				if(nums[i] != nums[i+1]) {
					al.add(nums[i]);
				}
			}else {
				al.add(nums[i]);
			}
		}
		if(a<al.size()) {
			answer = a;
		}else {
			answer = al.size();
		}
	}

}
