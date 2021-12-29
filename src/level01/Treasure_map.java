package level01;

public class Treasure_map {
// 보물지도 하는중
	public static void main(String[] args) {

		int n = 5;
		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };

		String[] a = new String[arr1.length];
		String[] b = new String[arr2.length];
		String[] c = new String[n];
		String[] d = new String[n];
		
		String[] answer = new String[n];
		
//		2진수로 변환
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.toBinaryString(arr1[i]);
			b[i] = Integer.toBinaryString(arr2[i]);
			if (a[i].length() < n) {
				for (;;) {
					a[i] = "0" + a[i];
					if (a[i].length() == n) {
						break;
					}
				}
			}
			if (b[i].length() < n) {
				for (;;) {
					b[i] = "0" + b[i];
					if (b[i].length() == n) {
						break;
					}
				}

			}
			
		}

	}

}
