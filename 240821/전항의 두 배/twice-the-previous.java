import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A1, A2;
        A1 = sc.nextInt();
        A2 = sc.nextInt();

        int[] arr = new int[10];
        arr[0] = A1;
        arr[1] = A2;

        for (int i = 2; i < 10; i++)
            arr[i] = arr[i - 1] + 2 * arr[i - 2];

        for (int i = 0; i < 10; i++)
            System.out.print(arr[i] + " ");
    }
}