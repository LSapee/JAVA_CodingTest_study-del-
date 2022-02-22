package bronze;

import java.util.Scanner;

public class Function03 {

    public static void main(String[] aq) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int j = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d= 0;
        int count = 99;
        if(num<100){
            count = num;
        }

        for (int i = 99; i <= num; i++) {
            j=i;
            a = j / 100;
            b = (j / 10) % 10;
            c = j % 10;
            System.out.println(j + " : " + a+" "+ b +" "+ c);

            for(int k = 0; k<=4; k++){
                if(a-k== b && b-k==c){
                    count++;
                }else if(a+k == b && b+k==c){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
