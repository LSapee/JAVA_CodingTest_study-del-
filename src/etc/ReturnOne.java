package etc;

public class ReturnOne {

	public static void main(String[] args) {
//		나머지가 1이 되는수
		int n =10;
		int answer =0;
		
		for(int i =2; i<n; i++ ) {
			if(n%i ==1) {
				answer = i;
				break;
			}
		}
		System.out.println(answer);
	}

}
