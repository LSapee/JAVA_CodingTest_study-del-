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

		System.out.println("�迭ũ���Է�");
		int n = sc.nextInt(); // �迭ũ��

		System.out.println("�迭1�Է�");
		for (int i = 0; i < n; i++) { // �迭1 �Է¹ޱ�
			int x = sc.nextInt();

			String temp = String.format("%16s", Integer.toBinaryString(x)).replace(" ", "0");
			// 16�ڸ� 2������ �̾Ƴ���. �̶� ��ĭ�� ����0����ä��������.
			int trash_len = temp.length() - n; // ������� ���̸� ���
			arr1.add(temp.substring(trash_len, temp.length())); // ó������ ������°�����
																// �ڸ��� ����

		}

		System.out.println("�迭2�Է�");
		for (int i = 0; i < n; i++) { // �迭1 �Է¹ޱ�
			int x = sc.nextInt();
			String temp = String.format("%16s", Integer.toBinaryString(x)).replace(" ", "0");
			// 16�ڸ� 2������ �̾Ƴ���. �̶� ��ĭ�� ����0����ä��������.
			int trash_len = temp.length() - n; // ������� ���̸� ���
			arr2.add(temp.substring(trash_len, temp.length())); // ó������ ������°�����
																// �ڸ��� ����
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

		// �ʱ�ȭ

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

		// 2���� �ɰ��� �迭���ֱ�

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (array1[i][j].equals("1") || array2[i][j].equals("1")) {
					array3[i][j] = "1";
				} else if (array1[i][j].equals(array2[i][j]) && array1[i][j].equals("0")) {
					array3[i][j] = "0";
				}
			}
		}

		// �迭2�� ���ؼ� �ɰ��� ��ġ��(2���Ǿ� Ʈ��)

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
			// System.out.print(Arrays.toString(array3[i])); //��� �����������
		}

		System.out.print("]");
		// ���

	}

}
