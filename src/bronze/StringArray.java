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
            
            /* 자바 11기능 repeat 나중에 확인 해보기
            for(int j =0; j<b; j++){
                
                answer += kl[j].repeat(b);
            }
*/
            System.out.println(answer);
            answer = "";
        }

    }
}
