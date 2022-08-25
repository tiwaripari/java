import java.util.Scanner;
import java.util.Arrays;

public class Book {
    private int bookId, numberOfAvailableCopies, totalCopies, yearOFpublication;

    private String bookTitle, authorName, publisher;

    Book() {
        totalCopies = 0;
    }

    Book(int t) {
        totalCopies = t;
        System.out.printf("%d ", totalCopies);
    }

    public void setDetails() {
        bookId = 0;
        numberOfAvailableCopies = 0;
        totalCopies = 0;
        yearOFpublication = 0;
        bookTitle = "Nan";
        authorName = "Nan";
        publisher = "Nan";
    }

    public void setDetails(int bId, int noac, int tC, int yop, String bT, String an, String pub) {
        bookId = bId;
        numberOfAvailableCopies = noac;
        totalCopies = tC;
        yearOFpublication = yop;
        bookTitle = bT;
        authorName = an;
        publisher = pub;
    }

    public int getDetails(int bId) {
        if (bId == bookId) {
            System.out.println("The Book Title is " + bookTitle);
            System.out.println("Author of the book is " + authorName);
            System.out.println("Publisher of the book is " + publisher);
            System.out.printf("Year of Publication is %d \n", yearOFpublication);
            System.out.printf("Number of Total Copies  %d\n", totalCopies);
            System.out.printf("Number of Available Copies  %d\n", numberOfAvailableCopies);

            return 1;
        } else {
            return 0;
        }

    }

    public int issue(int bId) {
        if (bId == bookId) {
            totalCopies = totalCopies - 1;
            numberOfAvailableCopies = numberOfAvailableCopies - 1;
            return 1;
        } else {
            return 0;
        }

    }

    public int return1(int bId) {
        if (bId == bookId) {
            totalCopies = totalCopies + 1;
            numberOfAvailableCopies = numberOfAvailableCopies + 1;
            return 1;
        } else {
            return 0;
        }

    }

    public static void main(String args[]) {
        Book[] lib = new Book[10];
        lib[0] = new Book(64);
        lib[1] = new Book(72);
        lib[2] = new Book(100);
        lib[3] = new Book(36);
        lib[4] = new Book(1000);
        int k;
        k = 4;
        lib[0].setDetails(101, 32, 64, 2003, "Life is boring", "Girija Hegde", "Arihant");
        lib[1].setDetails(102, 68, 72, 2003, "Story Of My Life", "Sunidhi Kumari", "MTG");
        lib[2].setDetails(103, 50, 100, 2002, "Judgemental People", "Sunidhi Kumari", "Reliance");
        lib[3].setDetails(104, 25, 36, 2005, "Leave Me Alone You....", "Pari Tiwari", "Nirmala");
        lib[4].setDetails(105, 990, 1000, 2006, "You Creep", "Anaya Thakur", "Navratan");

        System.out.println("\n    Main menu     ");
        System.out.println("1. Set Details\n");
        System.out.println("2. Get Details\n");
        System.out.println("3. Issue\n");
        System.out.println("4. Return\n");
        System.out.println("5. Exit\n");
        int x;
        System.out.println("Choose an option\n");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        while (x != 5) {
            switch (x) {
                case 1: {
                    k++;
                    int bId, noac, tC, yop;
                    String bT, an, pub;
                    System.out.println("Enter book id ");
                    bId = sc.nextInt();
                    System.out.println("Enter Number of Available copies ");
                    noac = sc.nextInt();
                    System.out.println("Enter Total Copies ");
                    tC = sc.nextInt();
                    System.out.println("Enter Year of publication ");
                    yop = sc.nextInt();
                    System.out.println("Enter Book Title \n");
                    bT = sc.nextLine();
                    System.out.println("Enter author's name\n");
                    an = sc.nextLine();
                    System.out.println("Enter publisher\n");
                    pub = sc.nextLine();
                    lib[k] = new Book(tC);
                    lib[k].setDetails(bId, noac, tC, yop, bT, an, pub);
                    break;

                }
                case 2: {
                    int bId;
                    System.out.println("Enter Book Id");
                    bId = sc.nextInt();
                    for (int i = 0; i < k; i++) {
                        int m;
                        m = lib[i].getDetails(bId);
                        if (m == 1) {
                            break;
                        } else {
                            continue;
                        }
                    }
                    break;

                }
                case 3: {
                    int bId;
                    System.out.println("Enter Book Id");
                    bId = sc.nextInt();

                    for (int i = 0; i < k; i++) {
                        int m;
                        m = lib[i].issue(bId);
                        if (m == 1) {
                            break;
                        } else {
                            continue;
                        }
                    }
                    break;
                }
                case 4: {
                    int bId;
                    System.out.println("Enter Book Id");
                    bId = sc.nextInt();

                    for (int i = 0; i < k; i++) {
                        int m;
                        m = lib[i].return1(bId);
                        if (m == 1) {
                            break;
                        } else {
                            continue;
                        }
                    }
                    break;
                }
            }
            System.out.println("Enter your choice ");
            x = sc.nextInt();

        }

    }
}