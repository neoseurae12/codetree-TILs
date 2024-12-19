import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] digitsOfB = new int[6];
        int index = 0;

        while (true) {
            if (n < b) {
                digitsOfB[index] = n;
                break;
            }

            digitsOfB[index++] = n % b;
            n /= b;
        }

        for (int i = index; i >= 0; i--) {
            System.out.print(digitsOfB[i]);
        }
    }
}