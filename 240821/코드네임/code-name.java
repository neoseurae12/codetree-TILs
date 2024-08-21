import java.util.Scanner;

class Spy {
    char codeName;
    int score;

    public Spy(char codeName, int score) {
        this.codeName = codeName;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Spy[] spies = new Spy[5];

        for (int i = 0; i < 5; i++) {
            char codeName = sc.next().charAt(0);
            int score = sc.nextInt();

            spies[i] = new Spy(codeName, score);
        }

        Spy lowestScoreSpy = spies[0];
        for (int i = 1; i < 5; i++) {
            if (lowestScoreSpy.score > spies[i].score)
                lowestScoreSpy = spies[i];
        }

        System.out.println(lowestScoreSpy.codeName + " " + lowestScoreSpy.score);
    }
}