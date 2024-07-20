import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.useDelimiter("-");

        String former = sc.next();
        String latter = sc.next();

        System.out.print(former + latter);
    }
}