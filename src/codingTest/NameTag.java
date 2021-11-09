package codingTest;

public class NameTag {

	public static void main(String[] args) {
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		int w =0;
		int h =0;
		for(int i =0; i<sizes.length; i++) {
			for(int j = 0; j<sizes[i].length; j++) {
				if(j ==0) {
					if(w<sizes[i][j]) {
						w =sizes[i][j];
					}
				}else {
					if(h<sizes[i][j]) {
						h =sizes[i][j];
					}
				}
			}
		}

	}

}
