package level01;

public class CenterWord {

	public static void main(String[] args) {
//		��� ���� ��������
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
