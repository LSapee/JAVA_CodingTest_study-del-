package level01;

import java.util.Arrays;

public class XintervalN {

	public static void main(String[] args) {
//		x��ŭ ������ �ִ� n���� ����
//		x ~ x*n���� x������ ���ڵ�
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
