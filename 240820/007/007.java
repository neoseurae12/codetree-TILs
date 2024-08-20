import java.util.Scanner;

class Meeting {
    String secretCode;
    char meetingPoint;
    int time;

    public Meeting(String secretCode, char meetingPoint, int time) {
        this.secretCode = secretCode;
        this.meetingPoint = meetingPoint;
        this.time = time;
    }

    public void printMeeting() {
        System.out.println("secret code : " + secretCode);
        System.out.println("meeting point : " + meetingPoint);
        System.out.println("time : " + time);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String secretCode = sc.next();
        char meetingPoint = sc.next().charAt(0);
        int time = sc.nextInt();

        Meeting meeting = new Meeting(secretCode, meetingPoint, time);
        meeting.printMeeting();
    }
}