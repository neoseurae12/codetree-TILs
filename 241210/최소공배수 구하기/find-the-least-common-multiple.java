import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int n = num1 > num2 ? num1 : num2;
        int m = num1 > num2 ? num2 : num1;

        lcm(n, m);
    }

    public static void lcm(int n, int m) {
        int gcm = gcm(n, m);
        int lcm = n * m / gcm;
        System.out.println(lcm);
    }

    public static int gcm(int n, int m) {
        if (m == 0)
            return n;
        
        return gcm(m, n % m);
    }
}