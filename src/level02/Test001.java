package level02;

public class Test001 {

	public static void main(String[] args) {
//		Çà·ÄÀÇ °ö¼À
		int[][] a = {{1,4},{3,2},{4,1}};
		int[][] a2 = {{3,3},{3,3}};
		String aa ="";
		for(int i =0; i<a.length; i++) {
			for(int j =0; j<a2.length; j++) {
				aa += a[i][j] *a2[i][j];
			}
		}
	}

}
