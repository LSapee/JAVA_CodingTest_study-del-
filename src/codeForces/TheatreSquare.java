package codeForces;

import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();
        long i =n/a;
        long j =m/a;

        if(n%a != 0){
            i++;
        }
        if(m%a != 0){
            j++;
        }

        System.out.println(i*j);
    }
}
