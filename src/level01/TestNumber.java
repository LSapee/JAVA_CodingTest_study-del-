package level01;

import java.util.Arrays;
import java.util.Collections;

public class TestNumber {

	public static void main(String[] args) {
		long n = 123441251521L;
		String a = Long.toString(n);
		String[] aa = a.split("");
		Arrays.sort(aa,Collections.reverseOrder());
		a ="";
		for(int i =0; i<aa.length; i++) {
			a += aa[i];
		}
		long answer = Long.valueOf(a);
		System.out.println(answer);
	}

}
