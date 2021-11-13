package codingTest;

import java.util.Arrays;
import java.util.Scanner;

public class Alpa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int max =0;
		String[] ss = new String[a];
		for(int i =0; i<a; i++) {
			ss[i] = sc.next();
		}
		Arrays.sort(ss);
		String[] resultArr = Arrays.stream(ss).distinct().toArray(String[]::new);
		Arrays.sort(resultArr, (s1, s2) -> s1.length() - s2.length());
		for(int i =0; i<resultArr.length; i++) {
			System.out.println(resultArr[i]);
		}
	}

}
