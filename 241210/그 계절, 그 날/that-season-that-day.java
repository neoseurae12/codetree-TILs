import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        if (!checkValidDate(y, m, d)) {
            System.out.println(-1);
            return;
        }

        if (m >= 3 && m <= 5)
            System.out.println("Spring");
        else if (m >= 6 && m <= 8)
            System.out.println("Summer");
        else if (m >= 9 && m <= 11)
            System.out.println("Fall");
        else
            System.out.println("Winter");
    }

    public static boolean checkValidDate(int y, int m, int d) {
        if (m == 2 && d == 29) {
            if (y % 4 == 0) {
                if (y % 100 == 0) {
                    if (y % 400 == 0)
                        return true;
                    return false;
                }
                return true;
            }

            return false;
        }

        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (d < 1 || d > 31)
                    return false;
                break;
            case 2:
            case 4:
            case 6:
            case 9:
            case 11:
                if (d < 1 || d > 30)
                    return false;
                break;
            //default:
                //return false;
        }

        return true;
    }
}