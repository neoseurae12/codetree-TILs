import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        int[] counts = new int[b];

        while (a > 1) {
            counts[a % b]++;

            a /= b;
        }

        int squareSum = 0;
        for (int i = 0; i < b; i++)
            squareSum += counts[i] * counts[i];
        System.out.println(squareSum);
    }
}