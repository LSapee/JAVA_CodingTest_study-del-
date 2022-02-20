package bronze;

import java.io.*;
import java.util.StringTokenizer;

public class AplusB {
    public static void main(String[] aa) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int t = Integer.parseInt(bf.readLine());
        int a;
        int b;


        for(int i =0; i<t; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            bw.write(a+b +"\n");
        }
        bw.flush();
        bf.close();

    }
}
