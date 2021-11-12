package level01;

public class PandY {

	public static void main(String[] args) {
		String s = "pPoooyY";
		s =s.toLowerCase();
		int pcount =0;
		int ycount =0;
		boolean answer = true;
		String[] ss = s.split("");
		
		for(int i =0; i<ss.length; i++) {
			if(ss[i].equals("p")) {
				pcount++;
			}else if(ss[i].equals("y")) {
				ycount++;
			}
		}
		if(pcount == ycount) {
			answer = true;
		}else if(pcount != ycount) {
			answer = false;
		}

	}

}
