import java.util.Scanner;

public class Main {
    public static int toDecimal(int binary) {
        String strB = Integer.toString(binary);
        int decimal = 0;
        for (int i = 0; i < strB.length(); i++) {
            int b = (int)strB.charAt(i) - '0';
            decimal = 2 * decimal + b;
        }

        return decimal;
    }

    public static int toBinary(int decimal) {
        int[] digits = new int[20];
        int cnt = 0;

        while (true) {
            if (decimal < 2) {
                digits[cnt] = decimal;
                break;
            }

            digits[cnt++] = decimal % 2;
            decimal /= 2;
        }

        int binary = 0;
        int digit = 1;
        for (int i = 0; i <= cnt; i++) {
            binary += digits[i] * digit;
            digit *= 10;
        }

        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 이진수 -> 십진수
        int d = toDecimal(n);
        // 17배
        d *= 17;
        // 십진수 -> 이진수
        int b = toBinary(d);

        System.out.println(b);
    }
}