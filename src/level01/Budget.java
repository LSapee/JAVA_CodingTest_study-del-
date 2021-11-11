package level01;

import java.util.Arrays;

public class Budget {

	public static void main(String[] args) {
//		¿¹»ê
		int[] d = {1,3,2,5,4};
		int budget = 9;
		int count =0;
		Arrays.sort(d);
		for(int i =0; i<d.length; i++) {
			budget = budget-d[i];
			if(budget >= 0) {
				count++;
			}
		}

	}

}
