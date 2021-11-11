package codingTest;

import java.util.Scanner;

public class Turret {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Tnum = sc.nextInt();
		
		for(int i =0; i<Tnum; i++) {
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int r1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int r2 = sc.nextInt();
		int x =  (int)Math.pow(x2-x1 ,2);
		int y =  (int)Math.pow(y2-y1 ,2);
		int r = (int)Math.pow(r2+r1 ,2);
		int c =0;

		if(x1 == x2 && y1==y2&&r1==r2) {
			c =-1;
		}else if(x+y ==r) {
			c =1;
		}else if(x+y > r ) {
			c=2;
		}else if(x+y < r) {
			c=0;
		}
		
		System.out.println(c);
		}
	}

}