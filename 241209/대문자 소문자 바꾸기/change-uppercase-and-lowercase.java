import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch))
                str = str.substring(0, i) + Character.toLowerCase(ch) + str.substring(i + 1);
            else
                str = str.substring(0, i) + Character.toUpperCase(ch) + str.substring(i + 1);
        }

        System.out.println(str);
    }
}