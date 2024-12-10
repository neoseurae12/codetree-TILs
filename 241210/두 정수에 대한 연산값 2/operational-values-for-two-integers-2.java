import java.util.Scanner;

public class Main {
    public static int[] getResult(int a, int b) {
        if (a > b) {
            b += 10;
            a *= 2;
        }
        else {
            a += 10;
            b *= 2;
        }

        return new int[]{a, b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] result = getResult(a, b);

        System.out.println(result[0] + " " + result[1]);
    }
}