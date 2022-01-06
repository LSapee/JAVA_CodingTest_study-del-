package etc;

import java.util.Arrays;

public class CacaoCoding_2017_01 {

	public static void main(String[] args) {
		
		// 입력값
		A aaa = new A();
		int[] arr1 = aaa.getArr1();
		int[] arr2 = aaa.getArr2();
		int n = aaa.getM();
		// arr1,aar2 값 String 배열로 변경
		String[] arr3 = new String[n];
		String[] arr4 = new String[n];
		// arr3,arr4 배열 쪼개기
		String arr5[] = new String[n];
		String arr6[] = new String[n];
		//출력용 배열
		String[] arr = {};
		arr = new String[n];
		
		//부족한 0을 채우기 위한 문자열
		String a = "";
		//arr값 초기화
		for(int i=0; i<n; i++) {
			arr[i] = "";
		}
		
//		arr3를 2진수로 변환 및 부족한 0을 채워주기
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
//		arr3를 2진수로 변환 및 부족한 0을 채워주기
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
		// 0,1 을 공백과 #으로 변환
		for (int i =0; i<n; i++) {
			arr3[i] = arr3[i].replace("1", "#");
			arr3[i] = arr3[i].replace("0", " ");
			arr4[i] = arr4[i].replace("1", "#");
			arr4[i] = arr4[i].replace("0", " ");
			
			// arr3를 배열로 변환
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