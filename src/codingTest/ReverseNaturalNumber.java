package codingTest;

public class ReverseNaturalNumber {

	public static void main(String[] args) {
		long n = 12345L;
		int a = (int)Math.log10(n)+1;
		long reverse = n;
		int[] answer = new int[a];
		
		for(int i =0; i<a; i++) {
			answer[i] =(int)(reverse%10);
			reverse = reverse/10;
		}
		
	}

}
