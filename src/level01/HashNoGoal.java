package level01;

import java.util.Arrays;

public class HashNoGoal {

	public static void main(String[] args) {
//		골인 못한 선수
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		String answer = "";
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i=0; i<completion.length; i++) {
			if(!participant[i].equals(completion[i])) {
				answer = participant[i];
				break;
			}else if(i == completion.length-1) {
				answer = participant[i+1];
			}
			
		}
		System.out.println(answer);

	}

}
