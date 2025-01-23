import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static int n, m;
    public static String str;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        str = sc.next();

        LinkedList<Character> l = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            l.add(str.charAt(i));
        }
        // c - o - d - e - t

        // 처음 위치: 맨 마지막
        ListIterator<Character> it = l.listIterator(l.size());
        for (int i = 0; i < m; i++) {
            // 입력: 명령어
            char command = sc.next().charAt(0);

            // Case 1: L
                // 만약 앞쪽으로 갈 수 있다면 -> 앞쪽으로 위치 변경
            if (command == 'L') {
                if (it.hasPrevious())
                    it.previous();
            }
            // Case 2: R
                // 만약 뒷쪽으로 갈 수 있다면 -> 뒷쪽으로 위치 변경
            else if (command == 'R') {
                if (it.hasNext())
                    it.next();
            }
            // Case 3: D
                // 만약 뒷쪽으로 갈 수 있다면 -> 뒷쪽으로 위치 변경 + 제거
            else if (command == 'D') {
                if (it.hasNext()) {
                    it.next();
                    it.remove();
                }
            }
            // Case 4: P &
                // & 문자 추가
            else if (command == 'P') {
                char e = sc.next().charAt(0);

                it.add(e);
            }
        }
        
        it = l.listIterator();
        for (int i = 0; i < l.size(); i++) {
            System.out.print(it.next());
        }
    }
}