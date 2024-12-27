import java.util.Scanner;

public class Main {

    public static int n;

    public static int current = 0;
    public static int max = current, min = current;

    public static int[][] segments = new int[100 + 1][2];
    public static int[] blocks;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char direction = sc.next().charAt(0);
            
            if (direction == 'R') {
                segments[i][0] = current;
                current += x;
                segments[i][1] = current;
            }
            else {  // 'L'
                segments[i][1] = current;
                current -= x;
                segments[i][0] = current;
            }

            if (current > max)
                max = current;

            if (current < min)
                min = current;
        }

        int OFFSET = -min;
        blocks = new int[max + OFFSET + 1];
        
        for (int i = 0; i < n; i++)
            for (int j = segments[i][0] + OFFSET; j < segments[i][1] + OFFSET; j++)
                blocks[j]++;

        int ans = 0;
        for (int i = 0; i <= max + OFFSET; i++) {
            if (blocks[i] > 1)
                ans++;
        }

        System.out.println(ans);
    }
}