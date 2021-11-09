package codingTest;

public class TwoNumberSum {

	public static void main(String[] args) {
		int a =3;
		int b =5;
		long answer = 0;
		if(b>a) {
			for(int i =a; i<b; i++) {
				answer += i;
			}
		}else if(a>b){
			for(int i =b; i<a; i++) {
				answer += i;
			}
		}else {
			answer = a+b;
		}
	
		answer +=b;

	}

}
