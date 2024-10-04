import java.util.Scanner;

public class Main {

    public static String commands;

    // 서 북 동 남
    public static int[] dr = new int[]{0, -1, 0, 1};   // 세로
    public static int[] dc = new int[]{-1, 0, 1, 0};   // 가로

    public static int r = 0;
    public static int c = 0;

    // 초기 방향: 북쪽
    public static int handleDirection = 1;

    public static int elapseTime = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        commands = sc.next();

        int ans = -1;
        for (char command : commands.toCharArray()) {
            takeCommand(command);
            elapseTime++;

            if (r == 0 && c == 0) {
                ans = elapseTime;
                break;
            }
        }

        System.out.println(ans);
    }

    public static void takeCommand(char command) {
        if (command == 'R')
            turnHandleRight();
        else if (command == 'L')
            turnHandleLeft();
        else  // command == 'F'
            goForward();
    }

    public static void turnHandleRight() {
        // 현재: 3 -> 0
        // 현재: 1 -> 2
        handleDirection = (handleDirection + 1) % 4;
    }

    public static void turnHandleLeft() {
        // 현재: 0 -> 3
        // 현재: 3 -> 2
        handleDirection = (handleDirection - 1 + 4) % 4;
    }

    public static void goForward() {
        r += dr[handleDirection];
        c += dc[handleDirection];
    }
}