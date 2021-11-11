package level01;

public class ArraySum {

	public static void main(String[] args) {
//		Çà·ÄÀÇ µ¡¼À ¿¬½À¹®Á¦ 
		
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 = {{3,4},{5,6}};
		int a = arr1.length;
        int b = arr1[a-1].length;
        
		int[][] z = new int[a][b];
		
		for(int i =0; i<arr1.length; i++) {
			for(int j=0; j<arr1.length; j++) {
				
				z[i][j] = arr1[i][j] + arr2[i][j];
			}
			
			
		}

	}

}
