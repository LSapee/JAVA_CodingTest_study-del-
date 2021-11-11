package level01;

public class ArrayDeleteLowNumber {

	public static void main(String[] args) {
		
		// 배열에서 가장 작은수 제거하기
		int[] arr = {4,3,2,1 };

		int a = arr.length;
		int[] answer;

		if (arr.length <= 1) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			answer = new int[a - 1];
			int num = 0;
			// 젤 작은수
			int low = arr[0];
			int minIn = 0;
				for (int i = 0; i < a; i++) {
					num = arr[i];
					if (low > num) {
						minIn = i;
					}
				}
				System.out.println(minIn);
				System.out.println();
				for(int j =0; j<minIn; j++) {
					answer[j] = arr[j];
					System.out.println(answer[j]);
				}
				for(int j =minIn; j<a-1; j++) {
					answer[j] = arr[j+1];

				}
				System.out.println();

		}



	}

}
