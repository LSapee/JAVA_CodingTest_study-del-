package etc;

public class TestString {

	public static void main(String[] args) {
		String s = "     heee adasd";
		for(;;) {
			if(s.contains("  ")) {
				s = s.replaceAll("  "," ");				
			}else {
				break;
			}
		}
		s = s.trim();
		String[] ss = s.split(" ",-1);
		String a = "";
		String[] aa;
		String answer ="";
//		System.out.println(Arrays.toString(ss));
		for(int i =0; i<ss.length; i++) {
			
			a = ss[i].trim();
		
			aa = new String[a.length()];
			aa =a.split("",-1);
			
			for(int j =0; j<aa.length; j++) {
				if(j == 0) {
					answer += aa[j].toUpperCase();
				}else if(j == 1) {
					answer += aa[j].toLowerCase();
				}else if(j%2 == 0) {
					answer += aa[j].toUpperCase();
				}else if(j%2 !=0) {
					answer += aa[j].toLowerCase();
				}
			}
			if(i == ss.length-1) {
				break;
			}else {
				answer += " "; 				
			}
		}
		System.out.println(answer);

	}

}
