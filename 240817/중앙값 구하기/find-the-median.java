import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int a, b, c;

        // 입력
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        // 출력
        if (a > b) {
            if (b > c)
                System.out.println(b);
            else {
                if (a > c)
                    System.out.println(c);
                else
                    System.out.println(a);
            }
        } else {
            if (a > c)
                System.out.println(a);
            else {
                if (b > c)
                    System.out.println(c);
                else
                    System.out.println(b);
            }
        }
    }
}