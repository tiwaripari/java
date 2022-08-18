import java.util.*;

public class a2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        for (int i = 0; i < 5; i++) {
            int a;
            a = sc.nextInt();
            if (a > max) {
                max = a;
            }

        }
        System.out.printf("The maximum number is %d", max);
    }
}
