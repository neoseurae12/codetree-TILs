import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Point implements Comparable<Point> {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point p) {
        int distanceA = Math.abs(this.x) + Math.abs(this.y);
        int distanceB = Math.abs(p.x) + Math.abs(p.y);
        if (distanceA != distanceB)
            return distanceA - distanceB;
        
        if (this.x != p.x)
            return this.x - p.x;

        return this.y - p.y;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n, m;
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        PriorityQueue<Point> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            pq.add(new Point(x, y));
        }

        while (m-- > 0) {
            Point nearestPoint = pq.poll();
            nearestPoint.x += 2; nearestPoint.y += 2;
            pq.add(nearestPoint);
        }

        Point nearestPoint = pq.poll();
        System.out.println(nearestPoint.x + " " + nearestPoint.y);
    }
}