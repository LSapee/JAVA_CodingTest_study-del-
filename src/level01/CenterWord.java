package level01;

public class CenterWord {

	public static void main(String[] args) {
//		가운데 글자 가져오기
		String s = "abcd";
		String answer = "";
		int b = s.length();
		int a = b/2;
		if(b%2 == 0) {
			answer = s.substring(a-1, a+1);
		}else if(b%2 !=0) {
			answer = s.substring(a, a+1);
		}
		System.out.println(answer);
	}

}
