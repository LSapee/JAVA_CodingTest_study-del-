package level01;

public class NumberSum {

	public static void main(String[] args) {
//		�ڸ��� ���ϱ�
		
		int answer =0;
		
		int n = 123;
		String a = String.valueOf(n);
		String[] aa  = a.split("");
		for(int i=0; i<aa.length; i++) {
			answer += Integer.parseInt(aa[i]);
		}
		
	}

}
