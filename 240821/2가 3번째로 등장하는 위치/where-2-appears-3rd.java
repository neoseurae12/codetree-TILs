import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num == 2) {
                cnt++;
                if (cnt == 3) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}