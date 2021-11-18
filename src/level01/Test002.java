package level01;

import java.util.Arrays;
import java.util.Collections;

public class Test002 {

	public static void main(String[] args) {
//	문자열 내림차순으로 배치하기
		String s ="Zbcdefg";
		String[] ss = s.split("");
		String answer = "";
//		내림차순 정렬하기
		Arrays.sort(ss,Collections.reverseOrder());
		for(int i =0; i<ss.length; i++) {
			answer += ss[i];
		}
		
		

	}

}
