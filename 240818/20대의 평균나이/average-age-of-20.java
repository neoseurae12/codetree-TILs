import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;
        int cnt = 0, sum = 0;

        while (true) {
            age = sc.nextInt();

            if (age / 10 != 2) {
                double avg = (double)sum / cnt;
                System.out.printf("%.2f", avg);
                break;
            }

            sum += age;
            cnt++;
        }
    }
}