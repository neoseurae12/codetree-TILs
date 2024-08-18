import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d, e;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();

        if (a % 3 == 0 && 
            b % 3 == 0 && 
            c % 3 == 0 && 
            d % 3 == 0 && 
            e % 3 == 0
        )
            System.out.println(1);
        else
            System.out.println(0);
    }
}