package etc;

import java.util.ArrayList;

public class CacaoKrain {

	public static void main(String[] args) {
//		ÀÎÇü»Ì±â
		int[][] board = { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 },
				{ 1, 2, 3, 4, 5 } };
		int[] moves = { 1,2,2,2,2,1};
		int count = 0;
		int answer = 0;
		ArrayList<Integer> al = new ArrayList<>();

		for (int j = 0; j < moves.length; j++) {
			for (int i = 0; i < board.length; i++) {
				if (board[i][moves[j] - 1] != 0) {
					al.add(board[i][moves[j] - 1]);
					board[i][moves[j] - 1] = 0;
					break;
				}
			}
		}

		for (int i = 0; i < al.size() - 1; i++) {
			if (al.get(i) == al.get(i + 1)) {
				al.remove(i);
				count++;
				al.remove(i);
				count++;
				if (i > al.size() - 1) {
					break;
				}
				i = -1;
			}
		}
		System.out.println(count);
		System.out.println(al);

	}
}
