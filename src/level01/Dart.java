package level01;

import java.util.Arrays;

public class Dart {

	public static void main(String[] args) {
//		다트
		String dartResult = "1S*2T*3S";
		String [] a =dartResult.replaceAll("\\W","").replaceAll("[a-zA-Z]","A").split("A");
		String b = dartResult.replaceAll("[0-9]","");
		String [] bb = b.replaceAll("\\W","").split("");
		String [] c = dartResult.split("");
		String [] cc = {"","",""};


		for(int i =2; i< c.length; i++) {
			if (c[i].equals("*") && i == 2) {
				cc[0] = "*";
			} else if (c[i].equals("#") && i == 2) {
				cc[0] = "#";
			} else if (c[i].equals("*") && i > 2 && i<=5) {
				cc[1] = "*";
			} else if (c[i].equals("#") && i > 2&& i<=5) {
				cc[1] = "#";
			} else if (c[i].equals("*") && i > 5) {
				cc[2] = "*";
			} else if (c[i].equals("#") && i > 5) {
				cc[2] = "#";
			}
		}
		int [] num = new int[3];

		int answer = 0;
		int k =0;
		
//		숫자 +알파벳 까지 계산
		for(int i =0; i<3; i++){
			k =num[i] = Integer.parseInt(a[i]);
			if(bb[i].equals("S")){
				num[i] = k;
			}else if(bb[i].equals("D")){
				num[i] = k*k;
			}else if(bb[i].equals("T")){
				num[i] = k*k*k;
			}
			cc[i] = cc[i].trim();
		}

		for(int i =0; i<3; i++) {
			if (cc[i].equals("*") && i == 0) {
				num[i] = num[i] * 2;
			} else if (cc[i].equals("#") && i == 0) {
				num[i] = num[i] * -1;
			} else if (cc[i].equals("*") && i == 1) {
				num[i-1] = num[i-1] *2;
				num[i] = num[i]*2;
			} else if (cc[i].equals("#") && i == 1) {
				num[i] = num[i] * -1;
			}else if (cc[i].equals("*") && i == 2) {
				num[i-1] = num[i-1] *2;
				num[i] = num[i]*2;
			} else if (cc[i].equals("#") && i == 2) {
				num[i] = num[i] * -1;
			}
		}

		answer = num[0]+num[1]+num[2];

		System.out.println(answer);


	}
}
