package etc;

public class NoNumberSum {

	public static void main(String[] args) {
//		없는 숫자 더하기
		int[] number= {1,2,3,4,6,7,8,0};
		
		int sum = 45;
		for(int i=0; i<number.length; i++) {
			sum -= number[i];
		}
		System.out.println(sum);

	}

}
