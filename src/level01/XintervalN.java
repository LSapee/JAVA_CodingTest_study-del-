package level01;

import java.util.Arrays;

public class XintervalN {

	public static void main(String[] args) {
//		x만큼 간격이 있는 n개의 숫자
//		x ~ x*n까지 x간격의 숫자들
		int x = 2;
		int n =5;
		Long xx = Long.valueOf(x);
        
        long[] answer = new long[n];
        	for (int i = 0; i<n; i++) {
			answer[i] = xx*(i+1);
	
		}
        
      System.out.println(Arrays.toString(answer));
	}

}
