import java.util.Random;

public class BonusFor {

    public static void main(String[] args) {

        int[][] scores = new int[5][4];
        Random rn = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                scores[i][j] = rn.nextInt(101);
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Student averages:");

        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum = sum + scores[i][j];
            }
            double avge = sum / 4.0;
            System.out.println(avge);
        }

        System.out.println("Quiz averages:");

        for (int j = 0; j < 4; j++) {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum = sum + scores[i][j];
            }
            double avg = sum / 5.0;
            System.out.println(avg);
        }

        int max = -1;
        int maxi = 0;
        int maxj = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (scores[i][j] > max) {
                    max = scores[i][j];
                    maxi = i;
                    maxj = j;
                }
            }

        }


        System.out.println("Highest: " + max + " at (" + maxi + " , " + maxj + ")");


    }


}
