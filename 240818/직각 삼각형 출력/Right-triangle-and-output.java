import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        String star = "*";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i * 2 + 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}