package level01;

public class Harshad {

	public static void main(String[] args) {
//		�ϻ��� �� �ڸ����� ���� ���Ƿ� �ش� ���� ���� ���°�.
		int a = 1234;
		int b = a/1000;
		int c = (a%1000)/100;
		int d = (a%100)/10;
		int e = a%10;
		
		boolean answer = true;
		if(a % (b+c+d+e) ==0) {
			answer = true;
		}else {
			answer = false;
		}
		System.out.println(answer);
	}

}
