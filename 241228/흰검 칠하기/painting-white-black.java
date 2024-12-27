import java.util.Scanner;

class Tile {
    int black = 0;
    int white = 0;
    char currentColor = 'N';    // N: None, W: White, B: Black, G: Gray

    public Tile() { }
}

public class Main {

    public static final int OFFSET = 100000;
    public static final int MAX_R = 200000;
    public static final int MAX_N = 1000;

    public static Tile[] tiles = new Tile[MAX_R + 1];
    public static boolean[] grays = new boolean[MAX_R + 1];

    public static int n;
    public static int current = OFFSET;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int white = 0, black = 0, gray = 0;

        n = sc.nextInt();

        for (int i = 0; i <= MAX_R; i++) {
            tiles[i] = new Tile();
        }

        for (int i = 0; i < n; i++) {
            int distance = sc.nextInt();
            int direction = sc.next().charAt(0);

            if (direction == 'R') {
                for (int j = current; j < current + distance; j++) {
                    tiles[j].currentColor = 'B';
                    tiles[j].black++;
                }
                current = current + distance - 1;
            }
            else {  // 'L'
                for (int j = current; j > current - distance; j--) {
                    tiles[j].currentColor = 'W';
                    tiles[j].white++;
                }
                current = current - distance + 1;
            }
        }

        for (int i = 0; i <= MAX_R; i++) {
            if (tiles[i].black >= 2 && tiles[i].white >= 2) {
                gray++;
                continue;
            }

            if (tiles[i].currentColor == 'B')
                black++;
            else if (tiles[i].currentColor == 'W')
                white++;
        }

        System.out.println(white + " " + black + " " + gray);
    }
}