package level01;

public class Test007 {

	public static void main(String[] args) {
//		시저암호 통과
		
		String s = "A z";
		String answer ="";
		int n = 2;
		char[] arr = s.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 32) {
				if((arr[i]+n >90 && arr[i]<91)||(arr[i]+n>122&&arr[i]<123) ) {
					arr[i] = (char)((int)arr[i] + n - 26);
					answer += arr[i];
				}else {
					answer += (char)((int)arr[i]+n);
				}
				
			}else {
				answer += " ";
			}			
		}
		System.out.println(answer);

	}

}
