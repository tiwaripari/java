import java.util.*;

public class a6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Scanner str = new Scanner(s);
        System.out.println(s);
        int i = 0;
        while (str.hasNext()) {
            i++;
            str.next();

        }
        System.out.print(i);

    }
}
