import java.util.Scanner;

public class a8 {
    public static int maximum(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;

    }

    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[100];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = maximum(a);
        int b[] = new int[100];
        for (int j = 0; j < n; j++) {
            b[a[j]]++;

        }
        int m;
        m = maximum(b);
        while (m > 0) {

            for (int i = 0; i < n; i++) {
                if (b[a[i]] == m) {
                    System.out.printf("%d ", a[i]);
                    b[a[i]] = 0;
                }

            }
            m = maximum(b);

        }

    }
}
