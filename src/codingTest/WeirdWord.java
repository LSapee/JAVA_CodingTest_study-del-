package codingTest;

import java.util.Arrays;

public class WeirdWord {

	public static void main(String[] args) {
		String s ="try hello world";
		String[] a = s.split(" ");
		String[] b;
		String c ="";
		int k =0;
		for(int i=0; i<a.length; i++) {
			k =a[i].length();
			b = new String[k];
			c= "";
			for(int j =0; j<k; j++) {

				if(j == 0) {
					c += b[j].toUpperCase();
				}else if(i == 1) {
					c += b[j];
				}else if(i%2 == 0) {
					c += b[j].toUpperCase();
				}else {
					c += b[j];
				}
				
			}
			a[i] = c;
		}
		System.out.println(Arrays.toString(a));
	}

}
