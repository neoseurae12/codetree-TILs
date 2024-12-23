import java.util.Scanner;

public class Main {
    public static int[] blocks;

    public static void stackBlocks(int a, int b) {
        for (int i = a; i <= b; i++) {
            blocks[i]++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        blocks = new int[n+1];

        for (int i = 0; i < k; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            stackBlocks(a, b);
        }

        int max = 0;
        for (int i = 1; i <= n; i++) {
            if (blocks[i] > max)
                max = blocks[i];
        }

        System.out.println(max);
    }
}