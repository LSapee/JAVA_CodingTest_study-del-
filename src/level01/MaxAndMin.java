package level01;

public class MaxAndMin {

	public static void main(String[] args) {
//		최대 공약수와 최대 공배수 구하기
		int [] answer = {};
		int n =6;
		int m =12;
		
		int a= 0;
		int b = 0;
		for(int i = 1; i<=m; i++ ) {
			if(n%i ==0 && m%i ==0) {
				a =i;
			}
			b = a*(n/a)*(m/a);
		}
		System.out.println(b);

	}

}
