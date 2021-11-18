package level02;

public class Test002 {

	public static void main(String[] args) {
//		숫자의 표현
		int n =15;
		int sum =0;
		int answer =0;
		for(int i =1; i<n; i++ ) {
			sum += i;
			for(int j =i+1; j<=n; j++) {
				sum += j;
				if(sum == n) {
					answer++;
					sum =0; 
					break;
				}else if(sum >n) {
					sum =0;
					break;
				}
			}
		}
		System.out.println(answer+1);
	}

}
