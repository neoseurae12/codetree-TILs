import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i = 0; i < 3; i++) {
            String str = sc.next();

            if (str.length() < min)
                min = str.length();
            
            if (str.length() > max)
                max = str.length();
        }

        System.out.println(max - min);
    }
}