package etc;

public class Eum_yang_SUM {

	public static void main(String[] args) {
//		음양 더하기
		int[] absolutes = {4,7,12};
		boolean[] signs = {true,false,true};
		int answer = 0;
		
		for (int i = 0; i<signs.length; i++) {
			if(signs[i] == true) {
				answer += absolutes[i];
			}else {
				answer -= absolutes[i];
			}
		}
		System.out.println(answer);
	}

}
