import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int decimal = 0;
        char[] binary = sc.next().toCharArray();
        for (char b : binary) {
            decimal = decimal * 2 + Character.getNumericValue(b);
        }

        System.out.println(decimal);
    }
}
