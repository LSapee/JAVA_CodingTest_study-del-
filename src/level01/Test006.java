package level01;

public class Test006 {

	public static void main(String[] args) {
//	소수 찾기
		int n =1000000;
		int count =0;
		int answer = 0;
		for(int i=2; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				if(i>10&& i%2 !=0 &&i%3 !=0 &&i%5 != 0&&i%7 !=0) {
					count++;			
				}
				else if(i%j ==0) {
					count++;
				}
				if(count >2) {
					break;
				}
			}
			if(count ==2) {
				answer++;
			}
			
			count =0;
		}
		
		System.out.println(answer);
		
		
		
//		int count =0;
//		for(int i =2; i<=n; i++) {
//			if(i == 2 ||i ==3 || i==5|| i==7) {
//				count++;
//			}
//			if(i%2 !=0 &&i%3 !=0 &&i%5 != 0&&i%7 !=0) {
//				count++;			
//			}
//			
//		}

	}

}
