package level01;

public class Test008 {

	public static void main(String[] args) {
//		¾à¼öÀÇ °³¼ö¿Í µ¡¼À
		int left = 13;
		int right = 17;
		int count =0;
		int answer =0;
		for(int i = left; i<=right; i++) {
			for(int j=1; j<=i; j++) {
				if(i%j ==0) {
					count++;
				}
			}
			if(count%2==0) {
				answer += i;
			}else if(count%2!=0) {
				answer -= i;
			}
			count =0;
		}

	}

}
