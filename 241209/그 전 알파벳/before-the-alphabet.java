import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);
        char result;

        if (ch == 'a')
            result = 'z';
        else
            result = (char)((int)ch - 1);

        System.out.println(result);
    }
}