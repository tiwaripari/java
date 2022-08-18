import java.util.*;

public class a3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = 5;
        while (t > 0) {
            System.out.println("Enter the marks of maths ");
            int a = sc.nextInt();
            if (a < 0) {
                System.out.println("Enter again ");
                a = sc.nextInt();
            }
            System.out.println("Enter the marks of maths ");
            int b = sc.nextInt();
            if (b < 0) {
                System.out.println("Enter again ");
                b = sc.nextInt();
            }
            System.out.println("Enter the marks of maths ");
            int c = sc.nextInt();
            if (c < 0) {
                System.out.println("Enter again ");
                c = sc.nextInt();
            }
            int avg;
            avg = (a + b + c) / 3;
            System.out.println("The avg is " + avg);
            if (avg >= 60) {
                System.out.println("GOOD");
            } else if (avg >= 30 && avg < 60) {
                System.out.println("OK");
            } else {
                System.out.println("POOR");
            }
            t--;
        }

    }
}
