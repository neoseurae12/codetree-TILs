import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int b, a;

        // 입력
        b = sc.nextInt();
        a = sc.nextInt();

        // 출력
        for (int i = b; i >= a; i -= 2)
            System.out.print(i + " ");
    }
}