package codingTest;

public class NumberDsec {

	public static void main(String[] args) {
		long n =118372;
		String s =Long.toString(n);
		String[] ss = s.split("");
		String[] sss = new String[ss.length];
		int max =0;
		int j =0;
		for(int i =0; i<ss.length; i++) {	
			if(max < Integer.parseInt(ss[i])) {
				max = Integer.parseInt(ss[i]);
			}	
		}

		System.out.println(max);
	}

}
