package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Snail {
    public static void main(String[] aa) throws IOException {
        long beforeTime = System.currentTimeMillis();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a =Integer.parseInt(st.nextToken());
        int b =Integer.parseInt(st.nextToken());
        int v =Integer.parseInt(st.nextToken());

        System.out.println((v-b)%(a-b) == 0 ? (v-b)/(a-b) : (v-b)/(a-b)+1);

        long afterTime = System.currentTimeMillis(); // �ڵ� ���� �Ŀ� �ð� �޾ƿ���
        long secDiffTime = (afterTime - beforeTime); //�� �ð��� �� ���
        System.out.println("�ð�����(ms) : "+secDiffTime);


    }
}
