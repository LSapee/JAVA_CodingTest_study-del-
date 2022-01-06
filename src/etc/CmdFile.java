package etc;

import java.util.Scanner;

public class CmdFile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		숫자 입력받기
		int n = sc.nextInt();
//		파일갯수 배열로 받기
		String[] a = new String[n];
//		숫자많큼 입력받기
		for(int i = 0; i<n; i++) {
			a[i] = sc.next(); 
		}
//		비교대상 1번 선정
		String[] b = a[0].split("");
//		비교대상 2번 이후
		String[] c = new String[b.length];
		
		
//		문자열만큼 비교
		for(int j =0; j<n; j++) {
			c = a[j].split("");
			for(int i =0; i<b.length; i++) {
				if(i >= b.length){
					break;
				}else if(i <b.length) {
					if(!b[i].equals(c[i])) {
						b[i] ="?";
					}
				}
			}
		}
		for(int i =0; i<b.length; i++) {
			System.out.print(b[i]);
		}
	}

}
