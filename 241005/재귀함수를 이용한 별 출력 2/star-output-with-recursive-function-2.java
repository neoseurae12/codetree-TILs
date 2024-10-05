import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        printConcaveStar(N);
    }

    public static void printConcaveStar(int n) {
        if (n == 0)
            return;

        printStar(n);
        printConcaveStar(n - 1);
        printStar(n);
    }

    public static void printStar(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
    }
}