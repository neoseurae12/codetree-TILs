import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        descendAndAscend(N);
    }

    public static void descendAndAscend(int n) {
        if (n == 0)
            return;

        System.out.print(n + " ");
        descendAndAscend(n - 1);
        System.out.print(n + " ");
    }
}