import java.util.Scanner;

public class Main {
    public static void drawStar(int n, int i) {
        for (int j = 0; j < n - i; j++)
            System.out.print("*");
    }

    public static void drawBlank(int n, int i) {
        for (int j = 0; j < i; j++)
            System.out.print(" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            drawStar(n, i);
            drawBlank(n, i);
            drawBlank(n, i);
            drawStar(n, i);
            System.out.println();
        }
    }
}