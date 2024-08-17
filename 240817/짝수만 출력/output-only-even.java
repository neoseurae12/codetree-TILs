import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int a, b;

        // 입력
        a = sc.nextInt();
        b = sc.nextInt();

        // 출력
        for (int i = a; i <= b; i += 2)
            System.out.print(i + " ");
    }
}