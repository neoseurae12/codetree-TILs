import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //                                1   2   3   4   5   6   7   8   9  10  11  12
        int[] daysOfMonth = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] daysOfWeek = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        
        int m1, d1, m2, d2;
        String day;
        // 2 10
        // 2 17
        // 2 24
        // 2 31 -> 3 2
        // 3 9

        m1 = sc.nextInt();
        d1 = sc.nextInt();
        m2 = sc.nextInt();
        d2 = sc.nextInt();
        day = sc.next();

        int m = m1;
        int d = d1 + Arrays.asList(daysOfWeek).indexOf(day);
        int count = 0;

        while (m != m2 || d <= d2) {
            count++;

            d += 7;
            if (d > daysOfMonth[m]) {
                d %= daysOfMonth[m];
                m++;
            }

            if (m > 12)
                break;
        }

        System.out.println(count);
    }
}