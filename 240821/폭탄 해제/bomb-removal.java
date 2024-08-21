import java.util.Scanner;

class Bomb {
    String clearCode;
    char stringColor;
    int seconds;

    public Bomb(String clearCode, char stringColor, int seconds) {
        this.clearCode = clearCode;
        this.stringColor = stringColor;
        this.seconds = seconds;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String clearCode = sc.next();
        char stringColor = sc.next().charAt(0);
        int seconds = sc.nextInt();

        Bomb bomb = new Bomb(clearCode, stringColor, seconds);

        System.out.println("code : " + bomb.clearCode);
        System.out.println("color : " + bomb.stringColor);
        System.out.println("second : " + bomb.seconds);
    }
}