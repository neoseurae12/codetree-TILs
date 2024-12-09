import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] commands = sc.next().toCharArray();
        
        int cntL = 0;
        int cntR = 0;
        for (int i = 0; i < commands.length; i++) {
            if (commands[i] == 'L')
                cntL++;
            else if (commands[i] == 'R')
                cntR++;
        }

        char resultDir = cntL > cntR ? 'L' : 'R';
        int resultCnt = Math.abs(cntL - cntR);
        
        String result;
        if (resultDir == 'L') {
            String tail = str.substring(0, resultCnt);
            String body = str.substring(resultCnt);
            result = body + tail;
        } else {    // 'R'
            String head = str.substring(str.length() - resultCnt);
            String body = str.substring(0, str.length() - resultCnt);
            result = head + body;
        }

        System.out.println(result);
    }
}