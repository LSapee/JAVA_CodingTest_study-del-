package level01;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
//		���簢�� ��� ��������
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

	     int i =0;
	        while(i<b) {
	        	i++;
	        	int j = 0;
	        	while(j<a) {
	        		j++;
	        		System.out.print("*");
	        	}
	        	System.out.println();
	        }
	}

}
