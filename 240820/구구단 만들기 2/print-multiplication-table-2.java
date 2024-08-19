import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        for (int i = 1; i <= 4; i++) {
            for (int j = b; j >= a; j--) {
                if (j != b) System.out.print(" / ");
                System.out.print(j + " * " + 2 * i + " = " + j * 2 * i);
            }
            System.out.println();
        }
    }
}