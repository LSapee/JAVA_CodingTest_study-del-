package level02;

public class N���� {
    public static void main(String[] aa){
//        n����
        int n =16;
//        t �̸����� ������ ����
        int t =16;
//        ���� ���� �ο�
        int m = 2;
//        Ʃ���� ���� p;
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
