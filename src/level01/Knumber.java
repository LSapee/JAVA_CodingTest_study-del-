package level01;

import java.util.Arrays;

public class Knumber {

	public static void main(String[] args) {
//		k��° ��
		int[] array = {1,5,2,6,3,7,4};
		
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		
		int a = commands.length;
		
		int[] answer = new int[a];
//		n~m��° �� ����
		int n =0;
		int m =0;

//		n~m������ �迭���� k��° ��
		int k= 0;
		
		int[] q;
		for(int i = 0; i<a; i++) {
			n = commands[i][0];
			m = commands[i][1];
			k = commands[i][2];
			q= new int[m-(n-1)];			
			System.out.println(q.length);
			for(int j = n-1;j<m; j++ ) {
				q[j+1-n] = array[j];
			}
			Arrays.sort(q);
			answer[i] = q[k-1];
		}

	}

}
