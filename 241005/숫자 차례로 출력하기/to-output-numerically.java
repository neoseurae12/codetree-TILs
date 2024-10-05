import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        printAscending(N);
        System.out.println();
        printDescending(N);
    }

    public static void printAscending(int n) {
        if (n == 0)
            return;
        
        printAscending(n-1);
        System.out.print(n + " ");
    }

    public static void printDescending(int n) {
        if (n == 0)
            return;
        
        System.out.print(n + " ");
        printDescending(n-1);
    }
}