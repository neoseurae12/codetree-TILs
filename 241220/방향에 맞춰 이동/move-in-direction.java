import java.util.Scanner;

public class Main {
    public static int row = 0, column = 0;
    public static int dirNum = -1;
    // 동 남 서 북
    public static int[] dr = new int[]{0, -1, 0, 1};
    public static int[] dc = new int[]{1, 0, -1, 0};

    public static void move(char direction, int distance) {
        if (direction == 'E')
            dirNum = 0;
        else if (direction == 'S')
            dirNum = 1;
        else if (direction == 'W')
            dirNum = 2;
        else
            dirNum = 3;

        row += dr[dirNum] * distance;
        column += dc[dirNum] * distance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();

            move(direction, distance);
        }

        System.out.println(column + " " + row);
    }
}