package level01;

public class Test006 {

	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		String a = "";
		int rnum =0;
		int lnum = 0;
		int ln;
		int rn;
		if(hand.equals("right")) {
			for(int i =0; i<numbers.length; i++) {
				if(numbers[i] == 1||numbers[i] == 4||numbers[i] == 7) {
					lnum = numbers[i];
					System.out.print("l");
				}else if(numbers[i] == 3||numbers[i] == 6||numbers[i] == 9) {
					rnum = numbers[i];
					System.out.print("r");
				}else {
					ln = numbers[i] - lnum;
					ln = Math.abs(ln);
					rn = numbers[i] - rnum;
					rn = Math.abs(rn);
					if(ln>rn) {
						System.out.print("r");
					}else if(ln<rn) {
						System.out.print("l");
					}else {
						System.out.println("r");
					}
				}
			}
		}else {
			for(int i =0; i<numbers.length; i++) {
				if(numbers[i] == 1||numbers[i] == 4||numbers[i] == 7) {
					System.out.print("l");
				}else if(numbers[i] == 3||numbers[i] == 6||numbers[i] == 9) {
					System.out.print("r");
				}else {
					
				}
			}
		}
//		³¡ºÎºÐ
	}

}
