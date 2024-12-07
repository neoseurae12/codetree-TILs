import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] strs = new String[n];
        for (int i = 0; i < n; i++)
            strs[i] = sc.next();

        char c = sc.next().charAt(0);
        int cnt = 0;
        int lengthSum = 0;

        for (int i = 0; i < n; i++) {
            if (strs[i].charAt(0) == c) {
                cnt++;
                lengthSum += strs[i].length();
            }
        }

        double lengthAvg = lengthSum / cnt;
        System.out.printf("%d %.2f", cnt, lengthAvg);
    }
}