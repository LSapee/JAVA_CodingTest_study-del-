package codingTest;
import java.util.Scanner;

public class Te {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        long num = sc.nextInt();
        int result = -1;

        for (int i = 0; i < 500; i++) {
            if (num == 1) {
                result = i;
                break;
            } else if (num / 2 * 2 == num) {
                num = num / 2;
            } else if (num / 2 * 2 != num) {
                num = num * 3 + 1;
            }

            System.out.print(i + " ");
            System.out.println(num);

        }

        System.out.println(result);

    }
}
