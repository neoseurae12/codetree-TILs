import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Point implements Comparable<Point> {
    int x, y, distance;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.distance = Math.abs(x) + Math.abs(y);
    }

    @Override
    public int compareTo(Point p) {
        if (this.distance == p.distance) {
            if (this.x == p.x) {
                return this.y - p.y;
            }
            return this.x - p.x;
        }

        return this.distance - p.distance;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n, m;
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        PriorityQueue<Point> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            pq.add(new Point(x, y));
        }

        Point nearestPoint = null;
        while (m-- > 0) {
            nearestPoint = pq.poll();
            Point updatedPoint = new Point(nearestPoint.x + 2, nearestPoint.y + 2); // 새로 만들어서 넣어줘야 distance의 업데이트 역시 발생할 수 있음
            pq.add(updatedPoint);
        }

        nearestPoint = pq.poll();
        System.out.println(nearestPoint.x + " " + nearestPoint.y);
    }
}