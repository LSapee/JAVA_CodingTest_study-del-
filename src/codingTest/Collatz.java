package codingTest;

public class Collatz {

	public static void main(String[] args) {
		int num =626331;
		int count =0;
		long a = num;
		
		do {
			if(a%2 ==0) {
				a = a/2;
				count++;
			}else if(a%2 != 0){
				a = (a*3)+1;
				count++;
			}
			if(count >=500) {
				count = -1;
				break;
			}
		}while(num !=1);

	System.out.println(count);
	}

}
