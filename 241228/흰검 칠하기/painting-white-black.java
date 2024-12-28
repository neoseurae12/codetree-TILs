import java.util.Scanner;

public class Main {

    public static final int OFFSET = 100000;
    public static final int MAX_R = 200000;
    public static final int MAX_N = 1000;

    public static char[] tiles = new char[MAX_R + 1];
    public static int[] cntB = new int[MAX_R + 1];
    public static int[] cntW = new int[MAX_R + 1];
    public static int b, w, g;

    public static int n;
    public static int current = OFFSET;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int distance = sc.nextInt();
            int direction = sc.next().charAt(0);

            if (direction == 'R') {
                while (distance-- > 0) {
                    tiles[current] = 'B';
                    cntB[current]++;
                    if (distance > 0) current++;
                }
            }
            else {  // 'L'
                while (distance-- > 0) {
                    tiles[current] = 'W';
                    cntW[current]++;
                    if (distance > 0) current--;
                }
            }
        }

        for (int i = 0; i <= MAX_R; i++) {
            if (cntB[i] >= 2 && cntW[i] >= 2) g++;
            else if (tiles[i] == 'B') b++;
            else if (tiles[i] == 'W') w++;
        }

        System.out.println(w + " " + b + " " + g);
    }
}