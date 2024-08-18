import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int num = nums[i];
            if (num % 2 != 0 && num % 3 == 0)
                System.out.println(num);
        }
    }
}