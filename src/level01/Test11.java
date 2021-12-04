package level01;

import java.util.Arrays;

public class Test11 {

	public static void main(String[] args) {
//		최소직사각형 미완

		int[][] sizes = { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } };

		int w = 0;
		int h = 0;
		int answer =0;
		
		for (int i = 0; i < sizes.length; i++) {
			for (int j = 0; j < sizes[i].length; j++) {
				if (j == 0) {
					if (w < sizes[i][j]) {
						w = sizes[i][j];
					}
				} else {
					if (h < sizes[i][j]) {
						h = sizes[i][j];
					}

				}

			}
		}
		answer = w*h;
		System.out.println(answer);
	}
}