import java.util.Scanner;

public class Main {

    public static final int MAX_SIZE = 101;
    public static int n, x1, x2;
    public static int[] line = new int[MAX_SIZE];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            x1 = sc.nextInt();
            x2 = sc.nextInt();

            for (int j = x1; j <= x2; j++) {
                line[j]++;
            }
        }

        int max = 0;
        for (int i = 1; i < MAX_SIZE; i++) {
            if (line[i] > max)
                max = line[i];
        }

        System.out.println(max);
    }
}