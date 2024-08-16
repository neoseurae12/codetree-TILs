import java.util.Scanner;

public class Main {
    public static int compare(int a, int x) {
        if (a > x)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        System.out.println(compare(a, b));
        System.out.println(compare(a, c));
        System.out.println(compare(a, d));
        System.out.println(compare(a, e));
    }
}