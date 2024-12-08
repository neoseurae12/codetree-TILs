import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        
        int idx;
        if (str.length() % 2 == 0)
            idx = str.length() - 1;
        else
            idx = str.length() - 2;

        for (int i = idx; i >= 0; i -= 2)
            System.out.print(str.charAt(i));
    }
}