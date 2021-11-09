package codingTest;

import java.util.Arrays;

public class GiveUpMath {

	public static void main(String[] args) {
		int[] answers = {1,3,2,4,2};
		int n = answers.length;
		int[] one = new int[n];
		int[] two = new int[n];
		int[] twoo = {1,3,4,5};
		int[] three = new int[n];
		int[] threee = {3,3,1,1,2,2,4,4,5,5};
		
		
		int a =0;
		int b=0;
		int c = 0;
		
		int count =0;
		int i = 1;
//		첫 수포자
		for(;;) {
			if(count >= n){
				count =0;
				i =0;
				break;
			}
			if(i>5) {
				i=1;
			}
			one[count] = i;
			i++;
			count++;
		}
//		두번째 수포자
		for(;;) {
			if(count >= n){
				count =0;
				i =0;
				break;
			}
			if(i>3) {
				i=0;
			}
			if(count ==0) {
				two[count] = 2;								
			}else if(count == 1) {
				two[count] = 1;
				i++;
			}else if(count%2 ==0) {
				two[count] = 2;				
			}else {
				two[count] = twoo[i];
				i++;
				
			}
			
			count++;
		}
//		세번째 수포자
		for(;;) {
			if(count >= n){
				count =0;
				i =0;
				break;
			}
			if(i>=10) {
				i=0;
			}
			three[count] = threee[i];
			i++;
			count++;
		}
//		맞은 문제수 구하기
		for(int j =0; j<n; j++) {
			if(one[j] == answers[j]) {
				a++;
			}
			if(two[j] == answers[j]) {
				b++;
			}
			if(three[j] == answers[j]) {
				c++;
			}
			
		}
//		리턴
		int[] answer;
		if(a == b &&a == c) {
		answer = new int[] {1,2,3};
		}else if(a==b && a>c) {
		answer = new int[] {1,2};
		}else if(a==c && a>b) {
			answer = new int[] {1,3};
		}else if(b>a && b==c) {
			answer = new int[] {2,3};
		}else if(a>b && a>c ) {
			answer = new int[] {1};
		}else if(b>a && b>c) {
			answer = new int[] {2};
		}else if(c>a && c>a) {
			answer = new int[] {3};
		}else {
			answer = new int[] {};
		}
		System.out.println(Arrays.toString(answer));
	}

}
