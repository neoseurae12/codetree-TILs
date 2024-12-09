import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String strA = sc.next();
        String strB = sc.next();

        int n = 0;
        int len = strA.length();
        while (true) {
            strA = strA.substring(len - 1) + strA.substring(0, len - 1);
            n++;

            if (strA.equals(strB)) {
                System.out.println(n);
                return;
            }
        }
    }
}