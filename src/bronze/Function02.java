package bronze;

public class Function02 {

    static boolean[] produced = new boolean[20002];

    public static void main(String[] aq) {

        int num = 1;
        int sum = 0;
        int i = 0;
        for (int j = 1; j < 100; j++) {
            i = j;
            sum = i;
            if (i >= 10) {
                while (i > 0) {
                    sum += i%10;
                    i = i / 10;
                }
            } else {
                sum = i + i;
            }
            if(sum>10000){
                break;
            }
            produced[sum] = true;
            sum = 0;
        }
        for(int j = 1; j<100; j++){
            if(!produced[j]){
                System.out.println(j);
            }
        }

    }
}
