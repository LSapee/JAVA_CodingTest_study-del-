package level01;

public class Test006 {

	public static void main(String[] args) {
		int n =1000000;
		int answer =0;
		int count = 0;
		for(int i =2; i<=n; i++) {
			for(int j =1; j<=i; j++) {
				if(i!=2 && i%2==0) {
					break;
				}
				if(i%j==0) {
					count++;
				}
				if(count >2) {
					break;
				}
			}
			if(count == 2) {
				answer++;
			}
			count=0;
		}
		System.out.println(answer);

	}

}
