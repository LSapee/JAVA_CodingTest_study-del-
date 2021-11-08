package codingTest;

import java.util.Scanner;

public class D2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String aa = sc.nextLine();
		
		if(aa.contains("D2") ||aa.contains("d2") ) {
			System.out.println("D2");
		}else {
			System.out.println("unrated");
		}

	}

}
