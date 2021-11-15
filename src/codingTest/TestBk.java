package codingTest;

import java.util.Scanner;

public class TestBk {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a= sc.nextInt();
		int count = 0;
		while(a !=1){
			if((a-1)%3 == 0) {
				a= a-1;
				count++;
			}else if((a-1)%2 == 0) {
				a= a-1;
				count++;
			}else if(a%3 == 0) {
				a= a/3;
				count++;
				
			}else if(a%2 ==0) {
				a = a/2;
				count++;
				
			}else {
				a = a-1;
				count++;
				
			}
	
        };
		System.out.println(count);
	}

}
