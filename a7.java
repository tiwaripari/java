import java.util.*;

public class a7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 5;
        a[3] = 6;
        a[4] = 9;
        int b;

        System.out.println("The given list is 5,7,9,4,20 ");
        b = sc.nextInt();
        switch (b)
         {
            case 5:
                System.out.print(5);
                break;
            case 7:
                System.out.print(7);
                break;
            case 9:
                System.out.print(9);
                break;
            case 4:
                System.out.print(4);
                break;
            case 20:
                System.out.print(20);
                break;
            default:
                System.out.print("The number entered is not in list ");
        }
        
    }
}
