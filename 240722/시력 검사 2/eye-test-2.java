import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sightAvg = sc.nextDouble();

        String result;

        if (sightAvg >= 1.0) {
            result = "High";
        } else if (sightAvg >= 0.5) {
            result = "Middle";
        } else {
            result = "Low";
        }

        System.out.println(result);
    }
}