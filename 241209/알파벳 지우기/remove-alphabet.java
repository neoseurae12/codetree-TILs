import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        str1 = str1.replaceAll("[^0-9]", "");
        str2 = str2.replaceAll("[^0-9]", "");

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        System.out.println(num1 + num2);
    }
}