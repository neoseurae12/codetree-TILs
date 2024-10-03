import java.util.Scanner;
import java.util.Arrays;

class Dot implements Comparable<Dot> {
    int x, y;
    int number;

    public Dot(int x, int y, int number) {
        this.x = x;
        this.y = y;
        this.number = number;
    }

    @Override
    public int compareTo(Dot d) {
        int thisManhattanDistance = Math.abs(this.x - 0) + Math.abs(this.y - 0);
        int dManhattanDistance = Math.abs(d.x - 0) + Math.abs(d.y - 0);

        if (thisManhattanDistance == dManhattanDistance)
            return this.number - d.number;

        return thisManhattanDistance - dManhattanDistance;
    }
}

public class Main {

    public static int N;
    public static Dot[] dots;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        dots = new Dot[N];
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int number = i + 1;

            dots[i] = new Dot(x, y, number);
        }

        Arrays.sort(dots);

        for (int i = 0; i < N; i++) {
            System.out.println(dots[i].number);
        }
    }
}