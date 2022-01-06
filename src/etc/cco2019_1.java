package etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class cco2019_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arr1 = new ArrayList<String>();
		List<String> arr2 = new ArrayList<String>();
		List<String> arr3 = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);

		System.out.println("배열크기입력");
		int n = sc.nextInt(); // 배열크기

		System.out.println("배열1입력");
		for (int i = 0; i < n; i++) { // 배열1 입력받기
			int x = sc.nextInt();

			String temp = String.format("%16s", Integer.toBinaryString(x)).replace(" ", "0");
			// 16자리 2진수로 뽑아낸다. 이때 앞칸은 전부0으로채워저있음.
			int trash_len = temp.length() - n; // 쓸모없는 길이를 계산
			arr1.add(temp.substring(trash_len, temp.length())); // 처음부터 쓸모없는곳까진
																// 자른후 저장

		}

		System.out.println("배열2입력");
		for (int i = 0; i < n; i++) { // 배열1 입력받기
			int x = sc.nextInt();
			String temp = String.format("%16s", Integer.toBinaryString(x)).replace(" ", "0");
			// 16자리 2진수로 뽑아낸다. 이때 앞칸은 전부0으로채워저있음.
			int trash_len = temp.length() - n; // 쓸모없는 길이를 계산
			arr2.add(temp.substring(trash_len, temp.length())); // 처음부터 쓸모없는곳까진
																// 자른후 저장
		}

		String[][] array1 = new String[n][n];
		String[][] array2 = new String[n][n];
		String[][] array3 = new String[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				array1[i][j] = "0";

			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				array2[i][j] = "0";

			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				array3[i][j] = "0";

			}
		}

		// 초기화

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				String tmp = arr1.get(i);
				int len = arr1.get(i).length();

				if (len > j) {
					array1[i][j] = tmp.substring(j, j + 1);

				}

			}

		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(array1[i][j]);
			}
			System.out.print(" ");
		}
		System.out.println();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				String tmp = arr2.get(i);
				int len = arr2.get(i).length();

				if (len > j) {
					array2[i][j] = tmp.substring(j, j + 1);
				}

			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(array2[i][j]);
			}
			System.out.print(" ");
		}
		System.out.println();

		// 2진수 쪼개서 배열에넣기

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (array1[i][j].equals("1") || array2[i][j].equals("1")) {
					array3[i][j] = "1";
				} else if (array1[i][j].equals(array2[i][j]) && array1[i][j].equals("0")) {
					array3[i][j] = "0";
				}
			}
		}

		// 배열2개 비교해서 쪼갠거 합치기(2가되야 트루)

		System.out.print("[");
		for (int i = 0; i < n; i++) {
			System.out.print("\"");
			for (int j = 0; j < n; j++) {
				if (array3[i][j].equals("1")) {
					array3[i][j] = "#";
				} else {
					array3[i][j] = " ";
				}
				System.out.print(array3[i][j]);
			}

			System.out.print("\"");

			if (n - 1 != i) {
				System.out.print(",");
			}
			// System.out.print(Arrays.toString(array3[i])); //출력 깔끔하지않음
		}

		System.out.print("]");
		// 출력

	}

}
