package level01;

import java.util.ArrayList;
import java.util.Arrays;

public class Way_you_want {

	public static void main(String[] args) {
		
 		String[] strings = {"abcde","abced","abccc","ewccc","ccccc"};
 		int n = 2; 
 		String[] answer = new String[strings.length];
		
		
		for(int i =0; i<strings.length; i++) {
			answer[i] = strings[i].substring(n,n+1);
		}
		
		Arrays.sort(answer);
		Arrays.sort(strings);
		ArrayList<String> al = new ArrayList<>(Arrays.asList(strings));
		
		
		for(int i=0; i<answer.length; i++) {
			for(int j =0; j<al.size(); j++) {
				if(al.get(j).substring(n,n+1).equals(answer[i])) {
					answer[i] = al.get(j);
					al.remove(j);
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(answer));
		
		
		
	}

}
