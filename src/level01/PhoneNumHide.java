package level01;

public class PhoneNumHide {

	public static void main(String[] args) {
//		�ڵ��� ��ȣ ������
//��ȭ��ȣ ���� 4�ڸ� ���� ������ ������
		String a = "1234567890";
		String[] aa = a.split("");
		String[] al= {"1","2","3","4","5","6","7","8","9","0"};
		String c = "";
		int b = a.length();
		
//		System.out.println(Arrays.toString(aa));
		
		for (int i =0; i<b; i++) {
			if(i<b-4) {
				for(int j=0; j<al.length; j++) {
					aa[i] = aa[i].replace(al[j], "x");
			}
			c += aa[i];	
			}else {
				c += aa[i];
			}
			
		}
		System.out.println(c);
	}

}
