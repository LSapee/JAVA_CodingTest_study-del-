package level01;

public class Dart {

	public static void main(String[] args) {
//		다트 아직 완성못함
		String dartResult = "1S2D#3T";
		
		int len = dartResult.length();
		int n = dartResult.indexOf("*");
		int n2 = dartResult.indexOf("#");
		String[] a = dartResult.split("");
		int answer = 0;
		switch(len){
		case 6: 
			for(int i =1; i<len; i=i+2) {
				if(a[i].equals("S")) {
					answer += Integer.parseInt(a[i-1]); 
				}else if(a[i].equals("D")) {
					answer += Integer.parseInt(a[i-1])*Integer.parseInt(a[i-1]); 
				}else {
					answer += Integer.parseInt(a[i-1])*Integer.parseInt(a[i-1])*Integer.parseInt(a[i-1]);
				}
			}
			break;
		case 7:
			for(int i=0; i<len; i++) {
				try {
				if(Integer.parseInt(a[i])>=1) {
					System.out.println(i);
				}
				}catch(NumberFormatException e) {
					
				}
			}

			break;
		case 8:
			for(int i=1; i<len; i=i+2) {
				if(i == n-1 || i == n2-1) {
					i = i+1;
				}
				System.out.println(a[i]);
			}
			break;
		case 9:
			break;
		}
		System.out.println(answer);
	}
	

}
