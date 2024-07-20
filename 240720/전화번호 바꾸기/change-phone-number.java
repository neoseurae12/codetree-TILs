import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.useDelimiter("-");

        String head = sc.next();
        String xxxx = sc.next();
        String yyyy = sc.next();

        System.out.printf("010-%s-%s", yyyy, xxxx);
    }
}