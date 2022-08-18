import java.util.*;

public class a1 {

    public static void main(String args[]) {
        Scanner t = new Scanner(System.in);
        System.out.println("Enter first num: ");
        int a = t.nextInt();
        System.out.println("Enter other num: ");
        int b = t.nextInt();
        int d;
        d = a + b;
        System.out.printf("THE TOTAL OF NUMBERS  %d and %d is %d and THE DIFFERENCE OF NUMBERS  %d and %d is %d\n",
                a, b, a - b, a, b, a - b);

        System.out.print(+d);

    }

}
