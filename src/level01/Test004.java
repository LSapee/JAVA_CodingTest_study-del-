package level01;

public class Test004 {

	public static void main(String[] args) {
//		이상한 문자 만들기
		String s = " try   hello   world  ";
//		s =s.trim().replaceAll(" +", " ");
		String[] a = s.split(" ",-1);
		String answer = "";
		
		for(int i =0; i<a.length; i++) {
			String[] ss =a[i].split("");
			for(int j = 0; j<ss.length; j++) {
				if(j%2 ==0) {
					answer += ss[j].toUpperCase();					
				}else if(j%2 != 0) {
					answer += ss[j].toLowerCase();
				}
			}
			if(i >= a.length-1) {
				break;
			}
			answer += " ";
		}
		System.out.print(answer);
	}

}
