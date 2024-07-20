import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.useDelimiter("\\."); // 정규 표현식에서 마침표 그 자체를 의미하려면 \\. 로 써야 한다.

        int yyyy = sc.nextInt();
        int mm = sc.nextInt();
        int dd = sc.nextInt();

        System.out.printf("%d-%d-%d", mm, dd, yyyy);
    }
}