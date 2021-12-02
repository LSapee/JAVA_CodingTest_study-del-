package level01;

import java.util.ArrayList;
import java.util.Arrays;

public class NoGoal {

	

	
	public static void main(String[] args) {
//		완주하지 못한 선수
		String[] participant = {
			"leo", "kiki", "eden"
		};
		String[] completion = {"eden", "kiki"};
	
		ArrayList<String> al = new ArrayList<>(Arrays.asList(participant));
		
		for(int i=0; i<completion.length; i++) {
			al.remove(completion[i]);
		}
	
		String answer = "";
		answer = al.get(0);
		
	}

}
