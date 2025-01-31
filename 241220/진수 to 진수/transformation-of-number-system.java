import java.util.Scanner;
import java.lang.StringBuilder;

public class Main {
    public static final int MAX_DIGIT = 30;

    public static int a, b;
    public static String n;

    public static int aToDecimal() {
        int decimal = 0;

        // ex) 8진수 7612
        for (int i = 0; i < n.length(); i++)
            decimal = a * decimal + ((int)n.charAt(i) - '0');
        
        return decimal;
    }

    public static String decimalToB(int decimal) {
        // ex) 10진수 98764
        int[] digits = new int[MAX_DIGIT];
        int cnt = 0;

        while (true) {
            if (decimal < b) {
                digits[cnt] = decimal;
                break;
            }

            digits[cnt++] = decimal % b;
            decimal /= b;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = cnt; i >= 0; i--) {
            sb.append(digits[i]);
        }

        return sb.toString();
    }

    public static String aToB() {
        // a진수 -> 10진수
        int decimal = aToDecimal();

        // 10진수 -> b진수
        String b = decimalToB(decimal);

        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        n = sc.next();

        // a진수 -> b진수
        String result = aToB();

        System.out.println(result);
    }
}