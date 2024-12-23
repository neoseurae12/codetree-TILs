import java.util.Scanner;

public class Main {
    public static final int MAX_SIZE = 201;
    public static final int OFFSET = 100;
    public static int[] line = new int[MAX_SIZE];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;

            for (int j = x1; j < x2; j++) {
                line[j]++;
            }
        }

        int max = 0;
        for (int i = 0; i < MAX_SIZE; i++) {
            if (line[i] > max) {
                max = line[i];
            }
        }

        System.out.println(max);
    }
}