package level01;

public class MoreMoney {

	public static void main(String[] args) {
//		������ �ݾ� ����ϱ�
		int price =3;
		int money = 30;
		int count = 1;
		
		long answer = -1;
		long sum =0;
		for(int i=1; i<=count; i++) {
			sum += price * i;
		}
		answer = money - sum;
		if(answer>0) {
			answer = 0;
		}else {
		answer = Math.abs(answer);
		}
		System.out.println(answer);
	}

}
