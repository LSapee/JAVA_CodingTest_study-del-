package bronze;

import java.util.Scanner;

public class Find {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = 0;
        int j = 0;
        String a = "";
        for(int i =0; i<=n; i++){
            n -= i;
            k++;
            j=i;
        }

        if(n==0){
            j= j+1;
        }

        if(j%2 ==0){
            if(n==0){
                k= k-1;
                n = n+1;
                a = n+"/"+k;
            }
            else if(n<k){
                k = k+1-n;
                a = k+"/"+n;
            }
        }else{
            if(n==0){
                k= k-1;
                n = n+1;
                a = k+"/"+n;
            }
            else if(n<k){
                k = k+1-n;
                a = n+"/"+k;
            }
        }



        System.out.println(a);

    }
}

