package level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test009 {

	public static void main(String[] args) {
//	3진법 뒤집기 (통과)
		int n = 125;
		int re =0;
		String a ="";
		int answer =0;
		ArrayList<Integer> al = new ArrayList<>();
//		3진법으로 만들기
		for(int i=3; i<=n; i=i*3) {
			al.add(i);
		}
		
		al.sort(Collections.reverseOrder());
		for(int i=0; i<al.size(); i++) {
			if(n >= al.get(i)*2 && n<al.get(i)*3) {
				a += "2";
				n = n-(al.get(i)*2);
			}else if(n>= al.get(i) && n<al.get(i)*2) {
				a += "1";
				n = n-(al.get(i));
			}else if(n<al.get(i)) {
				a +="0";
			}
		}

//		3진법 완성
		a = a+n;
		System.out.println(a);
		String[] s =a.split("");
		int k =a.length();
		int[] reverse = new int[k];
		k= k-1;
//		3진법 뒤집기
		for(int i =0; i<a.length(); i++) {
			reverse[i] = Integer.parseInt(s[k-i]);
		}
//		합계변수
		int sum =0;
//		합치기
		for(int i =0; i<reverse.length; i++) {
			if(i == reverse.length-1) {
				break;
			}
			sum += reverse[i]*al.get(i);
			System.out.println(sum);
		}
//		마지막 1의 자리 더해주기
		sum = sum+reverse[reverse.length-1];
	}

}
