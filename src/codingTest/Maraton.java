package codingTest;

public class Maraton {

	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		String answer = "";
		String a ="";
		
		for (int i = 0; i<participant.length; i++) {
			for(int j =0; j<completion.length; j++) {
				if(participant[i] != completion[j]) {
					a = participant[i];
					break;
				}
			}
			break;
		}
		System.out.println(a);
//		System.out.println(answer);

	}

}
