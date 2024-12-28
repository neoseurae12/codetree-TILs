import java.util.Scanner;

public class Main {
    public static final int OFFSET = 100000;
    public static final int MAX_R = 2 * 100000 + 1;

    public static int n;
    public static int w, b;
    public static int current = OFFSET;
    public static char[] tiles = new char[MAX_R];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int distance = sc.nextInt();
            char direction = sc.next().charAt(0);

            if (direction == 'R') {
                while (distance-- > 0) {
                    tiles[current] = 'B';
                    if (distance > 0) current++;
                }
            }
            else {  // 'L'
                while (distance-- > 0) {
                    tiles[current] = 'W';
                    if (distance > 0) current--;
                }
            }
        }

        for (int i = 0; i < MAX_R; i++) {
            if (tiles[i] == 'B') b++;
            else if (tiles[i] == 'W') w++;
        }

        System.out.println(w + " " + b);
    }
}