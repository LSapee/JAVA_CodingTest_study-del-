package level01;

public class MeasureSum {

	public static void main(String[] args) {
		
//		약수의 합
		int n =12;
		int answer =0;
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				answer +=i;
			}
		}
		System.out.println(answer);
	}

}
