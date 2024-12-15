import java.util.Scanner;
import java.util.Arrays;

public class Main {
    //                                          1   2   3   4   5   6   7   8   9  10  11  12
    public static int[] daysOfMonth = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int getDays(int m, int d) {
        int days = 0;

        for (int i = 1; i < m; i++) {
            days += daysOfMonth[i];
        }
        days += d;

        return days;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] daysOfWeek = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        
        int m1, d1, m2, d2;
        String day;

        m1 = sc.nextInt();
        d1 = sc.nextInt();
        m2 = sc.nextInt();
        d2 = sc.nextInt();
        day = sc.next();

        // 2 5
        // 1. 2 10
        // 2. 2 17
        // 3. 2 24
        // 4. 2 31 -> 3 2
        // 5. 3 9

        int count = 0;

        int days1 = getDays(m1, d1);
        int days2 = getDays(m2, d2);
        int total = days2 - days1;
        count = total / 7;
        if (total % 7 >= Arrays.asList(daysOfWeek).indexOf(day))
            count++;

        System.out.println(count);
    }
}