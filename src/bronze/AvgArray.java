package bronze;

import java.util.Scanner;

public class AvgArray {
        public static void main(String[] aaa){
            Scanner sc = new Scanner(System.in);

            int a =sc.nextInt()+1;
            String [] case2 = new String[a];

            for(int i =0; i<a; i++){
                case2[i] = sc.nextLine();
                System.out.println(case2[i]);
            }
            int avg = 0;
            double point = 0;
            int count = 0;
            for(int i =1; i<a; i++){
                String[] ab = case2[i].split(" ");
                int z = Integer.parseInt(ab[0]);
                for(int j=1; j<z+1; j++){
                    avg += Integer.parseInt(ab[j]);
                }
                avg = avg/z;
                for(int j=1; j<z+1; j++){
                    if(Integer.parseInt(ab[j])>avg){
                        count++;
                    }

                }
                point = (double)count/z*100;
                System.out.printf("%.3f",point);
                System.out.println("%");
                avg =0;
                count=0;
            }

        }
    }
