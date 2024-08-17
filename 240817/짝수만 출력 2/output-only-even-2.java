import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b, a;
        int i;

        b = sc.nextInt();
        a = sc.nextInt();
        i = b;

        while (i >= a) {
            System.out.print(i + " ");
            i -= 2;
        }
    }
}