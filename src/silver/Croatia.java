package silver;

import java.util.Scanner;

public class Croatia {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String[] aa = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        int count =0;
        String a = sc.next();

        for(int i=0; i<aa.length; i++){
            if(a.contains(aa[i])){
                count++;
                a = a.replaceFirst(aa[i]," ");
                i--;
            }
        }
        a= a.trim();
        a= a.replace(" ","");
        String [] abc = a.split("");
        System.out.println(a);
        if(abc[0].equals("")){
            System.out.println(count);
        }else{
            System.out.println(count + abc.length);
        }

    }
}
