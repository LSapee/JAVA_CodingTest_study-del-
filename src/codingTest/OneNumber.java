package codingTest;

public class OneNumber {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7,8};
		int answer =0;
		int num =nums.length;
		int sum =0;
		int count=0;
		
		for(int i =0; i<num-2; i++) {
			for(int j =i+1; j<num-1; j++) {
				for(int k =j+1; k<num; k++) {
					sum += nums[i]+nums[j]+nums[k];
					for(int z=2; z<sum; z++) {
						for(int x=2; x<sum; x++) {
							if(z%x ==0) {
								count++;
							}	
						}
						if(count == 1) {
							if(z == sum) {
								answer += 1;
							}
						}
						count =0;
					}
				
//					for(int z =2; z<=3000; z++) {
//						if(sum%z == 0) {
//							answer++;
//						}
//					}
					sum = 0;
				}
			}
		}
		
		System.out.println(answer);
	}

}
