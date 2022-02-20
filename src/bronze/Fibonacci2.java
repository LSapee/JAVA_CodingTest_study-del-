package bronze;

import java.math.BigDecimal;

public class Fibonacci2 {

    public static void main(String aa[]) {

        int n = 100000;
        int answer = 0;
        BigDecimal op1 = new BigDecimal("0");
        BigDecimal op2 = new BigDecimal("1");
        BigDecimal op3 = new BigDecimal("0");
        BigDecimal op4 = new BigDecimal("1234567");

        for (int i = 2; i <=n; i++) {
            op3 = op1.add(op2);
            op1 =op2;
            op2 = op3;
        }
        op4 = op3.remainder(op4);
        answer = op4.intValue();
        System.out.println(op4);
        System.out.println(answer);
    }
}