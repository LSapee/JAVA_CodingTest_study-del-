package level01;

public class NumberAndString {

	public static void main(String[] args) {
//		숫자 문자열과 영단어
		String s;
		
		s = "123one23two";
		
		String[] word = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String[] wordnum = {"0","1","2","3","4","5","6","7","8","9"};
		
		for(int i = 0; i<word.length; i++) {
			s = s.replace(word[i], wordnum[i]);
			
		}
		
	}

}
