import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int answer;
    //                                          1   2   3   4   5   6   7   8   9  10  11  12
    public static int[] daysOfMonth = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static String[] daysOfWeek = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    public static int numOfDays(int m, int d) {
        int days = 0;

        for (int i = 1; i < m; i++) {
            days += daysOfMonth[i];
        }
        days += d;

        return days;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1, d1, m2, d2;
        String day;

        m1 = sc.nextInt();
        d1 = sc.nextInt();
        m2 = sc.nextInt();
        d2 = sc.nextInt();
        day = sc.next();

        int days1 = numOfDays(m1, d1);
        int days2 = numOfDays(m2, d2);
        int currentDay = Arrays.asList(daysOfWeek).indexOf("Mon");
        int targetDay = Arrays.asList(daysOfWeek).indexOf(day);
        
        for (int date = days1; date <= days2; date++) {
            if (currentDay == targetDay) answer++;
            currentDay = (currentDay + 1) % 7;
        }

        System.out.println(answer);
    }
}