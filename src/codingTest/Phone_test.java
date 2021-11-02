package codingTest;

public class Phone_test {

	public static void main(String[] args) {
		int[] phone = {1,3,4,5,8,2,1,4,5,9,5};
		String hand = "right";
		int ab= 0;
		int ac= 0;
		String answer = "";
		
		for(int i =0 ; i<phone.length; i++) {
			if(phone[i] == 1 ||phone[i] == 4 ||phone[i] == 7) {
				answer += "L";
				ab = phone[i];
			}else if(phone[i] == 3 || phone[i] == 6 || phone[i] == 9) {
				answer += "R";
				ac =phone[i];
			}else if(phone[i] == 2||phone[i] == 5||phone[i] == 8||phone[i] == 0) {
				if(hand == "right") {
					if(Math.abs(phone[i]-ab) >= Math.abs(phone[i] -ac)) {
						answer += "R";
					}else if (Math.abs(phone[i]-ab) < Math.abs(phone[i] -ac)) {
						answer += "L";
					}
				}
				if(hand == "left") {
					if(Math.abs(phone[i]-ac) >= Math.abs(phone[i]-ab)) {
						answer += "L";
					}else if (Math.abs(phone[i]-ac) < Math.abs(phone[i]-ab)) {
						answer += "R";
					}	
			}
		}
		}
		System.out.println(answer);
	}

}
