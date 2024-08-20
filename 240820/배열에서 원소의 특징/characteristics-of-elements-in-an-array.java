import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int previous = -1;
        int now;

        for (int i = 0; i < 10; i++) {
            now = sc.nextInt();

            if (now % 3 == 0) {
                System.out.println(previous);
                break;
            }
            
            previous = now;
        }
    }
}