package level01;

import java.util.Arrays;
import java.util.Collections;

public class Test002 {

	public static void main(String[] args) {
//	���ڿ� ������������ ��ġ�ϱ�
		String s ="Zbcdefg";
		String[] ss = s.split("");
		String answer = "";
//		�������� �����ϱ�
		Arrays.sort(ss,Collections.reverseOrder());
		for(int i =0; i<ss.length; i++) {
			answer += ss[i];
		}
		
		

	}

}
