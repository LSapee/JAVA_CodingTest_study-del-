package etc;

public class Square_root {

	public static void main(String[] args) {
		long n =1000000;
		long answer =0;
		int num =0;
		int lang = (int)(Math.log10(n)+1);
		long q = (long)(Math.pow(10, (lang-1)/2));
		System.out.println(q);
		if(n == 1) {
			num = 1;
			answer = (long)(num+1)*(num+1);
		}
		if(n >100000000) {
			for(int i=0; i<n/q; i++) {
				if(i*i == n) {
					num =i;
					answer = (long)(num+1)*(num+1);
					break;
				}else {
					num = -1;
					answer =num;
				}
			}
		}else if(n<=100000000){
			for(int i=0; i<n/2; i++) {
				if(i*i == n) {
					num =i;
					answer = (long)(num+1)*(num+1);
					break;
				}else {
					num = -1;
					answer =num;
				}
			}
		}
		
		
		System.out.println(answer);

	}

}
