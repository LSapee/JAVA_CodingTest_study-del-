package etc;

import java.util.Arrays;

public class CacaoCoding_2017_01 {

	public static void main(String[] args) {
		
		// �Է°�
		A aaa = new A();
		int[] arr1 = aaa.getArr1();
		int[] arr2 = aaa.getArr2();
		int n = aaa.getM();
		// arr1,aar2 �� String �迭�� ����
		String[] arr3 = new String[n];
		String[] arr4 = new String[n];
		// arr3,arr4 �迭 �ɰ���
		String arr5[] = new String[n];
		String arr6[] = new String[n];
		//��¿� �迭
		String[] arr = {};
		arr = new String[n];
		
		//������ 0�� ä��� ���� ���ڿ�
		String a = "";
		//arr�� �ʱ�ȭ
		for(int i=0; i<n; i++) {
			arr[i] = "";
		}
		
//		arr3�� 2������ ��ȯ �� ������ 0�� ä���ֱ�
		for (int i =0; i<arr1.length; i++) {	
			arr3[i] =Integer.toBinaryString(arr1[i]);
			if(arr3[i].length() != n) {
				for(int j = 0; j<n-arr3[i].length(); j++) {
					a += "0";
				}
				arr3[i] = a + arr3[i];
				a = "";
			}

		}
		a="";
//		arr3�� 2������ ��ȯ �� ������ 0�� ä���ֱ�
		for (int i =0; i<arr1.length; i++) {
			arr4[i] = Integer.toBinaryString(arr2[i]);
			if(arr4[i].length() != n) {
				for(int j = 0; j<n-arr4[i].length(); j++) {
					a += "0";
				}
				arr4[i] = a + arr4[i];
				a = "";
			}
		}
		// 0,1 �� ����� #���� ��ȯ
		for (int i =0; i<n; i++) {
			arr3[i] = arr3[i].replace("1", "#");
			arr3[i] = arr3[i].replace("0", " ");
			arr4[i] = arr4[i].replace("1", "#");
			arr4[i] = arr4[i].replace("0", " ");
			
			// arr3�� �迭�� ��ȯ
			if(arr3[i] != arr4[i]) {
				arr5 = arr3[i].split("");
				arr6 = arr4[i].split("");				
			}
			for(int j= 0; j<n; j++) {
				if(!arr5[j].equals("#")) {
					arr5[j] = arr6[j];	
				}

			}
			arr = arr5;
			System.out.println(Arrays.toString(arr)); 
			
		}		
			

	}

}