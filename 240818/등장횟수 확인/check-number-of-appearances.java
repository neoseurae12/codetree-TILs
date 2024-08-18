import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ITERATION = 5;
        int evenNumbers = 0, num;

        while (ITERATION > 0) {
            num = sc.nextInt();

            if (num % 2 == 0)
                evenNumbers++;
            
            ITERATION--;
        }

        System.out.println(evenNumbers);
    }
}