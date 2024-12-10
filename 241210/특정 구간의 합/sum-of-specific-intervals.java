import java.util.Scanner;

public class Main {
    public static int[] arrA;

    public static int sumOfRange(int a1, int a2) {
        int sum = 0;
        for (int i = a1 - 1; i < a2; i++) {
            sum += arrA[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        arrA = new int[n];

        for (int i = 0; i < n; i++)
            arrA[i] = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();

            System.out.println(sumOfRange(a1, a2));
        }
    }
}