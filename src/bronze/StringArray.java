package bronze;

import java.util.Scanner;

public class StringArray {
    public static void main(String[] aaaa) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());
        int b = 0;
        String k = "";
        String answer = "";
        for (int i = 0; i < a; i++) {
            b = sc.nextInt();
            k = sc.next();

            String[] kl = k.split("");
            for (int l = 0; l < kl.length; l++) {
                for (int j = 0; j < b; j++) {
                    answer += kl[l];
                }
            }
            
            /* �ڹ� 11��� repeat ���߿� Ȯ�� �غ���
            for(int j =0; j<b; j++){
                
                answer += kl[j].repeat(b);
            }
*/
            System.out.println(answer);
            answer = "";
        }

    }
}
