import java.util.Scanner;

public class Main {
    public static boolean isLeapYear(int y) {
        if (y % 4 != 0)
            return false;
        
        if (y % 100 != 0)
            return true;

        if (y % 400 == 0)
            return true;
        
        return false;
    }

    public static boolean checkValidDate(int y, int m, int d) {
        //                          0  1   2   3   4   5   6   7   8   9  10  11  12 월
        int[] numOfDays = new int[]{0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        numOfDays[2] = isLeapYear(y) ? 29 : 28;

        return d <= numOfDays[m];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        if (!checkValidDate(y, m, d)) {
            System.out.println(-1);
            System.exit(0);
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
}