import java.util.Scanner;

public class Main {

    public static int N;

    public static int x = 0;
    public static int y = 0;

    public static int[] dx = new int[]{1, 0, -1, 0};
    public static int[] dy = new int[]{0, -1, 0, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();

            move(direction, distance);
        }

        System.out.println(x + " " + y);
    }

    public static void move(char direction, int distance) {
        int dirNum = -1;
        
        if (direction == 'E') dirNum = 0;
        else if (direction == 'S') dirNum = 1;
        else if (direction == 'W') dirNum = 2;
        else dirNum = 3;

        x += dx[dirNum] * distance;
        y += dy[dirNum] * distance;
    }
}