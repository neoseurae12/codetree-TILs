import java.util.Scanner;

public class Main {
    public static void drawBlank(int n, int i) {
        for (int j = 0; j < n - i; j++)
            System.out.print(" ");
    }

    public static void drawStar(int n, int i) {
        for (int j = 0; j < i; j++)
            System.out.print("* ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            drawBlank(n ,i);
            drawStar(n, i);
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            drawBlank(n, i);
            drawStar(n, i);
            System.out.println();
        }
    }
}