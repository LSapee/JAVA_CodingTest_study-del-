package etc;

import java.util.Scanner;

public class CmdFile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		���� �Է¹ޱ�
		int n = sc.nextInt();
//		���ϰ��� �迭�� �ޱ�
		String[] a = new String[n];
//		���ڸ�ŭ �Է¹ޱ�
		for(int i = 0; i<n; i++) {
			a[i] = sc.next(); 
		}
//		�񱳴�� 1�� ����
		String[] b = a[0].split("");
//		�񱳴�� 2�� ����
		String[] c = new String[b.length];
		
		
//		���ڿ���ŭ ��
		for(int j =0; j<n; j++) {
			c = a[j].split("");
			for(int i =0; i<b.length; i++) {
				if(i >= b.length){
					break;
				}else if(i <b.length) {
					if(!b[i].equals(c[i])) {
						b[i] ="?";
					}
				}
			}
		}
		for(int i =0; i<b.length; i++) {
			System.out.print(b[i]);
		}
	}

}
