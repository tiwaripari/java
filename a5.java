import java.util.*;

public class a5 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem = 0, sum = 0;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.printf("The sum of digits of entered num is %d", sum);
    }
}
