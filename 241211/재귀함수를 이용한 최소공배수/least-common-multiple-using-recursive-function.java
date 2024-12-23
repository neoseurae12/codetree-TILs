import java.util.Scanner;

public class Main {
    public static int[] nums;

    public static int gcd(int num1, int num2) {
        // num1 = 15, num2 = 10
        // num1 = 10, num2 = 5
        // num1 = 5, num2 = 0

        int tmp = num1;
        num1 = Math.max(num1, num2);
        num2 = Math.min(tmp, num2);

        if (num2 == 0)
            return num1;
        
        return gcd(num2, num1 % num2);
    }

    public static int lcm(int num1, int num2) {
        int gcd = gcd(num1, num2);
        
        return num1 * num2 / gcd;
    }

    public static int getLcmAll(int idx) {
        if (idx == 1)
            return nums[idx];
        
        // 1번째 ~ (idx - 1)번째 원소의 최소공배수를 구한 결과와
        // 현재 idx 원소의 최소공배수를 구하여 반환한다.
        return lcm(getLcmAll(idx - 1), nums[idx]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력
        int n = sc.nextInt();
        
        nums = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            nums[i] = sc.nextInt();
        }
        
        // 출력
        System.out.println(getLcmAll(n));
    }
}