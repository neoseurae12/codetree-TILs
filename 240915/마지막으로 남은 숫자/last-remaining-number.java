import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            pq.add(-x); // 마이너스 붙여 집어넣기 (오름차순이 아닌 내림차순이 되도록 하기 위함)
        }
        
        while (pq.size() > 1) {
            int num1 = -pq.poll(); int num2 = -pq.poll(); // 마이너스 붙이기 (원래의 숫자로 되돌리기 위함)
            
            // 만약 뽑은 가장 큰 숫자 2개가 동일한 경우 => 새롭게 집어넣지 않음
            if (num1 == num2)
                continue;

            int updatedNum = num1 - num2;
            pq.add(-updatedNum);    // 마이너스 붙여 집어넣기 (내림차순)
        }

        if (pq.size() == 1) {
            // 정확히 하나의 숫자만이 남게 된 경우 => 해당 숫자 출력
            System.out.println(-pq.peek()); // 마이너스 붙이기 (원래대로 되돌리기 위함)
        } else {
            // 아무 숫자도 남지 않게 된 경우 => -1 출력
            System.out.println(-1);
        }
    }
}