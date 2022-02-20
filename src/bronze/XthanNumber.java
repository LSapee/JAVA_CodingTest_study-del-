package bronze;

import java.util.Scanner;

public class XthanNumber {
    public static void main(String []a){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int c;
        String an = "";
        for(int i =0; i<n; i++){
            c = sc.nextInt();
            if(c<x){
                an += c +" ";
            }
        }
        an.trim();
        System.out.println(an);
    }
}
