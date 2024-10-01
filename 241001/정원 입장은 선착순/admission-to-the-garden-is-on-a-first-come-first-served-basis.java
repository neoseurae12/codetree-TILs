import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.PriorityQueue;

// 0
// (10, 17), 27 = 0     // (20, 50), (25, 3)
// -> (25, 3), 30 = 2   // (20, 50)
// -> (20, 50), 80 = 10 
// -> (100, 10), 110 = 0 
// -> (105, 30), 140 = 5

// 0
// (2, 6), 8 = 0    // (4, 2), (5, 3), (8, 2)
// (5, 3), 11 = 3   // (4, 2) (5, 3), (9, 5)
// (9, 5), 16 = 6   // (4, 2) (5, 3)
// (5, 3), 19 = 11  // (4, 2)
// (4, 2), 21 = 15

class Visitor {
    int ticketNumber;
    int arrivalTime, stayingTime;
    int waitingTime = 0;

    public Visitor(int ticketNumber, int arrivalTime, int stayingTime) {
        this.ticketNumber = ticketNumber;
        this.arrivalTime = arrivalTime;
        this.stayingTime = stayingTime;
    }
}

public class Main {

    public static int n;

    // 도착한 순서대로
    public static PriorityQueue<Visitor> pq = new PriorityQueue<>((v1, v2) -> {
        return v1.arrivalTime - v2.arrivalTime;
    });
    // 번호표의 숫자가 작은대로
    public static PriorityQueue<Visitor> waiting = new PriorityQueue<>((v1, v2) -> {
        return v1.ticketNumber - v2.ticketNumber;
    });

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int arrivalTime = Integer.parseInt(st.nextToken());
            int stayingTime = Integer.parseInt(st.nextToken());

            pq.add(new Visitor(i, arrivalTime, stayingTime));
        }

        int maxWaitingTime = observeGarden();

        System.out.println(maxWaitingTime);
    }

    public static int observeGarden() {
        int now = 0;
        int maxWaitingTime = 0;

        while (!pq.isEmpty() || !waiting.isEmpty()) {
            // 제시간에 들어가는 경우
            if (!pq.isEmpty() && now <= pq.peek().arrivalTime && waiting.isEmpty()) {
                Visitor earlyBird = pq.poll();
                now = earlyBird.arrivalTime + earlyBird.stayingTime;
            }
            // 기다렸다가 들어가는 경우
            else {
                // 대기자 쌓임
                while (!pq.isEmpty() && now > pq.peek().arrivalTime) {
                    waiting.add(pq.poll());
                }
                // 대기자 한 명 들여보냄
                if (!waiting.isEmpty()) {
                    Visitor waiter = waiting.poll();
                    waiter.waitingTime = now - waiter.arrivalTime;
                    now += waiter.stayingTime;

                    if (waiter.waitingTime > maxWaitingTime)
                        maxWaitingTime = waiter.waitingTime;
                }
            }
        }

        return maxWaitingTime;
    }
}