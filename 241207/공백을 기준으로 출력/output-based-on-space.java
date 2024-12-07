import java.util.Scanner;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 2; i++) {
            String str = sc.nextLine();
            // next() != nextLine()
                // next() => '스페이스' 단위
                // nextLine() => '개행문자(\n)' 단위

            sb.append(str.replaceAll(" ", ""));
        }

        System.out.println(sb);
    }
}