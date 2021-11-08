package codingTest;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		자리수
		int m = sc.nextInt();
//		2진수
		String n = sc.next();
//		kk
		int kk = sc.nextInt();
//		2의 kk승
		double k = Math.pow(2,kk);

//		2진수 자리별 숫자 구하기
		String[] nn = n.split("");
//		2진수의 길이 구하기
		int nnum = nn.length;
		
		Long sum =0L;

		
		for(int i =0; i<nnum; i++) {
			double two = Math.pow(2, (nnum-1-i));
			int mk = Integer.parseInt(nn[i]);
			sum += (long)(mk * two);
		}
		System.out.println(sum);
		
		if(sum != 0) {
			if(sum%k == 0) {
				System.out.println("Yes");
			}else if(sum%k != 0){
				System.out.println("NO");
			}
		}else if (Double.isInfinite(k)){
			System.out.println("No");
		}else {
			System.out.println("No");
		}
		
	}

}
