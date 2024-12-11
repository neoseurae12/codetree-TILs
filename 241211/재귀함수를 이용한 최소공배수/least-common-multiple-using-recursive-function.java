import java.util.Scanner;

public class Main {
    public static int[] nums;
    public static int idx = 1;

    public static int findGcd(int num1, int num2) {
        // num1 = 15, num2 = 10
        // num1 = 10, num2 = 5
        // num1 = 5, num2 = 0

        int tmp = num1;
        num1 = num1 > num2 ? num1 : num2;
        num2 = tmp > num2 ? num2 : tmp;

        if (num2 == 0)
            return num1;
        
        return findGcd(num2, num1 % num2);
    }

    public static int findLcm(int num1, int num2) {
        int gcd = findGcd(num1, num2);
        int lcm = num1 * num2 / gcd;
        idx++;

        if (idx < nums.length)
            return findLcm(lcm, nums[idx]);
        return lcm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력
        int n = sc.nextInt();
        
        nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // 로직
        int lcmOfNums;
        if (nums.length == 1)   // 1개의 수밖에 존재하지 않는 경우
            lcmOfNums = nums[0];
        else    // 2개 이상의 수가 존재하는 경우
            lcmOfNums = findLcm(nums[idx-1], nums[idx]);
        
        // 출력
        System.out.println(lcmOfNums);
    }
}