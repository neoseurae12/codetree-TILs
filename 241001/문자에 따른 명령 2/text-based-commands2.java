import java.util.Scanner;

public class Main {

    public static int x = 0;
    public static int y = 0;

    // 북 -> 동 -> 남 -> 서
    public static int dirNum = 0;

    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] commands = sc.next().toCharArray();

        for (char command : commands) {
            if (command == 'L') {
                turnLeft();
            } else if (command == 'R') {
                turnRight();
            } else {  // command == 'F'
                goForward();
            }
        }

        System.out.println(x + " " + y);
    }

    public static void turnLeft() {
        dirNum = (dirNum - 1 + 4) % 4;
    }

    public static void turnRight() {
        dirNum = (dirNum + 1) % 4;
    }

    public static void goForward() {
        x += dx[dirNum];
        y += dy[dirNum];
    }
}