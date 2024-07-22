import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int waterTemperature = sc.nextInt();

        String result;

        if (waterTemperature < 0) {
            result = "ice";
        } else if (waterTemperature >= 100) {
            result = "vapor";
        } else {
            result = "water";
        }

        System.out.println(result);
    }
}