package level01;

public class Harshad {

	public static void main(String[] args) {
//		하샤드 수 자릿수를 더한 값의로 해당 수가 나눠 지는가.
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
