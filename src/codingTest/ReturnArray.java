package codingTest;

public class ReturnArray {

	public static void main(String[] args) {
		int[] arr = {5,9,7,10};
		int divisor = 5;
		int[] answer = {};
		int j =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%divisor == 0) {
				j++;
			}
		}
		if(j>0) {
			answer =new int[j];			
		}
		j =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%divisor == 0) {
				answer[j] = arr[i];
				j++;
			}
		}
		
		
		if(j ==0) {
			answer = new int[1];
			answer[0] = -1;
		}
	}

}
