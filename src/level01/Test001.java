package level01;

public class Test001 {

	public static void main(String[] args) {
//		정수 제곱근 판별 (통과)
		long n = 121;
		long answer = 0;
		long k = 0;
		for (long i = 1; i <= n; i++) {
			k = i * i;
			if (k == n) {
				answer = (i + 1) * (i + 1);
				break;
			} else if (n < k) {
				answer = -1;
				break;
			}
		}

	}

}
