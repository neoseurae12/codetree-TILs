import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int i = 0;

        n = sc.nextInt();

        while (n > 1) {
            i++;

            n /= i;
        }

        System.out.println(i);
    }
}