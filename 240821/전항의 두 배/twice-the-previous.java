import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A1, A2;

        A1 = sc.nextInt();
        A2 = sc.nextInt();

        System.out.print(A1 + " ");
        System.out.print(A2 + " ");

        for (int i = 2; i < 10; i++) {
            int An = A2 + 2 * A1;
            System.out.print(An + " ");
            
            A1 = A2;
            A2 = An;
        }
    }
}