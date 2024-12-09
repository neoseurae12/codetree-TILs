import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int lenA = A.length();
        int lenB = B.length();

        int cnt = 0;

        for (int i = 0; i <= lenA - lenB; i++) {
            String subA = A.substring(i, i + lenB);
            if (subA.equals(B))
                cnt++;
        }

        System.out.println(cnt);
    }
}