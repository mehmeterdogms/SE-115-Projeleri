import java.util.Random;
// 2d dizilerin yazımını (Scores) 7. haftanın lecture'ında görmedik bu nedenle  internetten öğrenip yapmış bulunmaktayım saygılarımla.


public class Bonus {
    public static void main(String[] args) {

        int[][] scores = new int[5][4];
        Random rn = new Random();

        int i = 0;
        while (i < 5) {

            int j = 0;
            while (j < 4) {

                scores[i][j] = rn.nextInt(101);

                j = j + 1;
            }

            i = i + 1;
        }

        int a = 0;
        while (a < 5) {
            int b = 0;
            while (b < 4) {
                System.out.print(scores[a][b] + " ");
                b = b + 1;
            }
            System.out.println();
            a = a + 1;
        }

        System.out.println("Student averages:");

        int g = 0;
        while (g < 5) {
            int sum = 0;
            int q = 0;
            while (q < 4) {
                sum = sum + scores[g][q];
                q = q + 1;
            }
            double avge = sum / 4.0;
            System.out.println(avge);
            g = g + 1;
        }

        System.out.println("Quiz averages:");

        int quiz = 0;
        while (quiz < 4) {
            int sum = 0;
            int st = 0;

            while (st < 5) {
                sum = sum + scores[st][quiz];
                st = st + 1;
            }

            double avg = sum / 5.0;
            System.out.println(avg);

            quiz = quiz + 1;
        }

        int max = -1;
        int maxi = 0;
        int maxj = 0;

        int x = 0;
        while (x < 5) {
            int y = 0;
             while (y < 4) {

                if (scores[x][y] > max) {
                    max = scores[x][y];
                    maxi = x;
                    maxj = y;
                }

                y++;
             }
              x++;
        }

        System.out.println("Highest: " + max + " at (" + maxi + " , " +  maxj + ")");
    }
}


