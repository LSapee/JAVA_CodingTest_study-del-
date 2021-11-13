package level01;

import java.util.Arrays;

public class Caesar {

	public static void main(String[] args) {
		String s = "a B z";
		String answer = "";
		char[] ss = s.toCharArray();
		
		int n = 4;
		int a =0;
		for(int i=0; i<ss.length; i++) {
			if(ss[i] == ' ' ) {
				answer += ' ';
			}else if((int)ss[i] != ' ' ) {
				if((int)ss[i] >= 90 && (int)ss[i] < 97) {
					a = (int)ss[i] +n;
					if(a >90) {
						a = a-26;
					}
					answer += (char)(a);
				}else if((int)ss[i] >=122) {
					a = (int)ss[i] +n;
					if(a >122) {
						a = a-26;
					}
					answer += (char)(a);
				}
			}
		}
		System.out.println(answer);
	}

}
