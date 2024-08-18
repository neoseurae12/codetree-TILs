import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        boolean haveCommonDivisor = false;

        a = sc.nextInt();
        b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            if (1920 % i == 0 && 2880 % i == 0) {
                haveCommonDivisor = true;
                break;
            }
        }

        if (haveCommonDivisor)
            System.out.println(1);
        else
            System.out.println(0);
    }
}