package bronze;

import java.util.Scanner;

public class Array06 {
    public static void main(String[] aaa){
        Scanner sc = new Scanner(System.in);

        int a =sc.nextInt();
        String[] OX = new String[a+1];
        for(int i =0; i<=a; i++){
            OX[i] = sc.nextLine();
        }
        int p =1;
        int sum = 0;

        for(int i =1; i<=a; i++){
            String[] t =OX[i].split("");

            for(int j =0; j<OX[i].length(); j++){
                if(t[j].equals("O")){
                    sum +=p;
                    p +=1;
                }else{
                    p=1;
                }
            }
            System.out.println(sum);
            p=1;
            sum = 0;
        }

    }
}
