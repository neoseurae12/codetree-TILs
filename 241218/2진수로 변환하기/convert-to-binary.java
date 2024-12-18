import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] digits = new int[20];
        int index = 0;

        while (true) {
            if (n < 2) {
                digits[index] = n;
                break;
            }

            digits[index] = n % 2;
            n /= 2;
            index++;
        }

        for (int i = index; i >= 0; i--) {
            System.out.print(digits[i]);
        }
    }
}
