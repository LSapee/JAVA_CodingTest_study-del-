import java.util.ArrayList;
import java.util.List;

class OneTwoThree {

    public static void main(String[] args){
        String answer = "";

        int n = 10;

        List<Object> al = new ArrayList<>();

        for(int i=0; i<18; i++){
            n = n-1;
            al.add(n%3);
            n= n/3;
            if(n==0){
                break;
            }
        };
        for(int i =0; i<al.size(); i++){
            answer += al.get(al.size()-(i+1));
        }

            answer =answer.replaceAll("2","4");
            answer =answer.replaceAll("1","2");
            answer =answer.replaceAll("0","1");

            System.out.println(answer);
    }
}
