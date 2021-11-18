package level01;

public class Test007 {

	public static void main(String[] args) {
		int[] nums = {1,2,7,6,4};
		int answer =-1;
		int count =0;
		int num =0;
		for(int i=0; i<nums.length-2; i++) {
			for(int j =i+1; j<nums.length-1; j++) {
				for(int k=j+1; k<nums.length; k++) {
					num = nums[i] +nums[j] +nums[k];
					if(num == 2||num == 3||num == 5||num == 7) {
						count++;
						break;
					}else if(num>10 && num%2!=0 &&num%3!=0&&num%5!=0&&num%7!=0) {
						count++;
						break;
					}
					
				}
			}
		}
		System.out.println(count);
	}

}
