import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean areAllMultiplesOf3 = true;

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();

            if (num % 3 != 0) {
                areAllMultiplesOf3 = false;
                break;
            }
        }

        if (areAllMultiplesOf3)
            System.out.println(1);
        else
            System.out.println(0);
    }
}