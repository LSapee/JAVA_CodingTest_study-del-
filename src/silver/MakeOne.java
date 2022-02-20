package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeOne {
    public static void main(String a[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int i =1;
        int j = 2;
        int k =3;

        if(n>1) {
            while (n > 1) {

                i++;
            }
            i=i-1;
        }
        System.out.println(i);
    }
}
