package level01;

public class StringBa {

	public static void main(String[] args) {
		String s ="abc";
		boolean  answer = false;
		if(s.length() == 4 || s.length() == 6) {
			answer = true;
		}
		int a= 0;
		try {
			a = Integer.parseInt(s);
			
		}catch(Exception e) {
			answer = false;
		}

	}

}
