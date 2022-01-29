package level02;

public class N진법 {
    public static void main(String[] aa){
//        n진법
        int n =16;
//        t 미리구할 숫자의 갯수
        int t =16;
//        게임 참가 인원
        int m = 2;
//        튜브의 순서 p;
        int p =1;

        String num = "";
        String answer = "";
        for(int i=0; i<t*m; i++){
            num += Integer.toHexString(i);
            if(num.length()>n*m){
                break;
            }
        }


        System.out.println(num.length());
        System.out.println(num);
    }
}
